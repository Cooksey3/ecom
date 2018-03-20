package org.wecancodeit.columbus.ecom.catalog;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@SuppressWarnings("unused")
	private Product() {
	}

	private String name;

	public Product(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
