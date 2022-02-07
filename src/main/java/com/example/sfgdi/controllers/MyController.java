package com.example.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by muhamedsuhail on 06-Feb-2022
 */

@Controller
public class MyController {
	public String sayHello() {
		System.out.println("Hello World!");
		return "Hello";
	}
}
