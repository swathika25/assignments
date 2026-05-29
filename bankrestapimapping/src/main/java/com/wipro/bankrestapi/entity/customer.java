package com.wipro.bankrestapi.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
// @Table
public class customer {
	
	@Id
	private Long customerId;
	private String customerName;
	private String email;
	private String phone;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<account>accounts;
	
	public customer() {
		super();
	}
	public customer(Long customerId, String customerName, String email, String phone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	

}
