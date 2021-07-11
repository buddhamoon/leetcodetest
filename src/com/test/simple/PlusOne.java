package com.test.simple;

public class PlusOne {
    public int[] plusOne (int[] digits) {
        int len = digits.length;
        int pointer = len - 1;
        digits[pointer] = digits[pointer] + 1;
        for ( int i = 0; i < len; i++ ) {
            int check = digits[pointer - i];
            if (check < 10) break;
            digits[pointer - i] = check % 10;
            if ( (i + 1) >= len ) {
                return arrBeforePlus(digits);
            } else {
                digits[pointer - (i + 1)] = digits[pointer - (i + 1)] + 1;
            }
        }
        return digits;
    }

    public int[] arrBeforePlus ( int[] arr) {
        int len = arr.length;
        int[] afterArr = new int[len + 1];
        afterArr[0] = 1;
        for (int i = 0; i < len; i ++) {
            afterArr[i + 1] = arr[i];
        }
        return afterArr;
    }
}
