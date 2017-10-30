package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {1,2,3,4,5,6,7};
	    int k = 3;
        rotateArray(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArray(int[] nums, int k){
        List<Integer> numsList = new ArrayList<>();
        for(int i : nums){
            numsList.add(i);
        }
        Collections.rotate(numsList,k);
        for(int i = 0; i < nums.length; ++i){
            nums[i] = numsList.get(i);
        }
    }
}
