package com.test.simple;

/**
 * 给你一个整数数组 arr ，数组中的每个整数 互不相同 。另有一个由整数数组构成的数组 pieces，其中的整数也 互不相同 。
 * 请你以 任意顺序 连接 pieces 中的数组以形成 arr 。但是，不允许 对每个数组 pieces[i] 中的整数重新排序。
 * 如果可以连接 pieces 中的数组形成 arr ，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：arr = [85], pieces = [[85]]
 * 输出：true
 *
 * 示例 2：
 * 输入：arr = [15,88], pieces = [[88],[15]]
 * 输出：true
 * 解释：依次连接 [15] 和 [88]
 *
 * 示例 3：
 * 输入：arr = [49,18,16], pieces = [[16,18,49]]
 * 输出：false
 * 解释：即便数字相符，也不能重新排列 pieces[0]
 *
 * 示例 4：
 * 输入：arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
 * 输出：true
 * 解释：依次连接 [91]、[4,64] 和 [78]
 *
 * 示例 5：
 * 输入：arr = [1,3,5,7], pieces = [[2,4,6,8]]
 * 输出：false
 * */

public class CanFormArray {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for ( int i = 0; i < pieces.length; i ++ ) {
            for ( int x = 0; x < pieces[i].length; x++ ){
                int check = indexOf(arr, pieces[i][x]);
                if (check < 0) return false;
                if ( ( x + 1 ) < pieces[i].length && check < (arr.length - 1)){
                    if (pieces[i][x + 1] != arr[check + 1]) return false;
                } else {
                    if (check == (arr.length - 1) && x < (pieces[i].length - 1)) return false;
                    /**
                     * 相对于 JavaScript ，java 存在的一个问题时使用数组位访问数组时，一旦访问
                     * 超出数组位的值，会直接程序报错，而不是像 JavaScript 那样返回 undefined
                     * 这让 java 在处理有可能超出范围方位访问时，需要特殊的避免错误处理。
                     * */
                }
            }
        }
        return true;
    }

    public int indexOf(int[] arr, int num){
        int last = -1;
        for ( int i = 0; i < arr.length; i++ ){
            if(arr[i] == num) return i;
        }
        return last;
    }

}
