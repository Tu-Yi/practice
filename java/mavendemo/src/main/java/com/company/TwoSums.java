package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author yuankun
 */
public class TwoSums {

    /**
     * @param nums
     * @param target
     * @return
     */
    public ArrayList<Integer> sum(ArrayList<Integer> nums,Integer target){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(10);
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),i);
        }

        int a = 1;


        for(int j=0;j<nums.size();j++){
            ArrayList<Integer> result = new ArrayList<Integer>();
            if(map.containsKey(target-nums.get(j))){
                result.add(map.get(target-nums.get(j)));
                result.add(map.get(nums.get(j)));
                return result;
            }
        }

        return null;
    }
}
