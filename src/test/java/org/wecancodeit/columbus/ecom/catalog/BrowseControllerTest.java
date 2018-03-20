package org.wecancodeit.columbus.ecom.catalog;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.wecancodeit.columbus.ecom.catalog.BrowseController;
import org.wecancodeit.columbus.ecom.catalog.Product;

public class BrowseControllerTest {

	@Test
	public void shouldgetProducts() {
		BrowseController underTest = new BrowseController();

		Collection<Product> result = underTest.getProducts();

		assertThat(result, hasSize(greaterThan(0)));
	}
	
	@Test
	public void shouldGetAnIndividualProduct() {
		BrowseController underTest = new BrowseController();

		Product result = underTest.getProduct(42L);
		
		assertThat(result, is(not(nullValue())));
		
	}
}
