package com.manoj.service;

import org.springframework.stereotype.Service;

import com.manoj.domain.Statistics;
import com.manoj.repository.TransactionRepository;

import lombok.AllArgsConstructor;
/**
 * @author manoj
 * @dated 14-Oct-2018
 */
@Service
@AllArgsConstructor
public class StatisticsServiceImpl implements StatisticsService {
    private final TransactionRepository transactionRepository;

    public Statistics getStatistics() {
        return transactionRepository.getStatistics();
    }
}
