package com.meghana.ProductSpringWeb;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping("/Products")
public List<Product> getallproducts()
{
	return service.getallproducts();
}
	/*@GetMapping("/Product/apple")
	Public Product getproduct(String name)
	{
		return service.getproduct("apple");
	}*/
	
	@GetMapping("/Product/{name}")
	public Product getproduct(@PathVariable String name)
	{
		return service.getproduct(name);
	}
	@PostMapping("/Product")
	public void addProduct(@RequestBody Product P)
	{
	service.addproduct(P);	
	}
}


