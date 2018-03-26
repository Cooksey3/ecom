package org.wecancodeit.columbus.ecom.catalog;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

//@RunWith(SpringRunner.class)
//@DataJpaTest
public class CartItemTest {

	@Test
	public void cartItemShouldCalculateTotalPrice() {
		Cart underTest = new Cart();
		CartItem carrots = new CartItem();
		
		underTest.addItem(carrots);
		
		assertThat(underTest.contains(carrots), is(true));
	}
}
