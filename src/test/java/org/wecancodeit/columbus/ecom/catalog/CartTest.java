package org.wecancodeit.columbus.ecom.catalog;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class CartTest {

	@Test
	public void cartShouldAddItem() {
		Cart underTest = new Cart();
		Product carrots = new Product("0.0");

		underTest.addProduct(carrots, 1);

		assertThat(underTest.contains(carrots), is(true));
	}

	@Test
	public void emptyCartShouldNotContainItem() {
		Cart underTest = new Cart();
		Product carrots = new Product("0.0");

		assertThat(underTest.contains(carrots), is(false));
	}

	@Test
	public void shouldCalculatePriceForOneItem() {
		Cart underTest = new Cart();
		Product carrots = new Product("4.50");

		underTest.addProduct(carrots, 1);

		assertThat(underTest.getTotalPrice(), is(new BigDecimal("4.50")));
	}

	@Test
	public void shouldCalculatePriceForTwoItems() {
		Cart underTest = new Cart();

		Product carrots = new Product("4.50");
		Product gum = new Product("1.00");
		underTest.addProduct(carrots, 2);
		underTest.addProduct(gum, 1);

		assertThat(underTest.getTotalPrice(), is(new BigDecimal("10.00")));
	}

	@Test
	public void shouldClearCart() {
		Cart underTest = new Cart();

		Product carrots = new Product("4.50");
		Product gum = new Product("1.00");
		underTest.addProduct(carrots, 2);
		underTest.addProduct(gum, 1);

		underTest.clearCart();

		assertThat(underTest.contains(carrots), is(false));
	}

	@Test
	public void shouldRemoveItem() {
		Cart underTest = new Cart();

		Product carrots = new Product("4.50");
		Product gum = new Product("1.00");
		underTest.addProduct(carrots, 2);
		underTest.addProduct(gum, 1);

		underTest.removeItem(carrots);

		assertThat(underTest.contains(carrots), is(false));
		assertThat(underTest.contains(gum), is(true));
	}

}
