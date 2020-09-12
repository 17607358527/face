package cn.lbl.face.leetCode;
/*
首先%10 得到最后一位数
然后/10 去除末尾数
回文数*10再+末尾数
这样循环
判断条件是回文数的长度大于或等于原来的数
 */
public class 回文数3 {
    public boolean isPalindrome(int x) {
        int revertedNumber=0;
        while (x<revertedNumber){
            //获取末尾数字
            int i = x % 10;
            //将x去除末尾数字
            x=x/10;

        }
        return false;
    }

}
