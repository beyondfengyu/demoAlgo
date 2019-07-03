package com.algo.demo;

import com.algo.demo.sort.*;
import com.algo.demo.util.NumberUtil;

import java.util.Arrays;

public class StartupMain {



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {


            int[] socArr = NumberUtil.genIntegerArr(100000000, 1, 3000);

//        int[] bubbleArr = Arrays.copyOf(socArr, socArr.length);
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.swapPrint(bubbleArr, true);
//
//        int[] selectArr = Arrays.copyOf(socArr, socArr.length);
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.swapPrint(selectArr, false);
//
//        int[] insertArr = Arrays.copyOf(socArr, socArr.length);
//        InsertSort insertSort = new InsertSort();
//        insertSort.swapPrint(insertArr, false);

            int[] mergeArr = Arrays.copyOf(socArr, socArr.length);
            MergeSort mergeSort = new MergeSort();
            mergeSort.swapPrint(mergeArr, false);

            int[] quickArr = Arrays.copyOf(socArr, socArr.length);
            QuickSort quickSort = new QuickSort();
            quickSort.swapPrint(quickArr, false);
        }


        System.out.println("===========================");
    }

}
