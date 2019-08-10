package com.lp.sort;


import com.lp.utils.Utils;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1614:41
 * Email   :kyunglip1314@163.com
 * Description: 简单选择排序
 */
public class SelectSort {

    public static void sort(int[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[minIndex] > arr[j + 1]) {
                    minIndex = j + 1;
                }
            }
            Utils.swap(minIndex, i, arr);
        }
    }

//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int minIndex;
//        for (int i = 0; i < arr.length; i++) {
//            minIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[minIndex] > arr[j + 1]) {
//                    minIndex = j + 1;
//                }
//            }
//            Utils.swap(minIndex, i, arr);
//        }
//    }

//    public static void sort(int[] arr) {
//        int minIndex;
//        for (int i = 0; i < arr.length; i++) {
//            minIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[minIndex] > arr[j + 1]) {
//                    minIndex = j + 1;
//                }
//            }
//            Utils.swap(minIndex, i, arr);
//        }
//    }

//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int minIndex;
//        for (int i = 0; i < arr.length; i++) {
//            minIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[minIndex] > arr[j + 1]) {
//                    minIndex = j + 1;
//                }
//
//            }
//            Utils.swap(minIndex, i, arr);
//        }
//    }


//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int midIndex;
//        for (int i = 0; i < arr.length; i++) {
//            midIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[midIndex] > arr[j + 1]) {
//                    midIndex = j + 1;
//                }
//            }
//            Utils.swap(midIndex, i, arr);
//        }
//    }

//    public void sort(int[] arr) {
//        int minIndex;
//        for (int i = 0; i < arr.length; i++) {
//            minIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[minIndex] > arr[j + 1]) {
//                    minIndex = j + 1;
//                }
//            }
//            Utils.swap(minIndex, i, arr);
//        }
//    }


//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int minIndex;
//        for (int i = 0; i < arr.length; i++) {
//            minIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[minIndex] > arr[j + 1]) {
//                    minIndex = j + 1;
//                }
//            }
//            Utils.swap(minIndex, i, arr);
//
//        }
//    }


//    public void sort(int[] arr) {
//
//        int minIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            minIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[minIndex] > arr[j + 1]) {
//                    minIndex++;
//                }
//            }
//            Utils.swap(i, minIndex, arr);
//        }
//
//    }
//    public void sort(int[] arr) {
//        int minIndex;
//        for (int i = 0; i < arr.length; i++) {
//            minIndex = i;
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[minIndex] > arr[j + 1]) {
//                    minIndex++;
//                }
//            }
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
//    }
}
