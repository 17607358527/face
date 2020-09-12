package cn.lbl.face.Test;

import java.util.Scanner;

/*
A+B+C
输入：22 1 3
输出：26
 */
public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int sum = 0;
        for (int i = 0; i < ss.length; i++) {
            sum+=Integer.valueOf(ss[i]);
        }
        System.out.println(sum);
    }
}
