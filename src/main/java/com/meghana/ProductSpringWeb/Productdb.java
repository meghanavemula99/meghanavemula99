package com.meghana.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Productdb extends JpaRepository<Product,Integer>
{
	Product findByName(String name);
	
}
