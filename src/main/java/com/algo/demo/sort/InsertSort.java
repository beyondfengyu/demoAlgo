package com.algo.demo.sort;


/**
 * 插入排序
 * 时间复杂度：O(n^2)
 */
public class InsertSort extends BaseSort{


    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {
        int i, j;

        for (i = 1; i < socArr.length; i++) {
            int tmp = socArr[i];
            // 为tmp寻找合适的位置
            for (j = i - 1; j > 0; j--) {
                if (tmp < socArr[j]) {
                    // 元素后移
                    socArr[j + 1] = socArr[j];
                }
            }
            socArr[j+1] = tmp;
        }
        return socArr;
    }

}
