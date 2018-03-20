package org.wecancodeit.columbus.ecom.catalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;
	
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