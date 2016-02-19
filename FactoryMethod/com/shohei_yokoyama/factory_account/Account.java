package com.shohei_yokoyama.factory_account;

import com.shohei_yokoyama.factory_framework.Product;

public class Account extends Product {
	
	private String owner;

	Account(String owner) {
		System.out.println("Create account: " + owner);
		this.owner = owner;
	}
	
	public void use() {
		System.out.println("Use account: " + owner);
	}
	public String getOwner() {
		return owner;
	}

}
