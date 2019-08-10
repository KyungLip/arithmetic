package com.lp.sort;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1614:42
 * Email   :kyunglip1314@163.com
 * Description: 插入排序
 */
public class InsertSort {

    public static void sort(int[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }
        int tmp;
        int sortedIndex;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            sortedIndex = i - 1;
            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
                arr[sortedIndex + 1] = arr[sortedIndex];
                sortedIndex--;
            }
            arr[sortedIndex + 1] = tmp;
        }
    }

//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//    }
//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//    }

//    public void sort(int[] arr) {
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//    }


//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//
//    }


//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//    }

//    public void sort(int[] arr) {
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//
//    }


//    public void sort(int[] arr) {
//        int tmp;
//        int sortedIndex;
//        for (int i = 1; i < arr.length; i++) {
//            tmp = arr[i];
//            sortedIndex = i - 1;
//            while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                arr[sortedIndex + 1] = arr[sortedIndex];
//                sortedIndex--;
//            }
//            arr[sortedIndex + 1] = tmp;
//        }
//    }
}
