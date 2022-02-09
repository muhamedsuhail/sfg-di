package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceIfc;

/**
 * Created by muhamedsuhail on 07-Feb-2022
 */

@Controller
public class SetterInjectedController {
	private GreetingServiceIfc greetingService;
	
	@Qualifier("setterGreetingService")
	@Autowired
	public void setGreetingService(GreetingServiceIfc greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
