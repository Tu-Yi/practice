package com.company;

public class Recursion {

    /**
     * @param arrays
     * @param L 0
     * @param R arrays.length-1
     * @return
     */
    int findMax(int[] arrays,int L,int R){

        if(L==R){
            return arrays[L];
        }else{
            int first = arrays[L];
            int restMax = findMax(arrays,L+1,R);

            if(first>restMax){
                return first;
            }else{
                return restMax;
            }
        }
    }

    /**
     * @param arrays
     * @param L 0
     * @param R arrays.length-1
     */
    void bubbleSort(int[] arrays,int L,int R){

        int temp;

        if(L==R){
            return;
        }
        else{
            for(int i=L;i<R;i++){
                if(arrays[i]>arrays[i+1]){
                    temp = arrays[i];
                    arrays[i] = arrays[i+1];
                    arrays[i+1] = temp;
                }
            }
        }


        bubbleSort(arrays,L,R-1);
    }
}
