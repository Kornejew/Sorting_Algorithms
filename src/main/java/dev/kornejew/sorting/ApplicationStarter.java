package dev.kornejew.sorting;

import dev.kornejew.sorting.algorithms.Algorithm;
import dev.kornejew.sorting.algorithms.SortAlgorithm;
import dev.kornejew.sorting.service.AlgorithmExecutorService;
import dev.kornejew.sorting.model.ExecutionData;
import dev.kornejew.sorting.util.ExecutionDataDisplay;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * TODO: Describe this file!
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 05.02.2021 21:16
 */

@Slf4j
public class ApplicationStarter {
    public static void main(String[] args) {
        AlgorithmExecutorService executor = new AlgorithmExecutorService(100, 10000);


        HashMap<Algorithm, ExecutionData> executionDataMap = new HashMap<>();
        SortAlgorithm sortAlgorithm;
        for (Algorithm algorithm : Algorithm.values()) {
            sortAlgorithm = algorithm.getSortAlgorithm();
            log.debug("Executing " + algorithm.getAlgorithmName());

            executionDataMap.put(algorithm, executor.run(sortAlgorithm));
        }

       ExecutionDataDisplay.printExecutionData(executionDataMap);
    }
}
