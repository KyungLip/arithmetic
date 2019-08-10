package com.lp.sort;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1614:55
 * Email   :kyunglip1314@163.com
 * Description: 希尔排序
 */
public class ShellSort {

    public static void sort(int[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }

        int tmp;
        int sortedIndex;
        for (int d = arr.length / 2; d > 0; d = d / 2) {
            for (int i = d; i < arr.length; i++) {
                tmp = arr[i];
                sortedIndex = i - d;
                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
                    arr[sortedIndex + d] = arr[sortedIndex];
                    sortedIndex = sortedIndex - d;
                }
                arr[sortedIndex + d] = tmp;
            }
        }
    }
//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }

//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }

//    public void sort(int[] arr) {
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + 1] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }

//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            int tmp;
//            int sortedIndex;
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }


//    public void sort(int[] arr) {
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }
//    public void sort(int[] arr) {
//        int tmp;
//        int sortedIndex;
//        for (int d = arr.length / 2; d > 0; d = d / 2) {
//            for (int i = d; i < arr.length; i++) {
//                tmp = arr[i];
//                sortedIndex = i - d;
//                while (sortedIndex >= 0 && arr[sortedIndex] > tmp) {
//                    arr[sortedIndex + d] = arr[sortedIndex];
//                    sortedIndex = sortedIndex - d;
//                }
//                arr[sortedIndex + d] = tmp;
//            }
//        }
//    }
}
