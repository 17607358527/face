package cn.lbl.face.baidu;

import java.util.Scanner;

/*
能整除90的最大数字
输入：
11
5 5 5 5 5 5 5 5 0 5 5
输出：
5555555550
 */
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        String b = in2.nextLine();
        String[] s = b.split(" ");
        int[] ints = new int[a];
        int left = 0;
        int right = s.length - 1;
        for (int i = 0; i < s.length; i++) {
            String c = s[i];
            if (c.equals("5")) {
                ints[left++] = 5;
            } else {
                ints[right--] = 0;
            }
        }


    }
}
