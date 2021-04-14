package dev.kornejew.sorting.algorithms;

/**
 * Contains all implemented algorithms.
 *
 * @author Dennis Kornejew
 * @since 05.02.2021 21:25
 */

public enum Algorithm {
    BUBBLE_SORT("Bubble Sort", new BubbleSort()),
    SELECTION_SORT("Selection Sort", new SelectionSort()),
    INSERTION_SORT("Insertion Sort", new InsertionSort()),
    MERGE_SORT("Merge Sort", new MergeSort());

    private final String name;
    private final SortAlgorithm sortAlgorithm;

    Algorithm(String algorithmName, SortAlgorithm sortAlgorithm) {
        this.name = algorithmName;
        this.sortAlgorithm = sortAlgorithm;
    }

    public String getAlgorithmName() {
        return this.name;
    }

    public SortAlgorithm getSortAlgorithm(){
        return this.sortAlgorithm;
    }
}
