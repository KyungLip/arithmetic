package com.lp.binarytree;

import android.util.Log;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1212:02
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class BinaryTree {
    private static final String TAG = "BinaryTree";
    Node rootNode;

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void preOrderTraaverse(Node node) {
        if (node == null) {
            return;
        }

        Log.e(TAG, node.data + "");
        preOrderTraaverse(node.leftNode);
        preOrderTraaverse(node.rightNode);

    }

    public void postOrderTraverse(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.leftNode);
        Log.e(TAG, node.data + "");
        postOrderTraverse(node.rightNode);
    }

    public void depthFirstTraverse(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            Log.e(TAG, "深度优先遍历:" + n.data);
            if (null != n.rightNode) {
                stack.push(n.rightNode);
            }
            if (null != n.leftNode) {
                stack.push(n.leftNode);
            }

        }
    }

    public void boardFirstTraverse(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> linkedList = new LinkedList<>();
        linkedList.add(node);
        while (!linkedList.isEmpty()) {
            Node n = linkedList.poll();
            Log.e(TAG, "广度优先遍历:" + n.data);
            if (null != n.leftNode) {
                linkedList.add(n.leftNode);
            }
            if (null != n.rightNode) {
                ((LinkedList<Node>) linkedList).add(n.rightNode);
            }

        }
    }

}
