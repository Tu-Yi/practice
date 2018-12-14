package com.company;

public class BubbleSort {

    protected  int[] arrays;


    int Sort(){

        // 记录执行了多少趟
        int num = 0;

        // 记录是否发生了置换， false 表示没有发生置换、 true 表示发生了置换
        boolean isChange;

        // 临时变量，用于置换
        int temp;

        // 外层循环-排序趟数-(n-1)
        for (int i=0;i<arrays.length-1;i++){

            isChange=false;

            // 内层循环-本趟中的置换次数
            for (int j=0;j<arrays.length-i-1;j++){

                // 前一位与后一位与前一位比较，如果前一位比后一位要大，那么交换
                // 并不需要与最后一位比较了，因为在第一趟排序完了，最后一位已经是最大的数了
                if(arrays[j]>arrays[j+1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                    isChange=true;
                }
            }

            // 如果进到这里面了，说明发生置换了
            // 如果在某躺排序中没有发生交换位置，那么我们可以认为该数组已经排好序了
            if(isChange==false){
                break;
            }

            num++;
        }

        return num;
    }
}

