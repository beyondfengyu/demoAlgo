package com.algo.demo.sort;


/**
 * 希尔排序
 * 时间复杂度：
 * 稳定性：不稳定
 */
public class ShellSort extends BaseSort {



    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {
        int len = socArr.length;

        // 增量由len/2开始，每次减半，逐步缩小增量，
        // 循环对每一种增量的分组进行插入排序
        for(int grap = len/2; grap > 0; grap /= 2) {
            // 此处变量 i 的值为增量
            for (int j = grap; j < len; j++) {
                insertSort(socArr, j, grap);
            }

        }
        return socArr;
    }

    /**
     *
     * @param socArr
     * @param start
     * @param grap    增量
     */
    private void insertSort(int[] socArr, int start, int grap) {
        int tmp = socArr[start];
        int i;
        // 循环查找该增量数组中比原值大的值
        // 即进行普通插入排序
        for (i = start - grap; i >= 0 && socArr[i] > tmp; i -= grap) {
            socArr[i + grap] = socArr[i];
        }

        socArr[i + grap] = tmp;
    }


}
