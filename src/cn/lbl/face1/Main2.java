package cn.lbl.face1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

样例输入
AAAb
样例输出
1

byte
A 65
Z 90
a 97
z 122
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] s= sc.nextLine().getBytes();
        Map<Byte,Integer> byte_A = new HashMap();
        int A=65;
        int upNum=0;
        int lowNum=0;
        for (int i = 0; i <26 ; i++) {
            byte_A.put((byte)A++,i);
        }
        for (int i = 0; i <s.length ; i++) {
            if (byte_A.containsKey(s[i])) {
                upNum++;
            }else {
                lowNum++;
            }
        }
        int abs = Math.abs(upNum - lowNum);
        System.out.println(abs / 2);

    }
}
