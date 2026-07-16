package com.coforge.pms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;


@Service
public class ProductService {
	 Map<Integer, Product> products = new HashMap<>();

	public boolean createProduct(Product product) {
		  if (!products.containsKey(product.getProductId())) {
		        products.put(product.getProductId(), product);
		        return true;
		    }

		    return false;
	}

	public boolean updateProduct(Product product) {
	    if (!products.containsKey(product.getProductId())) {
	        return false;
	    }

	    products.put(product.getProductId(), product);
	    return true;
	}

	public boolean deleteProduct(int pid) {
		Product product = null;
		if(products.containsKey(pid))
		 product = products.remove(pid);
		
		if(product != null) return true;
		return false;
	}

	public Product findProduct(int pid) {
		if(products.containsKey(pid)) {
			return products.get(pid);
		}
		return null;
	}

	public List<Product> findALlProduct() {
		
		List<Product> list = new ArrayList<>();
		
		list.addAll(products.values());
		
		return list;
	}

}
