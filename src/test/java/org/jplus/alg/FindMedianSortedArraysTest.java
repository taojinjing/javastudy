package org.jplus.alg;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMedianSortedArraysTest {

    @Test
    public void findMedianSortedArrays_21() {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        assertEquals(2.0, new FindMedianSortedArrays().findMedianSortedArrays(num1, num2), 0.1);
    }

    @Test
    public void findMedianSortedArrays_22() {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        assertEquals(2.5, new FindMedianSortedArrays().findMedianSortedArrays(num1, num2), 0.1);
    }
}