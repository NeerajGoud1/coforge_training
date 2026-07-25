package com.coforge.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "tbl_product")
public class Product {

	@Id
	@NotNull
	@Column(name = "productId")
	private int productId;

	@Column(name = "productName")
	@NotBlank
	private String productName;

	@Column(name = "productPrice")
	@Positive
	private int productPrice;

	@Column(name = "supplierId")
	@NotNull
	private long supplierId;

	public Product() {
		super();
	}

	public Product(@NotNull int productId, @NotBlank String productName, @Positive int productPrice,
			@NotNull int supplierId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.supplierId = supplierId;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public long getSupplierId() {
		return  supplierId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", supplierId=" + supplierId + "]";
	}

}