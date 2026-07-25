package com.coforge.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.pms.dto.ProductDTO;
import com.coforge.pms.dto.SupplierDTO;
import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/pms")
public class ProductController {

	private ProductService service;
	private Environment environment;

	@Autowired
	public ProductController(ProductService service, Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}

	@PostMapping("/products")
	public ResponseEntity<String> saveProduct(@Valid @NotNull @RequestBody Product product) {

		ResponseEntity<String> responseEntity = null;
		boolean status = service.saveProduct(product);
		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.save.success"), HttpStatus.CREATED);
		return responseEntity;
	}

	@PutMapping("/products/{pid}")
	public ResponseEntity<String> updateProduct(@Valid @NotNull @PathVariable("pid") int pid,
			@RequestBody Product product) {

		ResponseEntity<String> responseEntity = null;

		boolean status = service.updateProduct(pid, product);

		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.update.success"), HttpStatus.CREATED);

		return responseEntity;
	}

	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteProduct(@Valid @NotNull @PathVariable("pid") int pid) {

		ResponseEntity<String> responseEntity = null;

		boolean status = service.deleteProductById(pid);

		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.CREATED);

		return responseEntity;
	}

	@GetMapping("/products/{pid}")
	public ResponseEntity<?> findByPid(@PathVariable("pid") int pid) {

		ResponseEntity<?> responseEntity = null;
		Optional<Product> product = service.findByPid(pid);

		if (product.isPresent())
			responseEntity = new ResponseEntity<>(product.get(), HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/products")
	public ResponseEntity<?> findAllProducts() {

		ResponseEntity<?> responseEntity = null;

		Iterable<Product> products = service.findAllProducts();

		responseEntity = new ResponseEntity<>(products, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/products/pname/{pname}")
	public ResponseEntity<?> findByPname(@PathVariable("pname") String pname) {

		ResponseEntity<?> responseEntity = null;
		List<Product> products = service.findByproductName(pname);

		responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

		return responseEntity;
	}

	@DeleteMapping("/products/pname/{pname}")
	public ResponseEntity<?> deleteByPname(@Valid @NotNull @PathVariable("pname") String pname) {

		ResponseEntity<?> responseEntity = null;
		boolean status = service.deleteByProductName(pname);

		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/products/price/{minPrice}/{maxPrice}")
	public ResponseEntity<?> findByPriceRange(@PathVariable("minPrice") int minPrice,
			@PathVariable("maxPrice") int maxPrice) {

		ResponseEntity<?> responseEntity = null;

		List<Product> products = service.findByPriceRange(minPrice, maxPrice);

		responseEntity = new ResponseEntity<>(products, HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/products/pids")
	public ResponseEntity<?> getPidsList() {

		ResponseEntity<?> responseEntity = null;

		List<Integer> pids = service.getproductIdsList();

		responseEntity = new ResponseEntity<>(pids, HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/products/info")
	public ResponseEntity<?> getInfo() {

		ResponseEntity<?> responseEntity = null;
		String info = service.getInfo();

		responseEntity = new ResponseEntity<>(info, HttpStatus.OK);

		return responseEntity;
	}

	// Rest end points for feign client department
	@GetMapping("/products/suppliers/{sid}")
	public ResponseEntity<?> findSupplierById(@PathVariable int sid) {
		ResponseEntity<?> responseEntity = null;
		SupplierDTO supplier = service.findSupplierById(sid);
		if (supplier != null)
			responseEntity = new ResponseEntity<>(supplier, HttpStatus.OK);
		else
			responseEntity = new ResponseEntity<>("FAILED : Supplier Not Found", HttpStatus.BAD_REQUEST);
		return responseEntity;
	}

	@GetMapping("/products/suppliers")
	public ResponseEntity<List<SupplierDTO>> findAllDepartments() {
		ResponseEntity<List<SupplierDTO>> responseEntity = null;
		List<SupplierDTO> departments = service.findAllSuppliers();

		responseEntity = new ResponseEntity<>(departments, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/products/{pid}/suppliers")
	public ResponseEntity<ProductDTO> findEmployeeDetails(@PathVariable("pid") int pid) {
		ResponseEntity<ProductDTO> responseEntity = null;

		ProductDTO supplierDto = new ProductDTO();

		Product product = service.findByPid(pid).get();
		SupplierDTO supplier = service.findSupplierById(product.getSupplierId());
		supplierDto.setProduct(product);
		supplierDto.setSupplier(supplier);

		responseEntity = new ResponseEntity<>(supplierDto, HttpStatus.OK);

		return responseEntity;
	}

}