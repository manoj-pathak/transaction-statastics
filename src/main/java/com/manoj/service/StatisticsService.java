package com.manoj.service;

import com.manoj.domain.Statistics;

/**
 * Transaction statistics interface.
 * 
 * @author manoj
 * @dated 14-Oct-2018
 */
public interface StatisticsService {

	/**
	 * Get statics of last 60 seconds transactions.
	 * 
	 * @return Statistics
	 */
	Statistics getStatistics();

}
