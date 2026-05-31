package com.wipro.accountmicroservice.service;

import java.util.List;

import com.wipro.accountmicroservice.entity.account;
import com.wipro.accountmicroservice.vo.accountcustomerVO;

public interface Iaccount {
	
public account addAccount(account acc);
	
	public account getByAid(Long aid);
	
	public List<account> getAllAccounts();
	
	public accountcustomerVO getAccountwithCustomer(Long accountId);

}
