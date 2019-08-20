package com.algo.demo.tree;


/**
 * 二叉树
 * 1、构建
 * 2、前序、中序、后序遍历
 *
 */
public class BinaryTree {

    public TreeNode root;

    private class TreeNode {
        private int val;
        private TreeNode leftNode;
        private TreeNode rightNode;

        public TreeNode(int val) {
            this.val = val;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }


    /**
     * 构建二叉树
     *
     * @param node
     * @param val
     */
    public void buildBinaryTree(TreeNode node, int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            if(node.val > val) {
                if (node.leftNode == null) {
                    node.leftNode = new TreeNode(val);
                } else {
                    buildBinaryTree(node.leftNode, val);
                }
            } else {
                if (node.rightNode == null) {
                    node.rightNode = new TreeNode(val);
                } else {
                    buildBinaryTree(node.rightNode, val);
                }
            }
        }
    }


    /**
     * 前序遍历
     * @param node
     */
    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " -> ");
            preOrder(node.leftNode);
            preOrder(node.rightNode);
        }

    }

    /**
     * 中序遍历
     * @param node
     */
    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.leftNode);
            System.out.print(node.val + " -> ");
            inOrder(node.rightNode);
        }

    }

    /**
     * 后序遍历
     * @param node
     */
    public void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.leftNode);
            postOrder(node.rightNode);
            System.out.print(node.val + " -> ");
        }
    }
}
