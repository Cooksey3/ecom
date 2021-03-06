package org.wecancodeit.columbus.ecom;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.wecancodeit.columbus.ecom.catalog.Product;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ContainerRestTests {

	@Resource
	private TestRestTemplate restTemplate;

	@Test
	public void shouldGetProducts() {
		ResponseEntity<String> response = restTemplate.getForEntity("/products", String.class);

		HttpStatus status = response.getStatusCode();

		assertThat(status, is(HttpStatus.OK));
	}

	@Test
	public void shouldCreateProduct() {
		Product product = new Product("my new product", 0);

		ResponseEntity<Product> created = restTemplate.postForEntity("/products", product, Product.class);

		assertThat(created.getBody().getId(), is(greaterThan(0L)));
	}

}