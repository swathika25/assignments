package com.wipro.bankrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankrestapi.entity.transaction;
import com.wipro.bankrestapi.repository.TransactionRepository;

@Service
public class TransactionServiceImp implements Itransaction{
	
	@Autowired
	TransactionRepository repo2;

	@Override
	public transaction addTransaction(transaction tns) {
		return repo2.save(tns);
	}

	@Override
	public transaction updateTransaction(transaction tns) {
		return repo2.save(tns);
	}

	@Override
	public transaction getByTid(Long tid) {
		return repo2.findById(tid).orElse(null);
	}

	@Override
	public void deleteByTid(Long tid) {
		repo2.deleteById(tid);;
	}

	@Override
	public List<transaction> getAllTransactions() {
		return repo2.findAll();
	}

}
