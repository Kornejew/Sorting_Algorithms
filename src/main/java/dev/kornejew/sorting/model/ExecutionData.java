package dev.kornejew.sorting.model;

import lombok.Getter;

import java.math.BigInteger;

/**
 * Used to execute different {@link dev.kornejew.sorting.algorithms.SortAlgorithm}
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 05.02.2021 22:09
 */

@Getter
public class ExecutionData {

    private final int numberOfExecutions;
    private final int lengthOfArray;
    private final long[] durations;
    private long maxDuration;
    private long minDuration = Long.MAX_VALUE;

    public ExecutionData(int numberOfExecutions, int lengthOfArray) {
        this.numberOfExecutions = numberOfExecutions;
        this.lengthOfArray = lengthOfArray;
        this.durations = new long[numberOfExecutions];
    }

    public void evaluateExecution(long startTime, long endTime, int indexOfExecution) {
        durations[indexOfExecution] = endTime - startTime;

        if (durations[indexOfExecution] > this.maxDuration) {
            this.maxDuration = durations[indexOfExecution];
        }
        if (durations[indexOfExecution] < this.minDuration) {
            this.minDuration = durations[indexOfExecution];
        }
    }

    public long getAverageDuration() {
        BigInteger duration = BigInteger.ZERO;
        for (long n : durations) {
            duration = duration.add(BigInteger.valueOf(n));
        }
        return duration.divide(BigInteger.valueOf(numberOfExecutions)).longValue();
    }
}
