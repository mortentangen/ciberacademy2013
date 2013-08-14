package cibrary.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping("/helloworld")
    public String helloWorld(ModelMap model) {
        model.addAttribute("message", "Hello World");
        return "/WEB-INF/views/helloworld.jsp";
    }
	
}
