package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.model.Product;
import com.starter.repo.ProductRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		Product p = repo.save(new Product("A", 3.5));
		System.out.println(p.getProdId());
		repo.save(new Product("B", 4.5));
		repo.save(new Product("C", 5.5));
	}

}
