package com.wipro.accountmicroservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.accountmicroservice.service.Iaccount;
import com.wipro.accountmicroservice.entity.account;
import com.wipro.accountmicroservice.repository.AccountRepository;

@Service
public class AccountServiceImp implements Iaccount {
	
	@Autowired
	AccountRepository repo;
	
	@Autowired
	private RestTemplate  getRestTemplate;

	
	@Override
	public account addAccount(account acc) {
		return repo.save(acc);
		
	}
	
	@Override
	public account getByAid(Long aid) {
		return repo.findById(aid).orElse(null);
	}
	
	@Override
	public List<account> getAllAccounts() {
		return repo.findAll();
	}
	
	
	

}
