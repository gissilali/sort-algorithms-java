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
        //set the unsorted array partition to the last index
        int unsortedArrayIndex = array.length - 1;


        // this is used to track how many passes we have left
        while (unsortedArrayIndex > 0) {
            //set the largest value to the first index - 0
            int largestValueIndex = 0;
            //loop through the array a complete loop is one pass
            for (int i = 1; i <= unsortedArrayIndex; i++) {
                int largestValue = array[largestValueIndex];
                int currentValue = array[i];
                // get the largest value  and current value and compare them.
                if (currentValue != largestValue) {
                    //when the current value is larger than the largest value then we set the largestValueIndex to the currentValueIndex
                    if (currentValue > largestValue) {
                        largestValueIndex = i;
                    }
                }
                //check that we have reached the end of unsorted partition
                if (i == unsortedArrayIndex) {
                    //we are swapping the largest value with the last value in the unsorted  partition
                    largestValue = array[largestValueIndex];
                    array[largestValueIndex] = array[unsortedArrayIndex];
                    array[unsortedArrayIndex] = largestValue;
                }
            }
            unsortedArrayIndex = unsortedArrayIndex - 1;
        }
        
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
