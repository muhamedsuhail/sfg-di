package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingServiceIfc;

/**
 * Created by muhamedsuhail on 09-Feb-2022
 */

@Controller
public class I18nController {

	private final GreetingServiceIfc greetingService;

	public I18nController(@Qualifier("i18nService")GreetingServiceIfc greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
