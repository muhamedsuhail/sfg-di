package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by muhamedsuhail on 06-Feb-2022
 */

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
