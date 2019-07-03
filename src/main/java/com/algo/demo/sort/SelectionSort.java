package com.algo.demo.sort;


/**
 * 选择排序
 */
public class SelectionSort extends BaseSort{


    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {
        for (int k = 0; k < socArr.length - 1; k++) {

            for (int i = k+1; i < socArr.length; i++) {
                if (socArr[k] > socArr[i]) {
                    int tmp = socArr[k];
                    socArr[k] = socArr[i];
                    socArr[i] = tmp;
                }
            }
        }

        return socArr;
    }
}
