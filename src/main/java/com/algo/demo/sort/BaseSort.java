package com.algo.demo.sort;

import java.util.Arrays;

public abstract class BaseSort implements Sort{

    public int[] sort(int[] socArr, int lIx, int rIx) {
        return Arrays.copyOf(socArr, socArr.length);
    }


    public void swapPrint(int[] socArr, boolean printArr) {

        if (printArr) {
            System.out.println(Arrays.toString(socArr));
        }
        long start = System.currentTimeMillis();
        int[] retArr = sort(socArr, 0, socArr.length - 1);
        long end = System.currentTimeMillis();

        if (printArr) {
            System.out.println(Arrays.toString(retArr));
        }

        System.out.println(getClass().getSimpleName() + " cast: " + (end - start));
    }
}
