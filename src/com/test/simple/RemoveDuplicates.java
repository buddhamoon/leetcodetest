package com.test.simple;

public class RemoveDuplicates {

    public int[] method_one ( int[] nums) {
        System.out.println(nums[0]);
        for (int i = 0; i < nums.length; i++ ){
            if ( nums[i] == nums[i + 1]){
                int nowLen = nums.length - 1;
                for ( int s = i; s < nowLen; s++ ){
                    nums[s + 1] = nums[s + 2];
                }


            } else {

            }
        }
        return nums;
    }
}
