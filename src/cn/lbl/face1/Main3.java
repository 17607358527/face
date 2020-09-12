package cn.lbl.face1;

import java.util.Scanner;

/*
1%2 1
2%1 0
2%2 0
 */
public class Main3 {
    private static int[] arr_b;
    private static int[] arr_a;
    private static int len;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        len =Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        arr_a = new int[len];
        for (int i = 0; i <s.length ; i++) {
            arr_a[i]=Integer.parseInt(s[i]);
        }
        arr_b=new int[len];
        for (int i = 0; i <len ; i++) {
            fun(len,i);
        }
        int sum=0;
        for (int i = 1; i < len; i++) {
            sum=arr_b[i-1]-arr_b[i];
        }
        System.out.println(sum);

    }

    public static void fun(int len,int i){
        arr_b[i]=arr_a[i]-((i+1) % (len-1))-((i+1)%(len));
    }
}
