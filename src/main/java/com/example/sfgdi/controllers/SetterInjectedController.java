package com.example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.sfgdi.services.GreetingService;

/**
 * Created by muhamedsuhail on 07-Feb-2022
 */

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;
	
	@Qualifier("setterGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
