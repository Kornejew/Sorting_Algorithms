package dev.kornejew.sorting.algorithms;

/**
 * Implementation of Insertion Sort
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 07.02.2021 16:10
 */

public class InsertionSort implements SortAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i;
            int temp = a[i];
            while (j > 0 && a[j - 1] >= temp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }
}
