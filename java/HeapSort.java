package com.lp.sort;


import com.lp.utils.Utils;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1519:17
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class HeapSort {
    private static final String TAG = "HeapSort";

    public static void sort(int[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }
        //1.构建堆,从最后一个非叶子结点开始，从下到上，从右到左一次构建
        for (int i = arr.length / 2 - 1; i <= 0; i--) {
            adjust(arr, i, arr.length);
        }
        //2.调整堆+交换堆顶与末尾元素

        for (int j = arr.length - 1; j > 0; j--) {
            Utils.swap(0, j, arr);
            adjust(arr, 0, j);
        }
    }

    private static void adjust(int[] arr, int i, int length) {
        int tmp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k + 1] > arr[k]) {
                k++;
            }

            if (arr[k] > tmp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }

        arr[i]=tmp;
    }
//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//
//        //1.构建堆,找到最后一个非叶子结点，从下到上，从左到右依次构建
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjust(arr, i, arr.length);
//        }
//        //2.调整堆+交换堆顶与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjust(arr, 0, j);
//        }
//    }
//
//    private static void adjust(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//    }

//    public static void sort(int[] arr) {
//        //1.构建堆,从最后一个非叶子结点，从下到上，从右到左开始构建
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjust(arr, i, arr.length);
//        }
//        //2.调整堆+交换堆顶与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjust(arr, 0, j);
//        }
//    }
//
//    private static void adjust(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.构建堆，找到最后一个非叶子结点，从下到上，从右到左一次构建
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjust(arr, i, arr.length);
//        }
//        //2.调整堆+交换堆顶与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjust(arr, 0, j);
//        }
//    }
//
//    private void adjust(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//    }


//    public void sort(int[] arr) {
//        //1.构建堆,找到最后一个非叶子结点，从下到上，从右到左一次构建
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjust(arr, i, arr.length);
//        }
//        //2.调整堆+交换堆顶与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjust(arr, 0, j);
//        }
//    }
//
//    private void adjust(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//    }

//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.构建推，找到最后一个非叶子结点，从下到上，从左到右构建
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjust(arr, i, arr.length);
//        }
//        //2.调整堆+交换堆顶与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjust(arr, 0, j);
//        }
//    }
//
//    private void adjust(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//    }


//    public void sort(int[] arr) {
//        //1.构建大顶推,从最后一个非叶子结点
//
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjust(arr, i, arr.length);
//        }
//        //2.调整堆+交换堆顶与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(j, 0, arr);
//            adjust(arr, 0, j);
//        }
//    }
//
//    private void adjust(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//    }


//    public void sort(int[] arr) {
//        //1.构建堆，找到最后一个非叶子结点，从下到上，从右到左开始构建
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjustHeap(arr, i, arr.length);
//        }
//        //2.调整堆+交换堆顶与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjustHeap(arr, 0, j);
//        }
//    }
//
//    private void adjustHeap(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//    }


//
//    public void sort(int[] arr) {
//        //1.构建堆，大顶推,找到最后一个非叶子结点，从下到上，从左到右构建
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjustHeap(arr, i, arr.length);
//        }
//
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjustHeap(arr, 0, j);
//        }
//
//    }
//
//    private void adjustHeap(int[] arr, int i, int length) {
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            //比较左右孩子
//            if (k + 1 < length && arr[k + 1] > arr[k]) {
//                k++;
//            }
//            //比较根
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//
//    }

//    public void sort(int[] arr) {
//        //1.构建大顶推
//        for (int i = arr.length / 2-1; i >= 0; i--) {
//            adjustHeap(arr, i, arr.length);
//        }
//        //2.调整堆jiegou+交换堆顶元素与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjustHeap(arr, 0, j);
//        }
//    }
//
//    private void adjustHeap(int[] arr, int i, int length) {
//
//        int tmp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k] < arr[k + 1]) {
//                k++;
//            }
//            if (arr[k] > tmp) {
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = tmp;
//
//    }
//    public static void sort(int[] arr) {
//        //1.构建大顶堆
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            //从第一个非叶子结点从下至上，从右至左调整结构
//            adjustHeap(arr, i, arr.length);
//        }
//        //2.调整堆结构+交换堆顶元素与末尾元素
//        for (int j = arr.length - 1; j > 0; j--) {
//            swap(arr, 0, j);//将堆顶元素与末尾元素进行交换
//            adjustHeap(arr, 0, j);//重新对堆进行调整
//        }
//
//    }
//
//    /**
//     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
//     *
//     * @param arr
//     * @param i
//     * @param length
//     */
//    public static void adjustHeap(int[] arr, int i, int length) {
//        int temp = arr[i];//先取出当前元素i
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
//            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
//                k++;
//            }
//            if (arr[k] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
//                arr[i] = arr[k];
//                i = k;
//            } else {
//                break;
//            }
//        }
//        arr[i] = temp;//将temp值放到最终的位置
//    }


//    public void sort(int[] arr) {
//        //1.构建堆
//        for (int i = arr.length / 2 - 1; i >= 0; i--) {
//            adjustHeap(arr, i, arr.length);
//        }
//
//        for (int j = arr.length - 1; j > 0; j--) {
//            Utils.swap(0, j, arr);
//            adjustHeap(arr, 0, j);
//        }
//
//    }
//
//    private void adjustHeap(int[] arr, int i, int length) {
//
//        int temp = arr[i];
//        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
//            if (k + 1 < length && arr[k + 1] > arr[k]) {
//                k++;
//            }
//
//            if (arr[k] > temp) {
//                arr[i] = arr[k];
//                i = k;
//            }
//        }
//        arr[i] = temp;
//    }
}
