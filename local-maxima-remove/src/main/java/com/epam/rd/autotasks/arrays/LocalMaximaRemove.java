package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        int[] SecondArray = new int[array.length];

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= array[i - 1] || array[i] <= array[i + 1])

                SecondArray[i] = array[i];

        }
        if (array[0] <= array[1])
            SecondArray[0] = array[0];

        if (array[array.length - 1] <= array[array.length - 2])
            SecondArray[SecondArray.length - 1] = array[array.length - 1];



        int nonZeroCount = 0;

        for (int i = 0; i < SecondArray.length; i++) {
            if (SecondArray[i] != 0)
                nonZeroCount++;
            if (array[i] == 0)
                nonZeroCount++;
        }

        int[] sorted = new int[nonZeroCount];

        int anotherCount = 0;
        for (int i = 0; i < SecondArray.length; i++) {
            if (SecondArray[i] != 0||array[i]==0)
            {
                sorted[anotherCount] = SecondArray[i];
                anotherCount++;
            }
        }
        return sorted;

    }
}
