package com.silali;

public class Main {

    public static void main(String[] args) {
        int[] unsortedArray = {20,35,-15,7,55, 1,-22};
        int[] array = (new SortController()).doBubbleSort(unsortedArray);
    }
}
