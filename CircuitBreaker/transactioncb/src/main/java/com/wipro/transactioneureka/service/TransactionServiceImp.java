package com.wipro.transactioneureka.service;
import com.wipro.transactioneureka.dto.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.transactioneureka.config.resttemplateconfig;
import com.wipro.transactioneureka.dto.transactionresponse;
import com.wipro.transactioneureka.entity.transaction;
import com.wipro.transactioneureka.repository.TransactionRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class TransactionServiceImp implements Itransaction{
	
	@Autowired
	private TransactionRepository repo2;
	
	@Autowired
	private RestTemplate restTemplate;
	
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
	
	@Override
	@CircuitBreaker(name = "transactionBreaker",fallbackMethod = "fallbackMethod")
	public transactionresponse getTransactionDetails(Long id) {
		transaction transaction = repo2.findById(id).orElse(null);
		
		accountdto account = restTemplate.getForObject("http://ACCOUNT-EUREKA/api/account/getbyaid/1", accountdto.class);
 
        customerdto customer = restTemplate.getForObject("http://CUSTOMER-EUREKA/api/customer/getbycid/1",customerdto.class);
 
        return new transactionresponse(
                transaction,
                account,
                customer);
    }
 
    public transactionresponse fallbackMethod(
            Long id,
            Exception ex) {
 
        transaction transaction =
                repo2.findById(id).orElse(null);
 
        accountdto account = new accountdto();
        account.setAccountId(0L);
        account.setAccountType("ACCOUNT SERVICE DOWN");
        account.setBalance(0);
 
        customerdto customer = new customerdto();
        customer.setCustomerId(0L);
        customer.setCustomerName("CUSTOMER SERVICE DOWN");
        customer.setEmail("NOT AVAILABLE");
 
        return new transactionresponse(
                transaction,
                account,
                customer);
    }
		
}
