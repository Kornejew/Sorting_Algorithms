package dev.kornejew.sorting.algorithms;

/**
 * TODO: Describe this file!
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 05.02.2021 23:00
 */

public class SelectionSort extends SortAlgorithm {

    @Override
    public void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int maxValueIndex = 0;
            int maxValue = a[0];

            for (int j = 1; j < a.length - i; j++) {
                if (a[j] > maxValue) {
                    maxValue = a[j];
                    maxValueIndex = j;
                }
            }

            a[maxValueIndex] = a[a.length - i - 1];
            a[a.length - i - 1] = maxValue;
        }
    }
}
