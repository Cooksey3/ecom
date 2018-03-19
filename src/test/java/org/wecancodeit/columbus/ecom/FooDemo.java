package org.wecancodeit.columbus.ecom;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class FooDemo implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Resource
	private Foo injectedFoo;

	@Override
	public void run(String... args) throws Exception {
		log.info("foo is " + injectedFoo);
	}

}
