package com.lp.sort;


/**
 * @author :LiuPeng
 * Date    : 2019-07-1614:15
 * Email   :kyunglip1314@163.com
 * Description: 归并排序
 */
public class MergeSort {


    public static void sort(int[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }

        //1.创建与原数组相同长度的辅助数组
        int[] temp = new int[arr.length];
        merge(arr,temp,0,arr.length-1);
    }

    private static void merge(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            //2.采用二分法分解待排数组
            int mid = (low + high) / 2;
            merge(arr, temp, low, mid);
            merge(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid + 1, high);
        }
    }

    private static void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int numElements = rightEnd - leftPos + 1;
        int tempPos = leftPos;
        //3.对比左右两个数组并将较小的放到辅助数组
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (arr[leftPos] < arr[rightPos]) {
                temp[tempPos++] = arr[leftPos++];
            } else {
                temp[tempPos++] = arr[rightPos++];
            }
        }

        //4.将左数组中剩余的原数放到辅助数组
        while (leftPos <= leftEnd) {
            temp[tempPos++] = arr[leftPos++];
        }
        //5.将右数组中剩余的原数放到辅助数组
        while (rightPos <= rightEnd) {
            temp[tempPos++] = arr[rightPos++];
        }
        //6.将辅助数组中的数据复制到原数组中
        for (int i = 0; i < numElements; i++, rightEnd--) {
            arr[rightEnd] = temp[rightEnd];
        }

    }
//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.创建与原数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private static void merge(int[] arr, int[] temp, int low, int high) {
//        if (low < high) {
//            //2.采用二分法分解待排数组
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private static void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //3.对比左右两个数组将较小的复制到辅助数组
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.将左边数组中剩余的原数复制到辅助数组
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.将右边数组中剩余的原数复制到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//
//        //6.将辅助数组中的数据复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//    }
//    public static void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.创建与数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private static void merge(int[] arr, int[] temp, int low, int high) {
//        if (low < high) {
//            //2.采用二分法分解待排数组
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//
//        }
//    }
//
//    private static void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //3.对比左右两个数组并将较小的复制到辅助数组
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.将左数组中剩余的原数复制到辅助数组
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.将右数组中剩余的原数复制到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //6.将辅助数组中的数据复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//
//    }
//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.创建与原数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        if (low < high) {
//            //2.采用二分法分解待排数组
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //3.对比左右两个数组并将较小的复制到辅助数组
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.将左数组剩余的原数复制到辅助数组
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.将右数组剩余的原数复制到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //6.将辅助书中的数据复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//    }


//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.创建与原数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        if (low < high) {
//            //2.采用二分法分解待排数组
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos-1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //3.对比左右两个数组并将较小的复制到辅助数组
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.将左数组剩余的原数复制到辅助数组
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.将右数组剩余的原数复制到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //6.将辅助数组中的数据复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//    }

//    public void sort(int[] arr) {
//        //1.创建与原数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        if (low < high) {
//            //2.采用二分法分解待排数组
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int lefEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//
//        //3.比较左右两个数组将较小的复制到辅助数组
//        while (leftPos <= lefEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.将左数组剩余的原数复制到辅助数组
//        while (leftPos <= lefEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.将右数组剩余的原数复制到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //6.将辅助数组中数据复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//
//    }

//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.创建与原数组相同长度的临时数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        //2.采用二分法分解待排数组
//        if (low < high) {
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//    }


//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 1) {
//            return;
//        }
//        //1.创建与原数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        if (low < high) {
//            //2.采用二分法分解待排数组
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            //3.归并
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //1.比较左右两个数组并将较小的数放到辅助数组
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //2.将左数组中剩余的原数放到辅助数组
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //3.将右数组中剩余的原数放到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //4.将辅助数组中的数组复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//    }

//    public void sort(int[] arr) {
//        //1.创建与原数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        //2.采用二分法分解待排数组
//        if (low < high) {
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int letEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //3.比较左右两个数组将较小的数值放到辅助数组
//        while (leftPos <= letEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.将左数组中剩余的原数放到辅助数组
//        while (leftPos <= letEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.将右数组中剩余的原数放到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //6.将辅助数组中的数组复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//
//    }


//    public void sort(int[] arr) {
//        //1.创建与原数组相同长度的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        //2.采用二分法对原数组进行分组
//        if (low < high) {
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //3.对比左右两个数组并将较小的数放到辅助数组
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.把左数组中剩余的原数复制到辅助数组
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.把右数组中剩余的原数复制到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //6.把辅助数组中的数据复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//    }

//    public void sort(int[] arr) {
//        if (null == arr || arr.length <= 0) {
//            return;
//        }
//        //1.创建与原数组长度相同的辅助数组
//        int[] temp = new int[arr.length];
//        merge(arr, temp, 0, arr.length - 1);
//    }
//
//    private void merge(int[] arr, int[] temp, int low, int high) {
//        //2.采用二分法分解数组
//        if (low < high) {
//            int mid = (low + high) / 2;
//            merge(arr, temp, low, mid);
//            merge(arr, temp, mid + 1, high);
//            merge(arr, temp, low, mid + 1, high);
//        }
//    }
//
//    private void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
//        int leftEnd = rightPos - 1;
//        int numElements = rightEnd - leftPos + 1;
//        int tempPos = leftPos;
//        //3.比较左右两数组并将较小的放到辅助数组
//        while (leftPos <= leftEnd && rightPos <= rightEnd) {
//            if (arr[leftPos] < arr[rightPos]) {
//                temp[tempPos++] = arr[leftPos++];
//            } else {
//                temp[tempPos++] = arr[rightPos++];
//            }
//        }
//        //4.把左数组中剩余原数放到辅助数组
//        while (leftPos <= leftEnd) {
//            temp[tempPos++] = arr[leftPos++];
//        }
//        //5.把右数组中剩余原数放到辅助数组
//        while (rightPos <= rightEnd) {
//            temp[tempPos++] = arr[rightPos++];
//        }
//        //6把辅助数组中的数据复制到原数组
//        for (int i = 0; i < numElements; i++, rightEnd--) {
//            arr[rightEnd] = temp[rightEnd];
//        }
//
//    }
}
