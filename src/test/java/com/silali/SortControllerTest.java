package com.silali;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortControllerTest {
    @Test
    void doBubbleSort() {
        int[] unsortedArray = {20,35,-15,7,55, 1,-22};
        int[] array = (new SortController()).doBubbleSort(unsortedArray);
        int[] expectedArray = {-22,-15,1,7,20,35,55};
        Assertions.assertArrayEquals(expectedArray,array);
    }

    @Test
    void doSelectionSort() {
        int[] unsortedArray = {20,35,-15,7,55, 1,-22};
        int[] array = (new SortController()).doSelectionSort(unsortedArray);
        int[] expectedArray = {-22,-15,1,7,20,35,55};
        Assertions.assertArrayEquals(expectedArray,array);
    }

    @Test
    void doInsertionSort() {
    }

    @Test
    void doShellSort() {
    }

    @Test
    void doMergeSort() {
    }

    @Test
    void doCountingSort() {
    }

    @Test
    void doQuickSort() {
    }

    @Test
    void doRadixSort() {
    }
}