package cn.lbl.face.Test;

public class StaticTest {
        public static void main(String[] args){
            System.out.println(Zi.a);
        }
    }

    class Fu{
        static int a=1;
        int b=2;
        static{
            System.out.println("父类静态代码块："+a);
        }
    }

    class Zi extends Fu{
        static{
            System.out.println("子类静态代码块："+a);
        }
    }


//    public static void main(String[] args){
//        System.out.println(Zi.a);
//    }
//}
//
//class Fu{
//    static int a=1;
//    int b=2;
//    static{
//        System.out.println("父类静态代码块："+a);
//    }
//}
//
//class Zi extends Fu{
//    static int a=3;
//    static{
//        System.out.println("子类静态代码块："+a);
//    }
//}
