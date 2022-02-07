package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by muhamedsuhail on 06-Feb-2022
 */

@Service
public class ConstructorGreetingService implements GreetingServiceIfc {

	@Override
	public String sayGreeting() {
		return "Constructor : Hello World!";
	}

}
