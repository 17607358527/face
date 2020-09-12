package cn.lbl.face.Test;

import java.util.ArrayList;
import java.util.Scanner;

/*
判断是否为质数
 */
public class 质数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
            System.out.println(fun(i));
    }

    static String fun(int i){
        int x = 2;
        if (i==2) return "YES";
        while (x<=i/2){
            if(i%x==0){
                //不是质数
                return "NO";
            }
            x++;
        }
        return "YES";
    }
}
