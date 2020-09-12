package cn.lbl.face.leetCode;

/*

 */
public class 回文数2 {
    public static boolean isPalindrome(int x) {
        /*
        负数不是回文数 x<0
        如果数字的第一位是0，为了使该数字为回文，则其第一位数字也应该是0   ==》 只有0满足这一属性
         */
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        /*
        当数字长度为奇数时，我们可以通过revertedNumber/10去除处于中位的数字。
         */
        int revertedNumber = 0;
        while (x>revertedNumber){
            revertedNumber=revertedNumber*10+x%10;
            x/=10;
        }
        return x==revertedNumber || x==revertedNumber/10;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(12321);
        System.out.println(palindrome);
    }
}
