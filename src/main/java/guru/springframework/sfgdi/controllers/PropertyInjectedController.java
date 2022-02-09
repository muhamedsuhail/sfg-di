package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceIfc;

/**
 * Created by muhamedsuhail on 06-Feb-2022
 */

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyGreetingService")
	@Autowired
	public GreetingServiceIfc greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
