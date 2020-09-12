package cn.lbl.face2;

import java.util.Scanner;
/*
输出：
6
6 5 4 3 2 1
5
6 5 3 2 1

7
7 6 5 4 3 2 1
5
7 6 5 3 2
输入：
6 5 3 2 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len_a = Integer.parseInt(sc.nextLine());
        String[] s1 = sc.nextLine().split(" ");
        int len_b = Integer.parseInt(sc.nextLine());
        String[] s2 = sc.nextLine().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int temp=0;
        for (int i = 0; i <len_a; i++) {
            for (int j = temp; j<len_b; j++) {
                if (s1[i].equals(s2[j])) {
                    temp=j;
                    temp++;
                    stringBuilder.append(s1[i]+" ");
                    break;
                }
            }
        }
        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
        System.out.println(stringBuilder);
    }
}
