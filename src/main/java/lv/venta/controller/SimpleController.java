package lv.venta.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lv.venta.model.Category;
import lv.venta.model.Product;

@Controller
public class SimpleController {
	
	@GetMapping("/simple")//hosthost:8080/simple
	public String getControllerSimple() {
		System.out.println("The simple controller is running");
		return "simple-page"; //will show simple-page.html file
	}
	
	@GetMapping("/data")//localhost:8080/data
	public String getControllerData(Model model) {
		
		System.out.println("The data controller is running ");
		Random random = new Random();
		String myData = "@ Kelvin, " + random.nextInt(2020, 2026);
		
		model.addAttribute("package", myData);
		return "data-page";//will show data-page.html file
	}
	
	@GetMapping("/product")//localhost:8080/product
	public String getControllerProduct(Model model) {
		System.out.println("The product controller is running");
		
		Product productData = 
				new Product(2, "Apple", Category.cellphones, 0.99f, 3, "White");
		
		model.addAttribute("package", productData);
		return "product-page"; //will show product-page.html file
		
	}
	
	@GetMapping("/product")//localhost:8080/product
	public String getControllerAllProduct(Model model) {
		System.out.println("The all product");
		
		Product productData1 = 
				new Product(2, "Apple", Category.cellphones, 0.99f, 3, "White");
		Product productData2 = 
				new Product(2, "16promax", Category.cellphones, 0.99f, 3, "gray");
		Product productData3 = 
				new Product(2, "blackberry", Category.cellphones, 0.99f, 3, "brown");
		
		ArrayList<Product> allproducts = new ArrayList<Product>(Arrays.asList(productData1))
		
	}

}
