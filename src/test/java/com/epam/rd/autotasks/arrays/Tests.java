package com.epam.rd.autotasks.arrays;

import com.epam.rd.autotasks.arrays.SumOfPrevious;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void sumOfPreviousTest(){
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] expected = new boolean[]{false, false, true, false, false, true, false, true};
        boolean[] actual = SumOfPrevious.getSumCheckArray(array);

        assertArrayEquals(expected, actual);

        array = new int[20];
        Arrays.fill(array, 5);
        array[8] = 10;
        array[19] = 10;
        actual = SumOfPrevious.getSumCheckArray(array);

        assertEquals(20, actual.length);
        assertTrue(actual[8]);
        assertTrue(actual[19]);
        assertFalse(actual[0]);
        assertFalse(actual[1]);
        assertFalse(actual[15]);

        array = new int[]{16, 8};
        expected = new boolean[]{false, false};
        actual = SumOfPrevious.getSumCheckArray(array);

        assertArrayEquals(expected, actual);

        array = new int[150];
        Arrays.fill(array, 35);
        expected = new boolean[150];
        Arrays.fill(expected, false);
        actual = SumOfPrevious.getSumCheckArray(array);

        assertArrayEquals(expected, actual);

        array = new int[]{1, -1, 10, 4, 6, 13, 15, 25};
        expected = new boolean[]{false, false, false, false, false, false, false, false};
        actual = SumOfPrevious.getSumCheckArray(array);

        assertArrayEquals(expected, actual);

        array = new int[]{-1, 3, 2, 5, 7, 12, 19, 31, 50, 81, 131, 212};
        expected = new boolean[12];
        Arrays.fill(expected, 0, 2, false);
        Arrays.fill(expected, 2, 12, true);
        actual = SumOfPrevious.getSumCheckArray(array);

        assertArrayEquals(expected, actual);

    }
}
