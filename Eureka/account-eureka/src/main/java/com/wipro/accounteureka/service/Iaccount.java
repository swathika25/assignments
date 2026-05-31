package com.wipro.accounteureka.service;

import java.util.List;

import com.wipro.accounteureka.entity.account;

public interface Iaccount {
	
	account addAccount(account acc);
	account getById(Long id);
	List<account> getAllAccounts();
    void deleteAccount(Long id);
}
