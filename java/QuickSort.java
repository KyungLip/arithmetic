package com.lp.sort;

import com.lp.utils.Utils;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1615:05
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class QuickSort {

    public static void sort(int[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }
        sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr, int low, int high) {
        if(low>high){
            return;
        }
        int i = low;
        int j = high;
        int tmp = arr[low];

        while (i < j) {
            while (tmp <= arr[j] && i < j) {
                j--;
            }
            while (tmp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                Utils.swap(i, j, arr);
            }
        }
        //交换基准值
        arr[low] = arr[j];
        arr[j] = tmp;
        sort(arr, low, j - 1);
        sort(arr, j + 1, high);
    }

//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private static void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int tmp = arr[low];
//        int i = low;
//        int j = high;
//        while (i < j) {
//            while (tmp <= arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >= arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                Utils.swap(i, j, arr);
//            }
//        }
//        //基准值交换
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        sort(arr, low, j - 1);
//        sort(arr, j + 1, high);
//    }

//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private static void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int tmp = arr[low];
//        int i = low;
//        int j = high;
//        while (i < j) {
//            while (tmp <= arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >= arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                Utils.swap(i, j, arr);
//            }
//        }
//        //基准值交换
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        sort(arr, low, j - 1);
//        sort(arr, j + 1, high);
//
//    }

//    public void sort(int[] arr) {
//        if (arr == null || arr.length <= 1) {
//            return;
//        }
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i = low;
//        int j = high;
//        int tmp = arr[low];
//
//        while (i < j) {
//            while (tmp <=arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >=arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                Utils.swap(i, j, arr);
//            }
//        }
//        //基准点交换
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        sort(arr, low, j - 1);
//        sort(arr, j + 1, high);
//
//    }


//    public void sort(int[] arr) {
//        if (arr == null || arr.length <= 1) {
//            return;
//        }
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i = low;
//        int j = high;
//        int tmp = arr[low];
//        while (i < j) {
//            while (tmp <= arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >= arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                Utils.swap(i, j, arr);
//            }
//        }
//        //基准值交换
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        sort(arr, low, j - 1);
//        sort(arr, j + 1, high);
//    }

//    public void sort(int[] arr) {
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i = low;
//        int j = high;
//        int tmp = arr[low];
//        while (i < j) {
//            while (tmp <= arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >= arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                Utils.swap(i, j, arr);
//            }
//        }
//        //交换基准点
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        sort(arr, low, j - 1);
//        sort(arr, j + 1, high);
//    }
//

//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i = low;
//        int j = high;
//        int tmp = arr[low];
//
//        while (i < j) {
//            while (tmp <= arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >= arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                Utils.swap(i, j, arr);
//            }
//        }
//        //基准值交换
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        sort(arr, low, j - 1);
//        sort(arr, j + 1, high);
//    }


//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i = low;
//        int j = high;
//        int tmp = arr[low];
//        while (i < j) {
//            while (tmp <= arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >= arr[i] && i < j) {
//                i++;
//            }
//            //交换
//            if (i < j) {
//                Utils.swap(i, j, arr);
//            }
//        }
//        //基准数回归
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        sort(arr, low, j - 1);
//        sort(arr, j + 1, high);
//    }

//
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 0) {
//            return;
//        }
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i = low;
//        int j = high;
//        int tmp = arr[low];//基准点
//
//        while (i < j) {
//            while (tmp <= arr[j] && i < j) {
//                j--;
//            }
//            while (tmp >= arr[i] && i < j) {
//                i++;
//            }
//            Utils.swap(i, j, arr);
//        }
//        //基准点与j交换
//        arr[low] = arr[j];
//        arr[j] = tmp;
//        //递归
//        sort(arr, 0, j - 1);
//        sort(arr, j + 1, high);
//    }

//    public void sort(int[] arr) {
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i, j, temp, t;
//        i = low;
//        j = high;
//        temp = arr[low];
//        while ((i < j)) {
//            while (temp <= arr[j] && i < j) {
//                j--;
//            }
//            while (temp >= arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                t = arr[i];
//                arr[i] = arr[j];
//                arr[j] = t;
//            }
//        }
//        arr[low] = arr[j];
//        arr[j] = temp;
//        sort(arr, 0, j - 1);
//        sort(arr, j + 1, high);
//    }
//    public void sort(int[] arr) {
//        sort(arr, 0, arr.length - 1);
//    }
//
//    private void sort(int[] arr, int low, int high) {
//        if (low > high) {
//            return;
//        }
//        int i, j, temp, t;
//        i = low;
//        j = high;
//        temp = arr[low];
//
//        while (i < j) {
//            while (temp <= arr[j] && i < j) {
//                j--;
//            }
//            while (temp >= arr[i] && i < j) {
//                i++;
//            }
//            if (i < j) {
//                t = arr[i];
//                arr[i] = arr[j];
//                arr[j] = t;
//            }
//        }
//
//        arr[low] = arr[j];
//        arr[j] = temp;
//        sort(arr, 0, j - 1);
//        sort(arr, j + 1, high);
//    }
}
