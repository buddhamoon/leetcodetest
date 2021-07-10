package com.test.simple;
import java.util.ArrayList;
import java.util.Arrays;

public class FindLucky {
    public int findLucky ( int[] arr) {
        ArrayList luckBefore = new ArrayList();
        ArrayList luckAfter = new ArrayList();
        int arrLen = arr.length;
        for ( int i = 0; i < arrLen; i++ ) {
           if ( luckBefore.indexOf(arr[i]) == -1 ) {
               luckBefore.add(arr[i]);
           }
        }
        luckBefore.forEach( item -> {
            int nums = 0;
            for ( int i = 0; i < arrLen; i++ ) {
                if (item.equals(arr[i])){
                    nums ++;
                }
            }
            if ( item.equals(item) ) {
                luckAfter.add(item);
            }
        });
        Integer[] integers2 = (Integer[]) luckAfter.toArray(new Integer[0]);
        int[] arr2 = Arrays.stream(integers2).mapToInt(Integer::valueOf).toArray();
        Arrays.sort(arr2);
        return arr2.length == 0 ? -1 : arr2[arr2.length - 1];
    }
}
