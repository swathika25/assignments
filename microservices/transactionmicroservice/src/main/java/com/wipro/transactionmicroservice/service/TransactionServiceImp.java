package com.wipro.transactionmicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.transactionmicroservice.entity.transaction;
import com.wipro.transactionmicroservice.repository.TransactionRepository;
import com.wipro.transactionmicroservice.vo.accountvo;
import com.wipro.transactionmicroservice.vo.customervo;
import com.wipro.transactionmicroservice.vo.responsetemplatevo;

@Service
public class TransactionServiceImp implements Itransaction{
	
	@Autowired
	TransactionRepository repo2;
	
	@Autowired
	RestTemplate getRestTemplate;
	
	@Override
	public transaction addTransaction(transaction tns) {
		return repo2.save(tns);
	}

	@Override
	public responsetemplatevo getTransactionDetails(Long id) {
		
		transaction tns = repo2.findById(id).orElse(null);
		
		accountvo account = getRestTemplate.getForObject("http://localhost:8081/api/account" + tns.getAccountId(), accountvo.class);
		
		customervo customer = getRestTemplate.getForObject("http://localhost:8082/api/customer" + tns.getCustomerId(), customervo.class);
		
		responsetemplatevo response = new responsetemplatevo();
		
		response.setTransaction(null);
		response.setAccount(account);
		response.setCustomer(customer);
		
		return response;
	}

}
