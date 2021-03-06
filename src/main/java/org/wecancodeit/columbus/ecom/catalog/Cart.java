package org.wecancodeit.columbus.ecom.catalog;

import static java.math.BigDecimal.valueOf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Cart {

	private ArrayList<CartItem> cartItems = new ArrayList<>();

	public void addProduct(Product toAdd, int quantity) {
		cartItems.add(new CartItem(toAdd, quantity));
	}

	public boolean contains(Product product) {
		for (CartItem item : cartItems) {
			if (item.isAssociatedWith(product)) {
				return true;
			}
		}
		return false;
	}

	public BigDecimal getTotalPrice() {
		BigDecimal total = new BigDecimal("0.00");
		for (CartItem item : cartItems) {
			BigDecimal quantityAsBd = valueOf(item.getQuantity());
			BigDecimal itemPrice = item.getUnitPrice().multiply(quantityAsBd);
			total = total.add(itemPrice);
		}
		return total;
	}

	public void clearCart() {
		cartItems.clear();
	}

	public void removeItem(Product product) {
		for (CartItem item : cartItems) {
			if (item.isAssociatedWith(product)) {
				cartItems.remove(item);
			}
		}
	}

	public void removeSpecifiedQuantityOfItems(Product product, int quantity) {
		for (int i = cartItems.size(); i > 0; i--) {
			CartItem item = cartItems.get(i - 1);
			if (item.isAssociatedWith(product)) {
				int newQuantity = item.getQuantity() - quantity;
				cartItems.remove(item);
				addProduct(product, newQuantity);
			}
		}
	}

}