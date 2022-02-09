package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by muhamedsuhail on 09-Feb-2022
 */

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingServiceIfc {

	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES ";
	}

}
