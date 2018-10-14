package com.manoj.domain;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;
import static com.manoj.repository.TransactionRepository.DEFAULT_ROUNDING;
import static com.manoj.repository.TransactionRepository.VIEW_SCALE;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
/**
 * Domain object to pass statastics response.
 * @author manoj
 * @dated 14-Oct-2018
 */
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Statistics {

	@JsonFormat(shape = STRING)
    private final BigDecimal sum;

    @JsonFormat(shape = STRING)
    private final BigDecimal avg;

    @JsonFormat(shape = STRING)
    private final BigDecimal max;

    @JsonFormat(shape = STRING)
    private final BigDecimal min;

    private final long count;

    public Statistics(Statistics stats) {
        this.sum = stats.getSum().setScale(VIEW_SCALE, DEFAULT_ROUNDING);
        this.avg = stats.getAvg().setScale(VIEW_SCALE, DEFAULT_ROUNDING);
        this.max = stats.getMax().setScale(VIEW_SCALE, DEFAULT_ROUNDING);
        this.min = stats.getMin().setScale(VIEW_SCALE, DEFAULT_ROUNDING);
        this.count = stats.getCount();
    }
}
