package com.coforge.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
	

	@RequestMapping("home")
	public ModelAndView loadHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		return mv;
	}
	
	
	
	@RequestMapping( method = RequestMethod.POST, value = "product", params="Insert")
	public ModelAndView createProduct(@ModelAttribute Product product) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");

		String result = "";
		boolean status = service.createProduct(product);

		if (status) {
			result = "SUCCESS : Product Object Saved";
		}else {
			result = "FAILED : Product Object Not Saved";
		}
		return mv.addObject("result", result);
	}
		
		
		@RequestMapping( method = RequestMethod.POST, value = "product", params="Update")
		public ModelAndView updateProduct(@ModelAttribute Product product) {

			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("ProductHome");

			String result = "";
			boolean status = service.updateProduct(product);

			if (status) {
				result = "SUCCESS : Product Object Updated";
			}else {
				result = "FAILED : Product Object Not Updated";
			}
			return mv.addObject("result", result);
		}
		
		
		@RequestMapping( method = RequestMethod.POST, value = "product", params="Delete")
		public ModelAndView deleteProduct(@RequestParam int productId) {
	
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("ProductHome");

			String result = "";
			boolean status = service.deleteProduct(productId);

			if (status) {
				result = "SUCCESS : Product Object Deleted";
			}else {
				result = "FAILED : Product Object Not Deleted";
			}
			return mv.addObject("result", result);
		}
		
		
		
		@RequestMapping( method = RequestMethod.POST, value = "product", params="Find")
		public ModelAndView findProduct(@RequestParam int productId) {
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("ProductHome");

			String result = "";
			Product product = service.findProduct(productId);

			if (product != null) {
				result = "SUCCESS : Product Object Found -> " + product;
			}else {
				result = "FAILED : Product Object Not Found";
			}
			return mv.addObject("result", result);
		}
		
		
		@RequestMapping( method = RequestMethod.POST, value = "product", params="FindAll")
		public ModelAndView findALlProducts( ) {
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("ProductHome");


			List<Product> products = service.findALlProduct();

			return mv.addObject("result", products);
		}


}
