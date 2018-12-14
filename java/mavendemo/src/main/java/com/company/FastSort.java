package com.company;

public class FastSort {

    public void quickSort(int[] arr, int L, int R) {
        int i = L;
        int j = R;

        //支点
        int pivot = arr[(L + R) / 2];

        //左右两端进行扫描，只要两端还没有交替，就一直扫描
        while (i <= j) {

            //寻找直到比支点大的数
            while (pivot > arr[i]){
                i++;
            }


            //寻找直到比支点小的数
            while (pivot < arr[j]){
                j--;
            }


            //此时已经分别找到了比支点小的数(右边)、比支点大的数(左边)，它们进行交换
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        //上面一个while保证了第一趟排序支点的左边比支点小，支点的右边比支点大了。


        //“左边”再做排序，直到左边剩下一个数(递归出口)
        if (L < j){
            quickSort(arr, L, j);
        }


        //“右边”再做排序，直到右边剩下一个数(递归出口)
        if (i < R){
            quickSort(arr, i, R);
        }

    }

}
