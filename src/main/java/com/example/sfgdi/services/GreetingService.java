package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by muhamedsuhail on 06-Feb-2022
 */

@Service
public class GreetingService implements GreetingServiceIfc {

	@Override
	public String sayGreeting() {
		return "Hello World!";
	}

}
