package com.items.Electronic_Product_Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.items.Electronic_Product_Management.Entity.Products;
import com.items.Electronic_Product_Management.Repository.ProductRepo;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/products")
public class ProductCont {
	
	@Autowired
	public ProductRepo productRepo;

	@GetMapping("/all")
	public String getAllProducts(Model model){
		List<Products> products=productRepo.findAll();
		model.addAttribute("products", products);
		return "products/index";
	}
	@GetMapping("/createProduct")
	public String getMethodName(Model model) {
		Products product= new Products();
		model.addAttribute("product",product);
		return "products/CreateProduct" ;
	}
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam int id) {
		Products product=productRepo.findById(id).get();
		productRepo.delete(product);
		return "redirect:/products/all";
	}
	@PostMapping("/createProduct")
	public String createProduct(@ModelAttribute("product") Products product) {
		productRepo.save(product);
		return "redirect:/products/all"; 
	}
	@GetMapping("/edit")
	public String updateProduct(Model model, @RequestParam int id) {
		model.addAttribute("product",productRepo.findById(id).get());
		return "products/EditProduct";
	}
	@PostMapping("/edit")
	public String editProduct(@ModelAttribute("product") Products product) {
		productRepo.save(product);
		return "redirect:/products/all"; 
	}
	
	
	
}
