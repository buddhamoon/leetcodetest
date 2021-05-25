package com.test.simple;

public class BackContentNumber {
    private int x = 11;

    public boolean isPalindrome ( int Ax ) {
        /*
         * 目前来看的最优解，显然对java的抽象应用非常高超。
         * 9ms 38MB
         * */
        if ( x < 0 || (x % 10 == 0 && x != 0) ) return false;

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
            System.out.println("re值为：" + revertedNumber);
            System.out.println("X值为：" + x);
        }

        return revertedNumber == x || x == revertedNumber / 10;
    }

    public boolean isPalindrome01 (int Ax) {
        /*
         * 看似没有使用创建对象，但实际运行时间变长了，比StringBuffer
         * 多了一倍的执行时间
         * 13ms 38MB
         * */
        if ( x < 0 || (x % 10 == 0 && x != 0) ) return false;
        String str = String.valueOf(x);
        int len = str.length();
        if ( len == 1 ) return true;
        int nowLen = len / 2;
        StringBuffer strAfter = new StringBuffer();
        StringBuffer strBefore = new StringBuffer();

        for (int i = 0; i < nowLen; i++ ) {
            strAfter.append(str.charAt(i));
            strBefore.append(str.charAt(len - 1 - i));
        }
        return strAfter.toString().equals(strBefore.toString());
    }

    public boolean isPalindrome02 (int Ax) {
        /*
        * 看似没有使用创建对象，但实际运行时间变长了，比StringBuffer
        * 多了一倍的执行时间
        * 36ms 38MB
        * */
        if ( x < 0 || (x % 10 == 0 && x != 0) ) return false;
        String str = String.valueOf(x);
        int len = str.length();
        if ( len == 1 ) return true;
        int nowLen = len / 2;
        String strAfter = "";
        String strBefore = "";

        for (int i = 0; i < nowLen; i++ ) {
            strAfter += str.charAt(i);
            strBefore += str.charAt(len - 1 - i);
        }
        return strAfter.toString().equals(strBefore.toString());
    }

}

// 运行引用代码
//  BackContentNumber test01 = new BackContentNumber();
//  System.out.println( test01.isPalindrome02(121 ) );