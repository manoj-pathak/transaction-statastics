package com.manoj.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.domain.Statistics;
import com.manoj.service.StatisticsService;

import lombok.AllArgsConstructor;

/**
 * Rest api to fetch transaction statastics.
 * 
 * @author manoj
 * @dated 14-Oct-2018
 */
@RestController("/statistics")
@AllArgsConstructor
public class StatisticsController {

    private final StatisticsService statisticsService;

    @RequestMapping(method = GET)
    public ResponseEntity<?> getStatistics() {
        Statistics statistics = statisticsService.getStatistics();
        return ResponseEntity.ok(statistics);
    }
}
