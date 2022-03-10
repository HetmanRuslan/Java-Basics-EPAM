package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {


    static int[] cycleSwap(int[] array) {
        int shift = 1;

        if (array == null || array.length == 0) {
            return array;
        } else {
            for (int i = 0; i < shift; i++) {
                int last = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = last;
            }
            return array;

        }
    }



    static int[] cycleSwap(int[] arr, int shift) {
        if (arr == null || arr.length == 0) {
            return arr;
        } else {
            for (int i = 0; i < shift; i++) {
                int last = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
            return arr;
        }
    }
}

