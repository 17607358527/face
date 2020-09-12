package cn.lbl.face.Test;

public class 一次编辑 {
    /*
    "intention"
    "execution"

     */
    static boolean flag=false;
    public static void main(String[] args) {

//        String first = "pale";
//        String second = "ple";
//        String first = "pales";
//        String second = "pal";
        String first = "intention";
        String second = "execution";
        System.out.println(oneEditAway(first, second));
    }

    public static boolean oneEditAway(String first, String second) {

        if(first.length()==0 && second.length()>1 || second.length()==0 && first.length()>1){
            return flag=false;
        }else if (first.length()==0 && second.length()==0){
            return flag=true;
        }

        if(first.charAt(0) == second.charAt(0)){
            oneEditAway(first.substring(1,first.length()),second.substring(1,second.length()));
            return flag;
        }else if (first.length()>second.length()){
            oneEditAway(first.substring(1,first.length()),second.substring(0,second.length()));
            return flag;
        }else if (first.length()==second.length()){
            oneEditAway(first.substring(1,first.length()),second.substring(1,second.length()));
            return flag;
        }
        return flag;
    }


}
