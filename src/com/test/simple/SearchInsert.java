package com.test.simple;

public class SearchInsert {
    public int searchMethodOne () {

        int nowNum = 0;
        int target = 5;
        int [] nums = { 1, 3, 5, 6 };
        // 这里提上来效果可能更好
        if ( target < nums[0]) return 0;
        int len = nums.length;
        for ( int i = 0; i < len; i++ ){
//            if ( target < nums[0]) break;
            if ( target == nums[i]){
                nowNum = i;
                break;
            }
            if ( target > nums[i] ) {
                nowNum ++;
            } else {
                break;
            }
        }
        System.out.println(nums[0]);
        return nowNum;
    }
}
