package cibrary.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import cibrary.fbo.PersonFBO;
import cibrary.model.Person;
import cibrary.repository.PersonRepository;

@Controller
public class PersonController {
	
	private final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	private PersonRepository personRepository = new PersonRepository();

	@RequestMapping(method=RequestMethod.GET, value="/person/opprett")
	public String visSide(Model model) {
		model.addAttribute("personfbo", new PersonFBO());
		return "/WEB-INF/views/person/opprettPerson.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/person/opprett")
	public String opprettPerson(@Valid @ModelAttribute("personfbo") PersonFBO personfbo, BindingResult result, RedirectAttributes redirectAttr, HttpServletRequest req) {
		if (result.hasErrors()) {
			return "/WEB-INF/views/person/opprettPerson.jsp";
		}
		personRepository.lagre(personfbo.getPerson());
		redirectAttr.addFlashAttribute("personnummer", personfbo.getPersonnummer());
		return "redirect:/person/opprettet";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/person/opprettet")
	public String personOpprettet(HttpServletRequest request, Model model) {
		logger.debug("Person opprettet");
		Long personnummer = (Long) RequestContextUtils.getInputFlashMap(request).get("personnummer");
		Person person = personRepository.get(personnummer);
		model.addAttribute("personfbo", new PersonFBO(person));
		return "/WEB-INF/views/person/personOpprettet.jsp";
	}
	
}