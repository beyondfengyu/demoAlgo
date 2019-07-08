package com.algo.demo.idea;


import com.algo.demo.util.NumberUtil;

import java.util.Arrays;

/**
 * 分而治之（D&C）思想：
 *      1、找出基线条件，基线条件必须简单；
 *      2、不断缩小规模，使之满足基线条件；
 */
public class DivideAndConquer {


    public static void main(String[] args) {


        System.out.println(minBlock(1680, 640));
        System.out.println(minBlock(80, 50));

//
//        int[] socArr = NumberUtil.genIntegerArr(5, 1, 5);
//        System.out.println(Arrays.toString(socArr));
//
//
//        System.out.println(sumArr(0, socArr));
    }


    /**
     * 计算数组的数字之和（分而治之）
     *
     * @param lx
     * @param socArr
     */
    public static int sumArr(int lx, int[] socArr) {
        // 1、找出基线条件，此处为数组只有一个元素
        if (lx == socArr.length - 1) {
            return socArr[lx];
        }
        // 2、缩小计算规模，此处使游标向右移动，减少计算的数组长度
        return socArr[lx] + sumArr(lx + 1, socArr);
    }


    /**
     * 一个长方形均匀划分出方块，确保划分出的方块尽可能大
     *
     * @param width
     * @param height
     * @return
     */
    public static int minBlock(int width, int height) {
        if (width < height) {
            int tmp = width;
            width = height;
            height = tmp;
        }
        // 1、找出基线条件，此处为width是height的整数倍
        if (width % height == 0) {
            return height;
        }
        // 2、缩小规模，可以把上面划分方块的情景转化为求原长方形的width和height的最大公约数模型
        // 此处应用殴几里德定理，可知width与height的最大公约数等于(width%height)与height的最大公约数
        // 由此可转化为求(width%height)与height的最大公约数，计算规模缩小了
        return minBlock(width % height, height);
    }
}
