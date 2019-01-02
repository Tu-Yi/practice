package com.company;

/**
 * 二分查找，数组必须先排序
 */
public class SplitHalfSearch {

    private int[] arr;

    public SplitHalfSearch(int[] arr) {
        this.arr = arr;
    }

    public int splitHalfSearch(int value){
        int max,min,mid;
        min = 0;
        max = arr.length-1;

        while (min<=max){
            mid = (min+max)>>1;
            if(value>arr[mid]){
                min = mid + 1;
            }else if( value < arr[mid]){
                max = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
