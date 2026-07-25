package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.pms.dto.SupplierDTO;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;
import com.coforge.pms.service.client.SupplierClient;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepo productRepo;
	Environment environment;
	SupplierClient client;

	@Autowired
	public ProductServiceImpl(ProductRepo productRepo, Environment environment, SupplierClient client) {
		super();
		this.productRepo = productRepo;
		this.environment = environment;
		this.client = client;
	}

	@Override
	public boolean saveProduct(Product product) {

		productRepo.save(product);
		return true;
	}

	@Override
	public boolean updateProduct(int productId, Product product) {

		if (!productRepo.existsById(productId))
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		productRepo.save(product);
		return true;
	}

	@Override
	public boolean deleteProductById(int productId) {

		if (!productRepo.existsById(productId))
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		productRepo.deleteById(productId);
		return true;
	}

	@Override
	public Optional<Product> findByPid(int productId) {
		if (!productRepo.existsById(productId)) {
			throw new ProductNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		Optional<Product> employee = productRepo.findById(productId);
		return employee;
	}

	@Override
	public Iterable<Product> findAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public List<Product> findByproductName(String productName) {

		List<Product> products = productRepo.findByproductName(productName);
		if (products.isEmpty())
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		return products;
	}

	@Override
	@Transactional
	public boolean deleteByProductName(String productName) {

		int n = productRepo.deleteByproductName(productName);
		if (n == 0) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return true;
	}

	@Override
	public List<Product> findByPriceRange(int minPrice, int maxPrice) {

		List<Product> products = productRepo.findByproductPriceBetween(minPrice, maxPrice);
		if (products.isEmpty()) {
			throw new ProductNotFoundException(environment.getProperty("pms.invalid.product-notfound"));
		}
		return products;
	}

	@Override
	public List<Integer> getproductIdsList() {
		return productRepo.getproductIdsList();
	}

	@Override
	public String getInfo() {
		return productRepo.getInfo();
	}

	// supplier methods
	@Override
	public SupplierDTO findSupplierById(long sid) {
		SupplierDTO supplier = client.findSupplierById(sid);
		return supplier;
	}

	@Override
	public List<SupplierDTO> findAllSuppliers() {
		List<SupplierDTO> suppliers = client.findAllSuppliers();
		return suppliers;
	}


}