package dev.kornejew.sorting.algorithms;

import java.util.Arrays;

/**
 * TODO: Describe this file!
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 14.04.2021 20:42
 */

public class MergeSort implements SortAlgorithm {
    @Override
    public void sort(int[] a) {
        mergeSort(a);
    }

    private int[] mergeSort(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, a.length / 2));
        int[] right = mergeSort(Arrays.copyOfRange(a, a.length / 2, a.length));

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (rightIndex >= right.length || (leftIndex < left.length && left[leftIndex] < right[rightIndex])) {
                a[i] = left[leftIndex];
                leftIndex++;
            } else {
                a[i] = right[rightIndex];
                rightIndex++;
            }
        }
        return a;
    }
}
