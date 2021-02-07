package dev.kornejew.sorting.service;

import dev.kornejew.sorting.algorithms.SortAlgorithm;
import dev.kornejew.sorting.model.ExecutionData;

import java.util.Random;

/**
 * Used to test the execution of {@link dev.kornejew.sorting.algorithms.SortAlgorithm}
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 05.02.2021 21:09
 */

public class AlgorithmExecutorService {

    private static final Random random = new Random();
    private final int numberOfIterations;
    private final int testArrayLength;
    private int[] unsortedArray;


    public AlgorithmExecutorService(int numberOfIterations, int testArrayLength) {
        this.numberOfIterations = numberOfIterations;
        this.testArrayLength = testArrayLength;
        this.init();
    }

    private void init() {
        this.unsortedArray = new int[this.testArrayLength];
        this.randomizeArray();
    }

    private void randomizeArray() {
        for (int i = 0; i < this.unsortedArray.length; i++) {
            this.unsortedArray[i] = random.nextInt();
        }
    }

    public ExecutionData run(SortAlgorithm sortAlgorithm) {
        ExecutionData executionData = new ExecutionData(numberOfIterations, testArrayLength);
        for (int i = 0; i < numberOfIterations; i++) {
            this.randomizeArray();
            long startTime = System.nanoTime();
            sortAlgorithm.sort(this.unsortedArray);
            long endTime = System.nanoTime();
            executionData.evaluateExecution(startTime, endTime, i);
        }
        return executionData;
    }
}
