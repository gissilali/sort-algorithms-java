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
        System.out.println(Arrays.toString(array));
        int unsortedArrayIndex = array.length - 1;
//        int largestValueIndex = 0;

        while (unsortedArrayIndex > 0) {
            int largestValueIndex = 0;
            for (int i = 1; i <= unsortedArrayIndex; i++) {
                int largestValue = array[largestValueIndex];
                int currentValue = array[i];
                if (currentValue != largestValue) {
                    if (currentValue > largestValue) {
                        largestValueIndex = i;
                    }
                }
                if (i == unsortedArrayIndex) {
                    System.out.println(unsortedArrayIndex);
                    System.out.println(array[largestValueIndex]);
                    largestValue = array[largestValueIndex];
                    array[largestValueIndex] = array[unsortedArrayIndex];
                    array[unsortedArrayIndex] = largestValue;
                }
            }
            unsortedArrayIndex = unsortedArrayIndex - 1;
        }
        System.out.println(Arrays.toString(array));
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
