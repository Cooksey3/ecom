package org.wecancodeit.columbus.ecom.catalog;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import ch.qos.logback.core.status.Status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CatalogMvcTest {
	
	@Resource
	private MockMvc mvc;
	
	@Test
	public void shouldRetrieveProducts() throws Exception {
		mvc.perform(get("/products")).andExpect(status().isOk());
		
	}
}
