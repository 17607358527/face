package cn.lbl.face.leetCode;

/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
示例 1:

输入: 121
输出: true
 */
public class 回文数 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
       int res = 0;
       int a=x;
        int temp;
       while (x!=0) {
            temp=x % 10;
           res = res * 10 + temp;
           x=x/10;
       }
       if(res==a){
           return true;
       }else {
           return false;
       }
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(-121);
        System.out.println(palindrome);
    }
}
