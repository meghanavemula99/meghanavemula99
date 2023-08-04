package com.meghana.ProductSpringWeb;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	Productdb db;

	public List<Product> getallproducts() {
		// TODO Auto-generated method stub
		return db.findAll();
	}
	public Product getproduct(String name )
	{
		return db.findByName(name);
	}
	public void addproduct(Product p)
	{
		db.save(p);
	}

}
