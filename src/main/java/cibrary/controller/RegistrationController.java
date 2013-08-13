package cibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cibrary.model.Book;

@Controller
@RequestMapping(value = "/book")
public class RegistrationController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		Book book = new Book();
		book.setAuthor("Book 1");
		model.addAttribute("BOOK", book);
		return "/WEB-INF/views/RegisterNewBook.jsp";
	}

}
