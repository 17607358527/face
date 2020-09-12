package cn.lbl.face.leetCode;

import java.util.Arrays;
import java.util.List;

public class 杨光三角 {
    public List<Integer> getRow(int rowIndex) {
        //定义了一个长度为rowIndex，高度为rowIndex的二维数组，数组中的值都为0；
        //由题意知，要+1
        List<Integer> list = null;
        int[][] arr=new int[rowIndex+1][rowIndex+1];
        for(int i=0;i<arr.length; i++) {
            //由于只是给杨辉三角内的位置赋值，所以是j<=i
            for(int j=0;j<=i;j++) {
                //根据规律，使用if else 赋值
                if(j==0||j==i) {
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            list= Arrays.asList(arr[rowIndex + 1][i]);
        }
        return list;
    }
}
