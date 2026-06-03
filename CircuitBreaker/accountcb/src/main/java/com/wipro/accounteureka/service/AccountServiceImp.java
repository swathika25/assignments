package com.wipro.accounteureka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.accounteureka.entity.account;
import com.wipro.accounteureka.repository.AccountRepository;

@Service
public class AccountServiceImp implements Iaccount {
	
	@Autowired
	private AccountRepository repo;

	@Override
	public account addAccount(account acc) {
		return repo.save(acc);
	}

	@Override
	public account getById(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<account> getAllAccounts() {
		
		return repo.findAll();
	}

	@Override
	public void deleteAccount(Long id) {
		repo.deleteById(id);
		
	}
	
	
	

}
