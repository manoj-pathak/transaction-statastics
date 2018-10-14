package com.manoj.service;

import org.springframework.stereotype.Service;

import com.manoj.domain.Transaction;
import com.manoj.repository.TransactionRepository;

import lombok.AllArgsConstructor;

/**
 * 
 * @author manoj
 * @dated 14-Oct-2018
 */
@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {

	private final TransactionRepository transactionRepository;

	public void addTransaction(final Transaction transaction) {
		transactionRepository.insert(transaction);
	}

	public void deleteAllTransactions() {
		transactionRepository.wipe();
	}
}
