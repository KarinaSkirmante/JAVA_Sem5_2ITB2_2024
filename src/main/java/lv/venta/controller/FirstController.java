package lv.venta.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lv.venta.model.Product;

@Controller
public class FirstController {

	@GetMapping("/hello")//localhost:8080/hello
	public String getHello() {
		System.out.println("First Controller!!!");
		return "hello-page"; //tiek parādīta hello-page.html lapa
		
	}
	
	@GetMapping("/hello/msg")//localhost:8080/hello/msg
	public String getHelloMsg(Model model) {
		System.out.println("Msg controller is called");
		model.addAttribute("mydata", "Ziņa no JAVA Spring!!!!");
		return "hello-msg-page";//tiek parādīta hello-msg-page.html lapa
	}
	
	@GetMapping("/product/test")//localhost:8080/product/test
	public String getProductTest(Model model) {
		Product tempProduct = new Product("Abols", "Sarkans", 0.99f, 5);
		model.addAttribute("mydata", tempProduct);
		return "product-one-show-page";//tiek parādīta product-one-show-page.html lapa
	}
	

	@GetMapping("/product/all") //localhost:8080/product/all
	public String getProductAll(Model model) {
		
		Product tempProduct1 = new Product("Abols", "Sarkans", 0.99f, 5);
		Product tempProduct2 = new Product("Zemene", "Salda", 1.99f, 50);
		Product tempProduct3 = new Product("Burkans", "Oranžš", 0.39f, 500);
			
		ArrayList<Product> allProducts = new ArrayList<>(
				Arrays.asList(tempProduct1, tempProduct2, tempProduct3));
		
		model.addAttribute("mydata", allProducts);
		return "product-all-show-page";//tiek parādīta product-all-show-page.html lapa

		
	}
	
	
	
	
	
	
	
	
}
