package dev.kornejew.sorting.algorithms;

/**
 * TODO: Describe this file!
 *
 * @author Dennis Kornejew (msg DAVID GmbH)
 * @since 05.02.2021 13:34
 */

public class BubbleSort extends SortAlgorithm {

    @Override
    public void sort(int[] a) {
        boolean sorted = false;
        int sorteEntries = 0;

        while (!sorted) {
            sorted = true;
            for (int i = 1; i < a.length - sorteEntries; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
