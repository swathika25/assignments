package com.wipro.accountmicroservice.service;

import java.util.List;


import com.wipro.accountmicroservice.entity.account;


public interface Iaccount {
	
public account addAccount(account acc);
	
	public account getByAid(Long aid);
	
	public List<account> getAllAccounts();
	
	

}
