package com.lp.data;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1615:40
 * Email   :kyunglip1314@163.com
 * Description: 自定义线性表(使用数组)
 */
public class ArrayList<E> {
    Object[] data = null;//用来保存此队列中内容的数组
    int current;//保存当前为第几个元素的指标
    int capacity;//表示数组大小的指标

    /**
     * 默认构造函数
     */
    public ArrayList() {
        this(10);//默认大小为10
    }

    /**
     * 指定大小的构造函数
     *
     * @param initalSize
     */
    public ArrayList(int initalSize) {
        if (initalSize < 0) {
            throw new RuntimeException("数组大小错误" + initalSize);
        } else {
            this.data = new Object[initalSize];
            this.current = 0;
            this.capacity = initalSize;
        }
    }

    public boolean add(E e) {
        ensureCapacity(current);//确认当前容量
        this.data[current] = e;
        current++;
        return true;

    }

    /**
     * 确认表当钱容量是否满足需要，如果满足，则执行操作，如果不满足，则增加容量。
     *
     * @param cur 当前容量
     */
    private void ensureCapacity(int cur) {
        if (cur == capacity) {
            //容量达到极限需要扩容，增加10容量，复制当前数组
            this.capacity = this.capacity*3;
            Object[] newData = new Object[capacity];
//            System.arraycopy(data, 0, newData, 0, data.length);
            for(int i=0;i<cur;i++){
                newData[i]=data[i];
            }
            this.data = newData;

        }
    }

    /**
     * 得到指定下标的数组
     *
     * @param index
     * @return
     */
    public E get(int index) {
        validateIndex(index);//验证下标合法性
        return (E) this.data[index];
    }

    /**
     * 返回当前队列的大小
     *
     * @return
     */
    public int size() {
        return this.current;
    }

    /**
     * 更改指定下标元素的数组为e
     *
     * @param index
     * @return
     */
    public boolean set(int index, E e) {
        validateIndex(index);//验证下标合法性
        this.data[index] = e;
        return true;

    }


    /**
     * 验证当前下标是否合法，如果不合法，抛出运行时异常
     *
     * @param index 下标
     */
    private void validateIndex(int index) {
        if (index < 0 || index > current) {
            throw new RuntimeException("数组index错误：" + index);
        }
    }

    /**
     * 在指定位置下标位置插入数据e
     *
     * @param index
     * @param e
     * @return
     */
    public boolean insert(int index, E e) {
        validateIndex(index);//验证下标的合法性
        //用一个临时数组作为备份
        Object[] temp = new Object[capacity];
        for (int i = 0; i < current; i++) {
            if (i < index) {
                temp[i] = this.data[i];
            } else if (i == index) {
                temp[i] = e;
            } else if (i > index) {
                temp[i] = this.data[i - 1];
            }
        }
        this.data = temp;
        return true;

    }

    /**
     * 删除指定下标的数据
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        validateIndex(index);//验证下标的合法性
        Object[] temp = new Object[capacity];
        for (int i = 0; i < current; i++) {
            if (i < index) {
                temp[i] = this.data[i];
            } else if (i == index) {
                temp[i] = this.data[i + 1];
            } else if (i > index) {
                temp[i] = this.data[i + 1];
            }
        }
        this.data = temp;
        return true;
    }
}