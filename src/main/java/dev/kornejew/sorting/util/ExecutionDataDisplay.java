package dev.kornejew.sorting.util;

import dev.kornejew.sorting.algorithms.Algorithm;
import dev.kornejew.sorting.model.ExecutionData;

import java.util.Map;

/**
 * Visualisation of {@link ExecutionData}
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 06.02.2021 12:19
 */

public class ExecutionDataDisplay {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    private ExecutionDataDisplay() {
    }

    public static void printExecutionData(Map<Algorithm, ExecutionData> dataMap) {

        System.out.println(ANSI_GREEN);
        System.out.println("╔══════════════════════════════════╦══════════════════╦════════════════════════╦══════════════════╗");
        System.out.println("║           Algorithm              ║ Maximum duration ║    Minimum duration    ║ Average duration ║");
        System.out.println("╠══════════════════════════════════╬══════════════════╬════════════════════════╬══════════════════╣");
        dataMap.forEach(ExecutionDataDisplay::printSingleLineOfData);
        System.out.println("╚══════════════════════════════════╩══════════════════╩════════════════════════╩══════════════════╝");
    }

    private static void printSingleLineOfData(Algorithm algorithm, ExecutionData data) {
        System.out.printf("║ %32s ║ %16d ║ %22d ║ %16d ║%n", algorithm.getAlgorithmName(),
                data.getMaxDuration(),
                data.getMinDuration(),
                data.getAverageDuration()
        );
    }
}
