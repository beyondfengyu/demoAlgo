package com.algo.demo;

import com.algo.demo.sort.*;
import com.algo.demo.util.NumberUtil;

import java.util.Arrays;

public class StartupMain {



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            int[] socArr = NumberUtil.genIntegerArr(10000, 1, 3000);

            // 冒泡排序，注意数组长度不要太大，否则耗时很长
            int[] bubbleArr = Arrays.copyOf(socArr, socArr.length);
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.swapPrint(bubbleArr, true);

            // 选择排序，注意数组长度不要太大，否则耗时很长
            int[] selectArr = Arrays.copyOf(socArr, socArr.length);
            SelectionSort selectionSort = new SelectionSort();
            selectionSort.swapPrint(selectArr, false);

            // 插入排序，注意数组长度不要太大，否则耗时很长
            int[] insertArr = Arrays.copyOf(socArr, socArr.length);
            InsertSort insertSort = new InsertSort();
            insertSort.swapPrint(insertArr, false);

            // 归并排序
            int[] mergeArr = Arrays.copyOf(socArr, socArr.length);
            MergeSort mergeSort = new MergeSort();
            mergeSort.swapPrint(mergeArr, false);

            // 快速排序，建议数组元素范围放大点，比如：[1-1000000]
            int[] quickArr = Arrays.copyOf(socArr, socArr.length);
            QuickSort quickSort = new QuickSort();
            quickSort.swapPrint(quickArr, false);
        }


        System.out.println("============================");
    }

}
