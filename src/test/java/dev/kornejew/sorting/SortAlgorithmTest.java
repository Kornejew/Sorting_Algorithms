package dev.kornejew.sorting;


import dev.kornejew.sorting.algorithms.BubbleSort;
import dev.kornejew.sorting.algorithms.InsertionSort;
import dev.kornejew.sorting.algorithms.SelectionSort;
import dev.kornejew.sorting.algorithms.SortAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortAlgorithmTest {

    private SortAlgorithm sortAlgorithm;
    private int[] testArray;
    private int[] expectedArray;

    @BeforeEach
    void initializeTestArray() {
        this.testArray = new int[]{2, 1, -5, 0, 2, 28, 3};
        this.expectedArray = new int[]{-5, 0, 1, 2, 2, 3, 28};
    }


    @Test
    void bubbleSortShouldSortArrays() {
        this.sortAlgorithm = new BubbleSort();
        sortAlgorithm.sort(testArray);
        assertArrayEquals(this.expectedArray, testArray);
    }

    @Test
    void selectionSortShouldSortArrays() {
        this.sortAlgorithm = new SelectionSort();
        sortAlgorithm.sort(testArray);
        assertArrayEquals(this.expectedArray, testArray);
    }

    @Test
    void insertionSortShouldSortArrays() {
        this.sortAlgorithm = new InsertionSort();
        sortAlgorithm.sort(testArray);
        assertArrayEquals(this.expectedArray, testArray);
    }
}