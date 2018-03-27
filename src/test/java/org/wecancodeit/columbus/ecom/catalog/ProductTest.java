package org.wecancodeit.columbus.ecom.catalog;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

//@RunWith(SpringRunner.class)
//@DataJpaTest
public class ProductTest {
	
	@Test
	public void productShouldHavePrice() {
		Product product = new Product("Shoes", "14.5");
		
		BigDecimal price = product.getPrice();
		
		assertThat(price, is(new BigDecimal("14.5")));
	}

	@Test
	public void productShouldHaveProductName() {
		Product product = new Product("Shoes", "14.5");
		
		String name = product.getItemName();
		
		assertThat(name, is("Shoes"));
	}
	
	@Test
	public void productShouldHavePriceAndQuantity() {
		Product product = new Product("Bikes", "14.5");
		
		String name = product.getItemName();
		
		assertThat(name, is("Bikes"));
	}
}
