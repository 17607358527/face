package cn.lbl.face.Test;

public class Father {
    public static void main(String[] args) {
        Son son = new Son();
        son.sayHello();
        son.sayHello("lbl");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    public void sayHello(String name){
        System.out.println("hello"+" "+name);
    }
}