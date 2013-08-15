package cibrary.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
	
	private final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@RequestMapping("/person")
	public String visSide() {
		return "/WEB-INF/views/person/opprettPerson.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/person/opprett")
	public String opprettPerson(HttpServletRequest req, Model model) {
		String personnummer = req.getParameter("personnummer");
		String fornavn = req.getParameter("fornavn");
		String etternavn = req.getParameter("etternavn");
		logger.debug(personnummer + " - " + fornavn + " - " + etternavn);
		if (StringUtils.isEmpty(personnummer)) {
			model.addAttribute("error", "Personnummer må fylles ut");
			return "person";
		}
		return "redirect:/person/opprettet";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/person/opprettet")
	public String personOpprettet() {
		System.out.println("person opprettet");
		return "/WEB-INF/views/person/personOpprettet.jsp";
	}
	
}