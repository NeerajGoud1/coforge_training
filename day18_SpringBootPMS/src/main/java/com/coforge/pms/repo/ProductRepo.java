package com.coforge.pms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.pms.model.Product;

//SpringIOC is responsible for implementation   // jpa is for generic 
//public interface ProductRepo extends JpaRepository<Product, Integer>{ // same as DAO 

//crud is for specific
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> { // same as DAO

	public List<Product> findByproductName(String productName);

	public int deleteByproductName(String productName);

	@Query("select count(*), sum(productPrice) from Product")
	public String getInfo();

}
