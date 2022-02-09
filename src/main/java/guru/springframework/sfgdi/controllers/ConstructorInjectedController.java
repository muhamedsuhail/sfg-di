package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceIfc;

/**
 * Created by muhamedsuhail on 07-Feb-2022
 */

@Controller
public class ConstructorInjectedController {
	private final GreetingServiceIfc greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingServiceIfc greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}	
}
