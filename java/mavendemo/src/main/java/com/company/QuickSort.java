package com.company;

public class QuickSort {
    public static int divide(int[] a, int start, int end){
        //每次都以最右边的元素作为基准值
        int base = a[end];
        while(start < end){
            while(start < end && a[start] <= base)
                start++;
            if(start < end){
                //交换
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                end--;
            }
            while(start < end && a[end] >= base)
                end--;
            if(start < end){
                //交换
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
            }

        }
        return end;
    }
    public static void sort(int[] a, int start, int end){
        if(start > end){
            return;
        }
        else{
            int partition = divide(a, start, end);
            sort(a, start, partition-1);
            sort(a, partition+1, end);
        }

    }

}
