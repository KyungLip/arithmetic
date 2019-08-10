package com.lp.search;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1617:28
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class InsertSearch {

    public int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//    public int search(int[] arrk, int key) {
//        int low = 0;
//        int high = arrk.length - 1;
//        int mid;
//        while (low <= high) {
//            mid = low + (high - low) * (key - arrk[low]) / (arrk[high - arrk[low]]);
//            if (key < arrk[mid]) {
//                high = mid - 1;
//            } else if (key > arrk[mid]) {
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
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//        while (low <= high) {
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
//            mid = low + (high - low) * (key - arr[low]) / (arr[high] - arr[low]);
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
