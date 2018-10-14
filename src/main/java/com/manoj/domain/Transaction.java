package com.manoj.domain;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.validation.constraints.DecimalMin;

import com.manoj.validation.FutureTimestampConstraint;
import com.manoj.validation.TimeoutTimestampConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Domain object to pass transaction requests
 * @author manoj
 * @dated 14-Oct-2018
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @DecimalMin("0.00")
    private BigDecimal amount;

    @FutureTimestampConstraint
    @TimeoutTimestampConstraint
    private ZonedDateTime timestamp;
}
