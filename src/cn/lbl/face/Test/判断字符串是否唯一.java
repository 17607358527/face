package cn.lbl.face.Test;

public class 判断字符串是否唯一 {

    public static void main(String[] args) {
//        System.out.println(isUnique(new String("leetcode")));
        System.out.println(isUnique(new String("abc")));
    }
    public static boolean isUnique(String astr) {
        byte[] chars=astr.getBytes();
        for(int i=0;i<chars.length;i++){
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
