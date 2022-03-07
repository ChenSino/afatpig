package com.chen.tree;

/**
 * 深度优先查询二叉树的高度——栈方法，递归方法转非递归，基本都可以通过栈来实现，但并不是所有的递归都可以转化为非递归
 *
 * @author chenkun
 * @Description
 * @date 2022/2/15 上午10:48
 */
public class DFS_Stack {
    public static void main(String[] args) {
        Node node_3 = new Node(3);
        Node node_4 = new Node(4);
        Node node_15 = new Node(15);
        Node node_7 = new Node(7);
        Node node_20 = new Node(20);

        node_3.setLeft(node_4);
        node_3.setRight(node_20);
        node_20.setLeft(node_15);
        node_20.setRight(node_7);

        int height = getHeight(node_4);
        System.out.println(height);
    }

    /**
     * 查询一个节点的高度，节点的高度=左节点和右节点之间的最大高度
     * @param node
     * @return
     */
    public static int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.getLeft()) + 1, getHeight(node.getRight()) + 1);
    }
}
