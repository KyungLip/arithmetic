package com.lp.search;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1616:52
 * Email   :kyunglip1314@163.com
 * Description:
 * 最新改动时间:2019-07-17-10:40
 */
public class HalfSearch {

    public int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }

//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid + 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }


//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//
//            }
//        }
//        return -1;
//    }


//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }


//
//    public int search(int[] arr, int key) {
//        if (null == arr || arr.length <= 0) {
//            return -1;
//        }
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }


//    public int search(int[] arr, int key) {
//        if (null == arr || arr.length <= 0) {
//            return -1;
//        }
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <=high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }

//    public int search(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = (low + high) / 2;
//            if (key < arr[mid]) {
//                high = mid - 1;
//            } else if (key > arr[mid]) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
}
