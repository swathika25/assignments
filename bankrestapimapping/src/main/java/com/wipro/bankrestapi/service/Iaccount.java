package com.wipro.bankrestapi.service;

import java.util.List;

import com.wipro.bankrestapi.entity.account;

public interface Iaccount {
	
	public account addAccount(account acc);
	
	public  account updateAccount(account acc);
	
	public account getByAid(Long aid);
	
	public void deleteByAid(Long aid);
	
	public List<account> getAllAccounts();


}
