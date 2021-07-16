package com.test.simple;

public class ArrShuffle {
    public int[] shuffle (int[] nums,int n) {
        int[] arr = new int[2 * n];
        int x = 0;
        for (int i = 0; i < n; i++ ){
            arr[x] = nums[i];
            arr[x+1] = nums[ n + i];
            x = x + 2;
        }
        return arr;
    }

    public int[] shuffle_01 (int[] nums,int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++ ){
            arr[i*2] = nums[i];
            arr[i*2+1] = nums[ n + i];
        }
        return arr;
    }
}
