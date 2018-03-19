package org.wecancodeit.columbus.ecom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringsConfig {

	@Bean
	public String myOneAndOnlyString() {
		return "shazam";
	}
	
	@Bean
	public String anotherString() {
		return "anotherString";
	}
	
	@Bean
	public String beetlebrox() {
		return "This is the string you are looking for";
	}
	
}
