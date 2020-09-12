package cn.lbl.face.loop;

public class BinarySelect {

    public static int binarySelect(int[] arr, int k){
        int a=0;
        int b=arr.length;
        while (a<b){
            int m=(a+b)/2;
            if (k>arr[m]){
                a=m+1;
            }else if (k<arr[m]){
                b=m;
            }else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(binarySelect(new int[]{1,2,3,4,5,6,7,8,9,10,11,12},12));
//        System.out.println(binarySelect(new int[]{},12));
        System.out.println(binarySelect(new int[]{1,2,3,4,5,6,7,8,9,10,11,12},13));
    }
}
