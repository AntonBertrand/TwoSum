package com.example.mypackage;

import java.util.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice

public class Main {

    public static void main(String[] args) {

        int[] array = {2,5,5,11};

        System.out.println(Arrays.toString(twoSum(array,10)));
    }


    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1 ; j < nums.length ; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }

            }
        }

        return new int[] {0,0};

    }

}