package com.lp.utils;

/**
 * @author :LiuPeng
 * Date    : 2019-07-1519:18
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class Utils {

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
