package com.algo.demo.sort;


/**
 * 快速排序
 * 时间复杂度：O(nlogn)，最坏：O(n^2)
 * 稳定性：不稳定
 */
public class QuickSort extends BaseSort {



    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {
        if (rIx - lIx < 1) {
            return socArr;
        }

        // 每次以首个数字为基准
        int baseV = socArr[lIx];
        int leftP = lIx;
        int rightP = rIx;

        while (leftP < rightP) {
            // 从右边扫描
            while (leftP < rightP && socArr[rightP] >= baseV) {
                rightP--;
            }
            socArr[leftP] = socArr[rightP];
            // 从左边扫描
            while (leftP < rightP && socArr[leftP] <= baseV) {
                leftP++;
            }
            socArr[rightP] = socArr[leftP];
        }

        socArr[leftP] = baseV;

        // 递归左右子序列调用快速排序
        sort(socArr, lIx, leftP - 1);
        sort(socArr, leftP + 1, rIx);

        return socArr;
    }
}
