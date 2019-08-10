package com.lp.binarytree;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1212:00
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class Node<T> {
    T data;
    Node leftNode;
    Node rightNode;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node leftNode, Node rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
