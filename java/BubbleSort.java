package com.lp.sort;

import com.lp.utils.Utils;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1614:33
 * Email   :kyunglip1314@163.com
 * Description: 冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    Utils.swap(j - 1, j, arr);
                    flag = false;
                }
            }
            if (flag) {
                return;
            }
        }
    }
//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }

//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }

//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }

//    public void sort(int[] arr) {
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }


//    public void sort(int[] arr) {
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }

//
//    public void sort(int[] arr) {
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
//    }

//    public void sort(int[] arr) {
//        boolean flag;
//        for (int i = 0; i < arr.length; i++) {
//            flag = true;
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    Utils.swap(j - 1, j, arr);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                return;
//            }
//        }
//    }
}
