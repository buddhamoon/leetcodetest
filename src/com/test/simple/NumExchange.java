package com.test.simple;
import java.util.ArrayList;
import java.util.Arrays;

public class NumExchange {
    public int[] exchange ( int[] nums) {
        ArrayList before = new ArrayList();
        ArrayList after = new ArrayList();
        int len = nums.length;
        for ( int i = 0; i < len; i++ ) {
            int val = nums[i] % 2;
            if ( val == 1 ) {
                before.add(nums[i]);
                continue;
            } else {
                after.add(nums[i]);
            }
        }
        before.addAll(after);
        Integer[] integers2 = (Integer[]) before.toArray(new Integer[0]);
        int[] arr2 = Arrays.stream(integers2).mapToInt(Integer::valueOf).toArray();
        return arr2;
    }
}
