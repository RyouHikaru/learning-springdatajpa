package com.tapioca.spring.data;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.tapioca.spring.data.entities.Product;
import com.tapioca.spring.data.repository.ProductRepository;

@SpringBootTest
class ApplicationTest {

	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		
//		Save a product
//		Product product = new Product();
//		product.setId(1L);
//		product.setName("Mac");
//		product.setDescription("New Mac in the house");
//		product.setPrice(1000D);
//		
//		repository.save(product);
		
//		Find one by ID
//		Optional<Product> optional = repository.findById(1L);
//		
//		if (optional.isPresent()) {
//			Product product = optional.get();
//			System.out.println(product);
//			
//			product.setPrice(1500D);
//			repository.save(product);
//		}
		
//		Find all and print price
//		repository.findAll().forEach(p -> {
//			System.out.println(p.getPrice());
//		});
		
//		System.out.println(repository.findByName("Mac"));
//		System.out.println(repository.findByPrice(1500D));
		System.out.println(repository.findByNameAndPrice("Mac", 1500D));
	}

}
