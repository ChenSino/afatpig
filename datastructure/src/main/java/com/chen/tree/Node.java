package com.chen.tree;

/**
 * 双向
 * @author chenkun
 * @Description
 * @date 2022/2/15 上午10:45
 */
public class Node {
    private Integer value;

    private Node left;
    private Node right;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(Integer value) {
        this.value = value;
    }

    public Node() {
    }
}
