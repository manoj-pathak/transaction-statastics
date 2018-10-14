package com.manoj.service;

import com.manoj.domain.Transaction;

/**
 * Transaction service interface.
 * 
 * @author manoj
 * @dated 14-Oct-2018
 */
public interface TransactionService {

	/**
	 * Add new Transaction to repository
	 * 
	 */
	void addTransaction(Transaction transaction);

	/**
	 * Delete all transactions from repository
	 * 
	 */
	void deleteAllTransactions();
}
