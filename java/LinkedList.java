package com.lp.data;


/**
 * @author :LiuPeng
 * Date    : 2019-07-1616:19
 * Email   :kyunglip1314@163.com
 * Description: 自定义链式存储的线性表(链表)
 */
public class LinkedList<E> {
    private Node<E> header = null;//头结点
    private Node<E> last;
    int size = 0;//表示大小的指标

    public LinkedList() {
        this.header = new Node<E>();
    }

    /**
     * 遍历当前链表，取得给定索引对应的元素
     *
     * @param index
     * @return
     */
    public Node<E> getNode(int index) {
        //验证索引合法性
        if (index < 0 || index > size) {
            throw new RuntimeException("索引值有错:" + index);
        }
        Node<E> tem = new Node<E>();
        tem = header;
        int count = 0;
        while (count != index) {
            tem = tem.next;
            count++;
        }
        return tem;
    }

    public boolean add(E e) {
        if (size == 0) {
            header.e = e;
            last = header;
        } else {
            //根据需要添加的内容，封装为结点
            Node<E> newNode = new Node<E>(e);
            last.addNext(newNode);
            last = newNode;
        }
        size++;
        return true;

    }

    /**
     * 用来存放数据的结点型内部类
     *
     * @param <E>
     */
    class Node<E> {
        private E e;//数据
        Node next;//用来指向该结点的下一个结点

        Node() {
        }

        public Node(E e) {
            this.e = e;
        }

        void addNext(Node<E> next) {
            this.next = next;
        }
    }

    public boolean insert(int index, E e) {
        //验证下标的合法性
        if (index > size || index < 0) {
            throw new RuntimeException("下标值有错:" + index);
        }
        Node<E> newNode = new Node<>(e);
        Node<E> node = getNode(index);
        newNode.next = node.next;
        node.next = newNode;
        size++;
        return true;
    }

    public int size() {
        return this.size;
    }

    public boolean set(int index, E e) {
        //验证下标的合法性
        if (index > size || index < 0) {
            throw new RuntimeException("下标值有错" + index);
        }
        Node<E> node = getNode(index);
        node.e = e;
        return true;
    }

}