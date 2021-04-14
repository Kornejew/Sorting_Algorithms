package dev.kornejew.sorting.util;

import dev.kornejew.sorting.algorithms.Algorithm;
import dev.kornejew.sorting.model.ExecutionData;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Map;

/**
 * Writes the results of the implemented algorithms to the README file in a valid GitHub Markdown format.
 *
 * @author Dennis Kornejew
 * @since 14.04.2021 21:56
 */
@Slf4j
public class ExecutionDataWriter {
    private static final String OUTPUT_FILE_PATH = "README.md";

    private ExecutionDataWriter() {
    }

    public static void printExecutionData(Map<Algorithm, ExecutionData> dataMap) {
        log.debug("Writing files to " + OUTPUT_FILE_PATH + "...");
        File file = new File(OUTPUT_FILE_PATH);
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("# Implemented Algorithms and results:\n");
            fileWriter.write("|           Algorithm              | Maximum duration |   Minimum duration     | Average duration |\n");
            fileWriter.write("| -------------------------------- | ---------------- | ---------------------- | ---------------- |\n");
            dataMap.forEach((algorithm, data) -> ExecutionDataWriter.printSingleLineOfData(algorithm, data, fileWriter));
        } catch (IOException e) {
            log.error("Could not open output file", e);
        }
        log.debug("DONE!");
    }

    private static void printSingleLineOfData(Algorithm algorithm, ExecutionData data, FileWriter writer) {
        Formatter formatter = new Formatter();
        formatter.format(
                "| %32s | %16d | %22d | %16d |%n", algorithm.getAlgorithmName(),
                data.getMaxDuration(),
                data.getMinDuration(),
                data.getAverageDuration());
        try {
            writer.write(formatter.toString());
        } catch (IOException e) {
            log.error("Could not write data for " + algorithm.getAlgorithmName(), e);
        }
    }
}
