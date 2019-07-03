package com.algo.demo.util;

import java.util.Arrays;
import java.util.Random;

public class NumberUtil {

    private static final Random random = new Random();


    public static int[] genIntegerArr(int len) {
        return genIntegerArr(len, 1, 100);
    }


    public static int[] genIntegerArr(int len, int min, int max) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(max-min)+ min;
        }
        return arr;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Arrays.toString(genIntegerArr(1, 1, 5)));
        }
    }
}
