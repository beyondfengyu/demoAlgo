package com.algo.demo.sort;


/**
 * 堆排序
 * 时间复杂度：O(nlogn)
 * 稳定性： 不稳定
 */
public class HeapSort extends BaseSort {

    private int heapSize;



    @Override
    public int[] sort(int[] socArr, int lIx, int rIx) {
        this.heapSize = socArr.length;
        // 构建一个最大堆结构
        buildMaxHeap(socArr);
//        System.out.println("maxHeap: " + Arrays.toString(socArr));
        // 循环获取最大堆中的最大值，把最大值按顺序放入原数组
        for (int i = socArr.length - 1; i > 0; i--) {
            int tmp = socArr[i];
            socArr[i] = socArr[0];
            socArr[0] = tmp;

//            System.out.println(Arrays.toString(socArr));
            // 指示新的堆的大小
            this.heapSize--;
            // 重新调整原最大堆的，因为最大堆的顶点改变了，
            // 新的堆的顶点调整为原最大堆的最后一个节点值。
            maxHeapPify(socArr, 0);
        }

        return socArr;
    }


    /**
     * 建造最大堆
     *
     * @param socArr
     */
    public void buildMaxHeap(int[] socArr) {
        // 获取最后一个有子节点的节点索引
        int lastParentIx = this.getParentIndex(socArr.length - 1);

        for (int i = lastParentIx; i >= 0; i--) {
            this.maxHeapPify(socArr, i);
        }
    }



    public void maxHeapPify(int[] socArr, int i) {
        int leftIx = this.getLeftIndex(i);
        int rightIx = this.getRightIndex(i);
        int lastIx = i;

        if (leftIx <= heapSize - 1 && socArr[leftIx] > socArr[lastIx]) {
            lastIx = leftIx;
        }
        if (rightIx <= heapSize - 1 && socArr[rightIx] > socArr[lastIx]) {
            lastIx = rightIx;
        }
        if (lastIx != i) {
            int tmp = socArr[i];
            socArr[i] = socArr[lastIx];
            socArr[lastIx] = tmp;

            maxHeapPify(socArr, lastIx);
        }

    }


    public int getLeftIndex(int i) {
        return 2*i +1;
    }


    public int getRightIndex(int i) {
        return 2*i + 2;
    }


    public int getParentIndex(int i) {
        return (i - 1)/2;
    }


}
