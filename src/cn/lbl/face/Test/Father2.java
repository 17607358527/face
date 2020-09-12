package cn.lbl.face.Test;

public class Father2 {
    public static void main(String[] args) {
        Father2 son =  new Son2();
        son.sayHello();
        String s="abc";
    }
    public void sayHello(){
        System.out.println("hello");
    }
}