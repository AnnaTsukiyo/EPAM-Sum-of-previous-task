package com.epam.rd.autotasks.arrays;

import com.epam.rd.autotasks.arrays.SumOfPrevious;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void sumOfPreviousTest(){
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] expected = new boolean[]{false, false, true, false, false, true, false, true};

        boolean[] actual = SumOfPrevious.isSum(array);

        assertArrayEquals(expected, actual);
    }
}
