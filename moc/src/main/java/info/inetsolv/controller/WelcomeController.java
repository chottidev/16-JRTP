package info.inetsolv.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@SuppressWarnings("unused")
@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println("WelcomeController object is created");
	}
	
	@RequestMapping(path = "/welcome")
	public String processData() {
		
		System.out.println("we r in processdata()");

		return "one.jsp";
		
	}
	
	
}
