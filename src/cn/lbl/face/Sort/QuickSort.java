package cn.lbl.face.Sort;

import java.util.Arrays;

/*
快速排序
 */
public class QuickSort{
    public static void main(String[] args) {
        int[] array=new int[]{50,10,90,30,70,40,80,60,20};
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public  static int[] quickSort(int[] array,int left,int right){
        if(left<right){
            int partitionIndex = partition(array, left, right);
            quickSort(array,left,partitionIndex-1);
            quickSort(array,partitionIndex+1,right);
        }
        return array;
    }

    /*
    分区
     */
    public static int partition(int[] array,int left,int right) {
        //设置基准值（pivot）
        int pivot = array[left];
        int i = left;   //定义最低的索引low是first+1。比基准值大一位
        int j = right;     //定义最高的索引high是last
        while (i != j) {   //当low小于high的位置时，执行以下循环
            while (array[j] > pivot && i < j) {//当high的索引上的值比基准值大时，且索引大于low时
                j--;                      //寻找比基准值小的值的位置索引
            }
            while (array[i] <= pivot && i < j) {//当low的索引上的值比基准值小时，索引小于high时
                i++;                       //寻找比基准值大的值的位置索引。
            }

            if (i < j) {   //交换low和high的值
                swap(array,i,j);
            }
        }
        swap(array,left,j);
        return j;
    }
    /**
     * 交换
     */
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
