package org.wecancodeit.columbus.ecom.catalog;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PartyTimePop implements CommandLineRunner {

	@Resource
	private ProductRepository productRepo;

	@Resource
	private CartRepository cartRepo;

	@Override
	public void run(String... args) throws Exception {

		Product dillPickles = productRepo.save(new Product("Dill Pickles", 0));
		Product handBags = productRepo.save(new Product("Gucci", 0));

		Cart cart = new Cart("go");
		cart = cartRepo.save(cart);
	}

}