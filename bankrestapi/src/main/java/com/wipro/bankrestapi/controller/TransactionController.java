package com.wipro.bankrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankrestapi.entity.transaction;
import com.wipro.bankrestapi.service.Itransaction;



@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
	
	
	@Autowired
	Itransaction service;
	
	@PostMapping(value="/addt",consumes ="application/json")
    public transaction addTransaction(@RequestBody transaction tns) {
        return service.addTransaction(tns);
    }
 
    // Update Account
    @PutMapping(value="/updatet",consumes="application/json")
    public transaction updateTransaction(@RequestBody transaction tns) {
        return service.updateTransaction(tns);
    }
 
    // Get Account By Id
    @GetMapping("/getbytid/{tid}")
    public transaction getByTid(@PathVariable Long tid) {
        return service.getByTid(tid);
    }
 
    // Delete Account
    @DeleteMapping("/deletebytid/{tid}")
    public String deleteByTid(@PathVariable Long tid) {
    	String msg = "";
        service.deleteByTid(tid);
        
        transaction tn = service.getByTid(tid);
        if(tn == null) {
        	msg = "Record Deleted Successfully";
        }
        
        return msg;
    }
 
    // Get All Accounts
    @GetMapping(value="/getallt",produces = "application/json")
    public List<transaction> getAllTransactions() {
        return service.getAllTransactions();
    }



}
