package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by muhamedsuhail on 09-Feb-2022
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingServiceIfc {

	@Override
	public String sayGreeting() {
		return "Primary Bean : Hello World!";
	}

}
