package mypackage.services;

import java.util.List;

import mypackage.models.FrontendTransaction;
import mypackage.models.Transactions;

public interface TransactionsService {
	
	public List<Transactions> getAllPendingTransactions();
	public String addTransaction(Transactions transactions);
	public List<FrontendTransaction> getTransactionsForAccountNumber(String accountNumber);
	public List<FrontendTransaction> getFilteredTransactions(String accountNumber, String startDate, String endDate);
	String updateTransaction(int id);
}
