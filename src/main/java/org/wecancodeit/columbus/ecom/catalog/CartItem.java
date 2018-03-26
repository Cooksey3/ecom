package org.wecancodeit.columbus.ecom.catalog;

import java.math.BigDecimal;

public class CartItem {

	private Product product;
	private int quantity;

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public BigDecimal getUnitPrice() {
		return product.getPrice();
	}
	
	public boolean isAssociatedWith(Product product) {
		return getProduct().equals(product);
	}

	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

}