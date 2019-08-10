package com.lp.search;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1710:33
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class FibonacciSearch {

    public int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        //1.创建斐波那契数组
        int[] f = createFibonacciArray(arr.length);
        int k = 0;
        //2.在斐波那契数组中找到一个略大于arr数组长度的k值
        while (arr.length > f[k] - 1) {
            k++;
        }
        //3.创建辅助数组,并填充
        int[] temp = new int[f[k] - 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        for (int j = arr.length; j < f[k] - 1; j++) {
            temp[j] = temp[high];
        }
        while (low <= high) {
            mid = low + f[k - 1] - 1;
            if (key < temp[mid]) {
                high = mid - 1;
                k = k - 1;
            } else if (key > temp[mid]) {
                low = mid + 1;
                k = k - 2;
            } else {
                if (mid < high) {
                    return mid;
                } else {
                    return high;
                }
            }
        }
        return -1;
    }

    public int[] createFibonacciArray(int length) {
        int[] array = new int[length];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        //1.创建斐波那契数组
//        int[] f = createFibonacciArray(arr.length);
//        int k = 0;
//        //2.在斐波那契数组中找到一个略大于arr数组长度的k值
//        while (arr.length > f[k] - 1) {
//            k++;
//        }
//        //3.创建长度为f[k]-1的临时数组
//        int[] temp = new int[f[k] - 1];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        for (int j = arr.length; j < f[k] - 1; j++) {
//            temp[j] = temp[high];
//        }
//
//        while (low <= high) {
//            mid = low + f[k - 1] - 1;
//            if (key < temp[mid]) {
//                high = mid - 1;
//                k = k - 1;
//            } else if (key > temp[mid]) {
//                low = mid + 1;
//                k = k - 2;
//            } else {
//                if (mid <= high) {
//                    return mid;
//                } else {
//                    return high;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int[] createFibonacciArray(int length) {
//        int[] array = new int[length];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }

//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        //1.创建斐波那契数组
//        int[] f = createFibonacciArray(arr.length);
//        int k = 0;
//        //2.在斐波那契数组中找到一个比arr数组长度略大于的k值
//        while (arr.length > f[k] - 1) {
//            k++;
//        }
//        //3.创建长度为f[k]-1的临时数组，并补全
//        int[] temp = new int[f[k] - 1];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        for (int j = arr.length; j < f[k] - 1; j++) {
//            temp[j] = temp[high];
//        }
//        while (low <= high) {
//            mid = low + f[k - 1] - 1;
//            if (key < temp[mid]) {
//                high = mid - 1;
//                k = k - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//                k = k - 2;
//            } else {
//                if (mid <= high) {
//                    return mid;
//                } else {
//                    return high;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int[] createFibonacciArray(int length) {
//        int[] array = new int[length];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }

//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        //1.创建斐波那契数组
//        int[] f = createFibonacciArray(arr.length);
//        int k = 0;
//        //2.在斐波那契数组中找到一个略大于arr数组长度的k值
//        while (arr.length > f[k] - 1) {
//            k++;
//        }
//        //3.创建长度为f[k]-1的临时数组，并补全
//        int[] temp = new int[f[k] - 1];
//        for (int i = 0; i < arr.length - 1; i++) {
//            temp[i] = arr[i];
//        }
//        for (int j = arr.length; j < f[k] - 1; j++) {
//            temp[j] = temp[high];
//        }
//        while (low <= high) {
//            mid = low + f[k - 1] - 1;
//            if (key < temp[mid]) {
//                high = mid - 1;
//                k = k - 1;
//            } else if (key > temp[mid]) {
//                low = mid + 1;
//                k = k - 2;
//            } else {
//                if (mid <= high) {
//                    return mid;
//                } else {
//                    return high;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int[] createFibonacciArray(int length) {
//        int[] array = new int[length];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }
//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//
//        //1.创建斐波那契数组
//        int[] f = createFibonacciArray(arr.length);
//        int k = 0;
//        //2.在斐波那契数组中找到略大于arr数组长度的k值
//        while (arr.length > f[k] - 1) {
//            k++;
//        }
//
//        //3.创建长度为f[k]-1的辅助数组，并补全
//        int[] temp = new int[f[k] - 1];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        for (int j = arr.length; j < f[k] - 1; j++) {
//            temp[j] = temp[high];
//        }
//        while (low <= high) {
//            mid = low + f[k - 1] - 1;
//            if (key < temp[mid]) {
//                high = mid - 1;
//                k = k - 1;
//            } else if (key > temp[mid]) {
//                low = mid + 1;
//                k = k - 2;
//            } else {
//                if (mid <= high) {
//                    return mid;
//                } else {
//                    return high;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int[] createFibonacciArray(int length) {
//        int[] array = new int[length];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }


//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        //1.创建斐波那契数组
//        int[] f = createFibonacciArray(arr.length);
//        int k=0;
//        //2.在斐波那契数组中找到一个比arr数组长度略大的k值
//        while (arr.length > f[k] - 1) {
//            k++;
//        }
//        //3.创建辅助数组，并补全
//        int[] temp = new int[f[k] - 1];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        for (int j = arr.length; j < f[k] - 1; j++) {
//            temp[j] = temp[high];
//        }
//
//        while (low <= high) {
//            mid = low + f[k - 1] - 1;
//            if (key < arr[mid]) {
//                high = mid - 1;
//                k = k - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//                k = k - 2;
//            } else {
//                if (mid <= high) {
//                    return mid;
//                } else {
//                    return high;
//                }
//            }
//        }
//        return -1;
//    }
//
//
//    public int[] createFibonacciArray(int length) {
//        int[] array = new int[length];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }

//    public int search(int[] arr, int key) {
//        if (null == arr || arr.length <= 0) {
//            return -1;
//        }
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        //1.创建斐波那契数组
//        int[] f = createFibonacciArray(arr.length);
//        int k = 0;
//        //2.在斐波那契数组中找到一个略大于arr数组长度的k值
//        while (arr.length > f[k] - 1) {
//            k++;
//        }
//        //3.创建辅助数组并按照f[k]-1的长度补全，目的是为了使用斐波那契的黄金分割
//        int[] temp = new int[f[k] - 1];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        for (int j = arr.length; j < f[k] - 1; j++) {
//            temp[j] = temp[high];
//        }
//
//        while (low <= high) {
//            mid = low + f[k - 1] - 1;
//            if (key < temp[mid]) {
//                high = mid - 1;
//                k = k - 1;
//            } else if (key > temp[mid]) {
//                low = mid + 1;
//                k = k - 2;
//            } else {
//                if (mid <= high) {
//                    return mid;
//                } else {
//                    return high;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int[] createFibonacciArray(int length) {
//        int[] array = new int[length];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }

//    public int search(int[] arr, int key) {
//        if (null == arr || arr.length <= 0) {
//            return -1;
//        }
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        //1.创建斐波那契数组
//        int[] f = createFibonacciArray(arr.length);
//        //斐波那契数组分割数值
//        int k = 0;
//        //2.在斐波那契数组中找到一个略大于arr数组长度的k值
//        while (arr.length > f[k] - 1) {
//            k++;
//        }
//        //3.创建临时数组，并按照f[k]-1长度补全,用最后一位值补全
//        int[] temp = new int[f[k] - 1];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        for (int j = arr.length; j < f[k] - 1; j++) {
//            temp[j] = temp[high];
//        }
//        while (low <= high) {
//            mid = low + f[k - 1] - 1;
//            if (key < temp[mid]) {
//                high = mid - 1;
//                k = k - 1;
//            } else if (key > temp[mid]) {
//                low = mid + 1;
//                k = k - 2;
//            } else {
//                if (mid <= high) {
//                    return mid;
//                } else {
//                    return high;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int[] createFibonacciArray(int length) {
//        int[] array = new int[length];
//        array[0] = 0;
//        array[1] = 1;
//        for (int i = 2; i < length; i++) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }
}
