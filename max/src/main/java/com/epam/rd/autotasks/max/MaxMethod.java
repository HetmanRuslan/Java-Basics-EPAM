package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        int max = values[0];
        for (int val : values) {
            if (val > max) {
                max = val;
            }
        }

        return max;

    }
}
