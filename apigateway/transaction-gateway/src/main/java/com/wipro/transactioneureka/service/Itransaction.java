package com.wipro.transactioneureka.service;

import java.util.List;

import com.wipro.transactioneureka.entity.transaction;

public interface Itransaction {

	
	transaction addTransaction(transaction tns);
	
	transaction getById(Long id);
	
	List<transaction> getAllTransactions();
	
	void deleteTransaction(Long id);
}
