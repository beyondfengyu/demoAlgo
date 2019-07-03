package com.algo.demo.sort;

/**
 * 冒泡排序
 * 时间复杂度：O(n^2)
 */
public class BubbleSort extends BaseSort {
    
    
    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {

        for (int i = 0; i < socArr.length; i++) {
            // 若一次冒泡没有元素交换，表明当前数组元素已经有序
            boolean flag = false;

            for (int j = 0; j < socArr.length - i - 1; j++) {
                if (socArr[j] > socArr[j + 1]) {
                    // 交换相近的元素，使更大的元素值往上冒
                    int tmp = socArr[j + 1];
                    socArr[j + 1] = socArr[j];
                    socArr[j] = tmp;

                    flag = true;
                }
            }

            // 若一次冒泡没有元素交换，直接退出
            if(!flag) break;
        }

        return socArr;
    }
}
