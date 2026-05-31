package com.wipro.transactioneureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.transactioneureka.entity.transaction;
import com.wipro.transactioneureka.repository.TransactionRepository;

@Service
public class TransactionServiceImp implements Itransaction{
	
	@Autowired
	private TransactionRepository repo2;
	
	
	@Override
	public transaction addTransaction(transaction tns) {
	      return repo2.save(tns);
	}

	@Override
	public transaction getById(Long id) {
		return repo2.findById(id).orElse(null);
		
	}

	@Override
	public List<transaction> getAllTransactions() {
		
		return repo2.findAll();
	}

	@Override
	public void deleteTransaction(Long id) {
		repo2.deleteById(id);
		
		
	}
}
