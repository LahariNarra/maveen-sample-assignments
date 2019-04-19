package com.capgemini.bankapp.dao;

import java.util.List;

import com.capgemini.bankapp.client.BankAccount;
import com.capgemini.bankapp.exception.AccountNotFoundException;

public interface BankAccountDao {

	public boolean addNewBankAccount(BankAccount account);
	
	public boolean deleteBankAccount(long accountId);

	public boolean updateBankAccountDetails(long accountId, String accountHolderName, String accountType);
	
	public List<BankAccount> findAllBankAccountsDetails();
	
	public double getBalance(long accountId);

	public void updateBalance(long accountId, double newBalance);

	public BankAccount searchAccountDetails(long accountId) throws AccountNotFoundException;

}
