package cn.lbl.face.Test;

public class RoundTest {
    public static void main(String[] args) {
        System.out.println(Math.round(-8.5)); //-8
        System.out.println(Math.round(-8.6)); //-9
        System.out.println(Math.round(-4.6)); //-5
        System.out.println(Math.round(-4.51)); //-5
        System.out.println(Math.round(8.5)); //9
        System.out.println(Math.round(8.49)); //8
        System.out.println(Math.round(4.6)); //5
    }
}
