package com.coforge.pms.dto;

public class SupplierDTO {

	private long supplierId;

	private String supplierName;

	private String city;

	public SupplierDTO() {
		super();
	}

	public SupplierDTO(long supplierId, String supplierName, String city) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.city = city;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public String getCity() {
		return city;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "SupplierDTO [supplierId=" + supplierId + ", supplierName=" + supplierName + ", city=" + city + "]";
	}

}
