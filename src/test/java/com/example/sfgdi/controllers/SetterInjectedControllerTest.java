package com.example.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.GreetingService;

/**
 * Created by muhamedsuhail on 07-Feb-2022
 */

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingService());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
