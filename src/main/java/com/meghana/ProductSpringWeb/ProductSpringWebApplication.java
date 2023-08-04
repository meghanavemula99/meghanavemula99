package com.meghana.ProductSpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringWebApplication {
	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(ProductSpringWebApplication.class, args);
		
	}

}
