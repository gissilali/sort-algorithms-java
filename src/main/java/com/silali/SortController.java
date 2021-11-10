package com.silali;


import java.util.Arrays;

public class SortController {
    public int[] doBubbleSort(int[] array) {
        System.out.println(Arrays.toString(array));
        int unsortedArrayIndex = array.length - 1;
        while (unsortedArrayIndex > 0) {
            for (int i = 0; i < array.length; i++) {
                int leftValue = array[i];
                int nextIndex = i + 1;
                if (nextIndex <= array.length - 1) {
                    int rightMostValue = array[nextIndex];
                    if (leftValue != rightMostValue) {
                        if (leftValue > rightMostValue) {
                            array[i] = rightMostValue;
                            array[i + 1] = leftValue;
                        }
                    }
                }
            }
            unsortedArrayIndex = unsortedArrayIndex - 1;
        }

        return array;
    }

    public int[] doSelectionSort(int[] array) {
        return array;
    }

    public int[] doInsertionSort(int[] array) {
        return array;
    }

    public int[] doShellSort(int[] array) {
        return array;
    }

    public int[] doMergeSort(int[] array) {
        return array;
    }

    public int[] doCountingSort(int[] array) {
        return array;
    }

    public int[] doQuickSort(int[] array) {
        return array;
    }

    public int[] doRadixSort(int[] array) {
        return array;
    }

}
