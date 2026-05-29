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

import com.wipro.bankrestapi.entity.account;
import com.wipro.bankrestapi.service.Iaccount;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	
	
	@Autowired
	Iaccount service;
	
	@PostMapping(value="/adda",consumes ="application/json")
    public account addAccount(@RequestBody account acc) {
        return service.addAccount(acc);
    }
 
    // Update Account
    @PutMapping(value="/updatea",consumes="application/json")
    public account updateAccount(@RequestBody account acc) {
        return service.updateAccount(acc);
    }
 
    // Get Account By Id
    @GetMapping("/getbyaid/{aid}")
    public account getByAid(@PathVariable Long aid) {
        return service.getByAid(aid);
    }
 
    // Delete Account
    @DeleteMapping("/deletebyaid/{aid}")
    public String deleteByAid(@PathVariable Long aid) {
    	String msg = "";
        service.deleteByAid(aid);
        
        account acc = service.getByAid(aid);
        if(acc == null) {
        	msg = "Record Deleted Successfully";
        }
        
        return msg;
    }
 
    // Get All Accounts
    @GetMapping(value="/getalla",produces = "application/json")
    public List<account> getAllAccounts() {
        return service.getAllAccounts();
    }


}
