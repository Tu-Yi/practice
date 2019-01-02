package com.company;

/**
 * 选择排序 selectSortU更加优化
 */
public class SelectSort {
    private int[] arr;

    public SelectSort(int[] arr) {
        this.arr = arr;
    }

    public void selectSort(){
        for(int x=0;x<arr.length-1;x++){
            for(int y=x+1;y<arr.length;y++){
                if(arr[x]>arr[y]){
                    swap(arr,x,y);
                }
            }
        }
    }

    public void selectSortU(){
        for(int x=0;x<arr.length-1;x++){
            int num = arr[x];
            int index = x;
            for(int y=x+1;y<arr.length;y++){
                if(num>arr[y]){
                    num = arr[y];
                    index = y;
                }
            }
            if(index!=x){
                swap(arr,x,index);
            }
        }
    }

    private void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public void display(){
        for(int i : arr){
            if(i!=arr[arr.length-1]){
                System.out.print(i + ",");
            }
            else{
                System.out.print(i);
            }
        }
    }
}
