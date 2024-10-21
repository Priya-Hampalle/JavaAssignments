package com.ibm.expensetracker.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.expensetracker.entity.BankCustomerEntity;
import com.ibm.expensetracker.repository.BankCustomerRepository;
import com.ibm.expensetracker.service.BankCustomerService;

@Component
public class BankCustomerServiceImpl implements BankCustomerService {

	@Autowired
	private BankCustomerRepository bankCustomerRepository;

	@Override
	public void saveBankCustData(BankCustomerEntity banCustData) {

		bankCustomerRepository.save(banCustData);

	}

	@Override
	public void updateBankCustData(BankCustomerEntity banCustData) {

		bankCustomerRepository.save(banCustData);

	}

	@Override
	public void deleteBankCustData(BankCustomerEntity banCustData) {
		
		bankCustomerRepository.delete(banCustData);

	}

	@Override
	public List<BankCustomerEntity> getAllCustData() {
		List<BankCustomerEntity> bankCustList = bankCustomerRepository.findAll();
		return bankCustList;
	}

	@Override
	public BankCustomerEntity getBankCustDataId(long id) {
		Optional<BankCustomerEntity> bankCustData =bankCustomerRepository.findById(id);
		if (bankCustData.isPresent()) {
			return bankCustData.get();
		}else {
		return null;
		}
	}

}
