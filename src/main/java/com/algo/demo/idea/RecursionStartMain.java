package com.algo.demo.idea;

import com.algo.demo.util.NumberUtil;

import java.util.Arrays;

/**
 * 递归思想：
 *      1、找出基线条件；
 *      2、找出递归条件；
 *
 */
public class RecursionStartMain {


    public static void main(String[] args) {
        int[] socArr = NumberUtil.genIntegerArr(5, 1, 10);

        System.out.println(Arrays.toString(socArr));

        System.out.println(sumArr(socArr.length - 1, socArr));


//        countdown(10);
        for (int i = 0; i < 10; i++) {

            System.out.print(fibonaSequence(i+ 1) + ", ");
        }
    }


    /**
     * 倒计时（递归方式）
     *
     * @param i
     */
    public static void countdown(int i) {
        if (i < 1) {
            System.out.println("倒计时结束-----");
            return;
        }
        System.out.println("倒计时：" + i);
        countdown(i - 1);
    }


    /**
     * 斐波那契数列
     *
     * @param n
     */
    public static int fibonaSequence(int n) {
        if (n == 2 || n == 1) {
            return 1;
        }
        return fibonaSequence(n - 1) + fibonaSequence(n - 2);
    }


    /**
     * 递归计算总数
     *
     * @param ix
     * @param socArr
     * @return
     */
    public static int sumArr(int ix, int[] socArr) {
        if (ix == 0) {
            return socArr[ix];
        }
        return socArr[ix] + sumArr(ix - 1, socArr);
    }
}
