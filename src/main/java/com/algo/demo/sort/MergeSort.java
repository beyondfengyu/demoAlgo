package com.algo.demo.sort;


/**
 * 归并排序 （两路归并排序）
 * 时间复杂度：O(nlogn)
 * 稳定性：稳定
 */
public class MergeSort extends BaseSort {



    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {
        if (lIx < rIx) {
            int mIx = (rIx + lIx)/2;
            sort(socArr, lIx, mIx);
            sort(socArr, mIx + 1, rIx);
            merge(socArr, lIx, mIx, rIx);
        }

        return socArr;
    }


    /**
     * 合并左右两个已排好列子序列
     *
     * @param socArr
     * @param lIx
     * @param mIx
     * @param rIx
     * @return
     */
    public int[] merge(int[] socArr, int lIx, int mIx, int rIx) {
        int[] tmpArr = new int[rIx - lIx + 1];

        // lp、rp为检测指针，sp为存储指针
        int lp = lIx, rp = mIx + 1, sp = 0;

        while (lp <= mIx && rp <= rIx) {
            if (socArr[lp] <= socArr[rp]) {
                tmpArr[sp++] = socArr[lp++];
            } else {
                tmpArr[sp++] = socArr[rp++];
            }
        }
        // 左子序列若未检测完，全部合并到新的数组
        while (lp <= mIx) {
            tmpArr[sp++] = socArr[lp++];
        }
        // 右子序列若未检测完，全部合并到新的数组
        while (rp <= rIx) {
            tmpArr[sp++] = socArr[rp++];
        }

        // 把合并好的元素复制到原来的数组
        for (int i = 0; i < tmpArr.length; i++) {
            socArr[i + lIx] = tmpArr[i];
        }

        return socArr;
    }

}
