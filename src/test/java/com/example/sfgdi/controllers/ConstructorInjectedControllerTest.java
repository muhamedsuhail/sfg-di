package com.example.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.sfgdi.services.GreetingService;

/**
 * Created by muhamedsuhail on 07-Feb-2022
 */

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new GreetingService());
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
