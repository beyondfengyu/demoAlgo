package com.algo.demo.sort;


/**
 * 希尔排序
 * 时间复杂度：
 */
public class ShellSort extends BaseSort {



    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {
        int len = socArr.length;

        // 增量由len/2开始，每次减半，逐步缩小增量，
        // 循环对每一种增量的分组进行插入排序
        for(int i = len/2; i > 0; i /= 2) {
            // 此处变量 i 的值为增量
            for (int j = i; j < len; j++) {
                insertI(socArr, j, i);
            }

        }
        return socArr;
    }

    /**
     *
     * @param socArr
     * @param start
     * @param incr    增量
     */
    public void insertI(int[] socArr, int start, int incr) {
        int tmp = socArr[start];
        int i;
        // 循环查找该增量数组中比原值大的值
        // 即进行普通插入排序
        for (i = start - incr; i >= 0 && socArr[i] > tmp; i -= incr) {
            socArr[i + incr] = socArr[i];
        }

        socArr[i + incr] = tmp;
    }
}
