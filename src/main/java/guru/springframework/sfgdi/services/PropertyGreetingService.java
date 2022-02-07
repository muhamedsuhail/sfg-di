package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by muhamedsuhail on 06-Feb-2022
 */

@Service
public class PropertyGreetingService implements GreetingServiceIfc {

	@Override
	public String sayGreeting() {
		return "Property : Hello World!";
	}

}
