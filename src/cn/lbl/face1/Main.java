package cn.lbl.face1;

import java.util.Scanner;

/*
输入第一行包含三个整数n,p,q，含义如题意所示
接下来一行p个整数，空格隔开，第 i 个整数代表A国需要的土地编号ai
接下来一行q个整数，空格隔开，第 i 个整数代表B国需要的土地编号bi
土地编号从1开始，n结束。
p,q≤n≤100000 , 1≤ai,bi≤n , 数据保证所有的ai互相不相同，bi互相不相同。

输出包含三个数，只有A国想要的土地数，只有B国想要的土地数，两个国家都想要的土地数。

样例输入
5 3 3
1 2 3
3 4 5
样例输出
2 2 1

提示
1,2号土地只有A想要，4,5号土地只有B想要，3号土地都想要
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        String[] s3 = sc.nextLine().split(" ");
        int aWant=s2.length;
        int bWant=s3.length;
        int abWant=0;
        for (int i = 0; i <s2.length; i++) {
            for (int j = 0; j <s2.length ; j++) {
                if (s2[i].equals(s3[j])) {
                    abWant++;
                    aWant--;
                    bWant--;
                }
            }
        }
        if (Integer.parseInt(s1[0]) != (aWant+bWant+abWant)) {
            throw new IllegalArgumentException("input number error");
        }
        System.out.println(aWant+" "+bWant+" "+abWant);
    }
}
