package cn.lbl.face.leetCode;

import java.util.Arrays;

/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321

 示例 2:

输入: -123
输出: -321

示例 3:

输入: 120
输出: 21
 */
public class 整数反转 {

    public static int reverse(int x) {
        System.out.println(Math.pow(2,23));
        String s = String.valueOf(x);
        int len = s.length();
        if (len>9 && Integer.parseInt(String.valueOf(s.charAt(len-1)))>2) {
            return 0;
        }
        char[] result = new char[len];
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '-') {
                result[i] = '-';
                flag=true;
                continue;
            }
            if (!flag){
                char c = s.charAt(i);
                result[len - i - 1] = c;
            }else {
                char c = s.charAt(i);
                result[len - i] = c;
            }
        }
        String r = "";
        for (int i = 0; i < len; i++) {
            r += result[i];
        }
        Long num = Long.parseLong(r);
        if (num <(Math.pow(2,31)-1) && num>-Math.pow(2,31)){
            return Integer.parseInt(String.valueOf(num));
        }
        return 0;
    }


    public static void main(String[] args) {
//        int reverse = reverse(-1230);
//        int reverse = reverse(1534236469);
//        int reverse = reverse(1563847412);

//        System.out.println(reverse);
        long result = 2;
        for (int i = 0; i <30 ; i++) {
            result*=2;
        }
        System.out.println(result-1);
    }
}
