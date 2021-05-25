package com.test.medium;

public class CountAndSay {

    public String method_one ( int n ) {
        String val = "1";
        if ( n == 1 ) return val;
        String str = "";
        int num = 1;
        for ( int i = 1; i < n; i++){
            for ( int s = 0; s < val.length(); s++ ){
                char nowChar = (s + 1) < val.length() ? val.charAt(s + 1) : 0;
                if (val.charAt(s) == nowChar){
                    num ++;
                } else {
                    str += String.valueOf(num) + val.charAt(s);
                    num = 1;
                }
            }
            val = str;
            str = "";
        }
        return val;
    }

    public String method_two ( int n ) {
        StringBuffer val = new StringBuffer("1");
        if ( n == 1 ) return val.toString();
        StringBuffer str = new StringBuffer();
        int num = 1;
        for ( int i = 1; i < n; i++){
            for ( int s = 0; s < val.length(); s++ ){
                char nowChar = (s + 1) < val.length() ? val.charAt(s + 1) : 0;
                if (val.charAt(s) == nowChar){
                    num ++;
                } else {
                    str.append(String.valueOf(num) + val.charAt(s));
                    num = 1;
                }
            }
            val = str;
            str = new StringBuffer();
        }
        return val.toString();
    }
}
