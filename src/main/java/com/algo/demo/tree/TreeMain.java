package com.algo.demo.tree;

import java.util.Arrays;

public class TreeMain {


    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8};

        BinaryTree binaryTree = new BinaryTree();


        for (int i = 0; i < data.length; i++) {
            binaryTree.buildBinaryTree(binaryTree.root, data[i]);
        }


        System.out.println(Arrays.toString(data));


        binaryTree.preOrder(binaryTree.root);
        System.out.println();

        binaryTree.inOrder(binaryTree.root);
        System.out.println();

        binaryTree.postOrder(binaryTree.root);
        System.out.println();

    }
}
