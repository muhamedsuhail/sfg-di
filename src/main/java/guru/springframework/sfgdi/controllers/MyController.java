package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceIfc;

/**
 * Created by muhamedsuhail on 06-Feb-2022
 */

@Controller
public class MyController {
	private final GreetingServiceIfc greetingService;

	public MyController(GreetingServiceIfc greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}	
}
