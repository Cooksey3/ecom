package org.wecancodeit.columbus.ecom;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Foo {

	@Resource
	private String beetlebrox;

	@Override
	public String toString() {
		return "Foo [beetlebrox=" + beetlebrox + "]";
	}
	
	
}
