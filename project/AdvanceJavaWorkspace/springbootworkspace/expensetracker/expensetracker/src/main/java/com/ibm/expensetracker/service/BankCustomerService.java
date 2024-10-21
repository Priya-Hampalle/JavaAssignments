package com.ibm.expensetracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.expensetracker.entity.BankCustomerEntity;

@Service
public interface BankCustomerService {
	
	public void saveBankCustData(BankCustomerEntity banCustData) ;

	public void updateBankCustData(BankCustomerEntity banCustData) ;

	public void deleteBankCustData(BankCustomerEntity banCustData);
	
	public List<BankCustomerEntity>getAllCustData();
	
	public BankCustomerEntity getBankCustDataId(long id);
}
