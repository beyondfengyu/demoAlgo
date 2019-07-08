package com.algo.demo.search;

import com.algo.demo.sort.QuickSort;
import com.algo.demo.util.NumberUtil;

import java.util.Arrays;

public class SearchStartMain {

    public static void main(String[] args) {


        int[] socArr = NumberUtil.genIntegerArr(100, 1, 2000);

        BinarySearch binarySearch = new BinarySearch();
        int[] binaryArr = Arrays.copyOf(socArr, socArr.length);
        binaryArr[20] = 201;

        QuickSort quickSort = new QuickSort();
        binaryArr = quickSort.sort(binaryArr, 0, binaryArr.length - 1);

        System.out.println(Arrays.toString(binaryArr));
        int ss = binarySearch.search(binaryArr, 200);

        System.out.println(ss);
    }
}
