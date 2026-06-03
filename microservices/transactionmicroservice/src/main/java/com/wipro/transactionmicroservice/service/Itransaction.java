package com.wipro.transactionmicroservice.service;

import com.wipro.transactionmicroservice.entity.transaction;
import com.wipro.transactionmicroservice.vo.responsetemplatevo;

public interface Itransaction {
	
	
	transaction addTransaction(transaction tns);
	responsetemplatevo getTransactionDetails(Long id);

}
