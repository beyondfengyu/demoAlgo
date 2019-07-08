package com.algo.demo.search;



/**
 * 二分查找算法
 * 时间复杂度： O(logn)
 */
public class BinarySearch extends BaseSearch {


    /**
     *
     * @param socArr  排序有序的数组
     * @param target  目标数字，必须在数组中存在，否则返回 -1
     * @return
     */
    public int search(int[] socArr, int target) {
        int min = 0;
        int max = socArr.length - 1;


        while (min <= max) {
            int mid = (max + min) / 2;
            if (socArr[mid] > target) {
                max = mid - 1;
            } else if (socArr[mid] < target) {
                min = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
