package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {
//        if (array == null || array.length < 2) {
//            System.out.println();
//        }
        boolean[] booleans = new boolean[array.length];
        booleans[0] = false;
        booleans[1] = false;
        for (int i = 2; i < array.length; i++) {
            if (array[i] == (array[i - 1] + array[i - 2])) {
                booleans[i] = true;
                Arrays.copyOf(array, i);
            } else {
                booleans[i] = false;
            }
        }
        return booleans;
    }
}
