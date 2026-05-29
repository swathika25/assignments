package com.wipro.bankrestapi.service;

import java.util.List;

import com.wipro.bankrestapi.entity.transaction;

public interface Itransaction {
	
	public transaction addTransaction(transaction tns);
	
	public transaction updateTransaction(transaction tns);
	
	public transaction getByTid(Long tid);
	
	public void deleteByTid(Long tid);
	
	public List<transaction> getAllTransactions();

}
