package org.wecancodeit.columbus.ecom.catalog;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Product {

	// @Id
	// @GeneratedValue
	// private long id;
	//
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
