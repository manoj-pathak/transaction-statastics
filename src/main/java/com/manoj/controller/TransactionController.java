package com.manoj.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.domain.Transaction;
import com.manoj.service.TransactionService;

import lombok.AllArgsConstructor;

/**
 * Rest API to store new transactions and delete all old transactions.
 * 
 * @author manoj
 * @dated 14-Oct-2018
 */
@RestController("/transactions")
@AllArgsConstructor
public class TransactionController {

	private final TransactionService transactionService;

	/**
	 * Api to add transaction
	 * @param transaction
	 * @return http status code.
	 */
    @RequestMapping(method = POST)
    public ResponseEntity<?> postTransaction(@RequestBody @Valid final Transaction transaction) {
    	transactionService.addTransaction(transaction);
        return ResponseEntity.status(CREATED).body(null);
    }

    /**
     * API to delete all transactions.
     * @return status code - 204
     */
    
    @RequestMapping(method = DELETE)
    public ResponseEntity<?> deleteTransactions() {
    	transactionService.deleteAllTransactions();
        return ResponseEntity.status(NO_CONTENT).body(null);
    }
}
