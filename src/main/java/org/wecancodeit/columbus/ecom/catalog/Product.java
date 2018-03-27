package org.wecancodeit.columbus.ecom.catalog;

import java.math.BigDecimal;

public class Product {

	private BigDecimal price;
	private String productName;

	public BigDecimal getPrice() {
		return price;
	}

	public Product(BigDecimal price) {
		this.price = price;
	}
	
	public Product(String productName, String price) {
		this(new BigDecimal(price));
		this.productName = productName;
	}

	public String getItemName() {
		return productName;
	}
}