package com.wipro.bankrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bankrestapi.entity.account;
import com.wipro.bankrestapi.repository.AccountRepository;


@Service
public class AccountServiceImp implements Iaccount {
	
	@Autowired
	AccountRepository repo;

	@Override
	public account addAccount(account acc) {
		return repo.save(acc);
		
	}

	@Override
	public account updateAccount(account acc) {
		return repo.save(acc);
	}

	@Override
	public account getByAid(Long aid) {
		return repo.findById(aid).orElse(null);
	}

	@Override
	public void deleteByAid(Long aid) {
		repo.deleteById(aid);
	}

	@Override
	public List<account> getAllAccounts() {
		return repo.findAll();
	}

}
