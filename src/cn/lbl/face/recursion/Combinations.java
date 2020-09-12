package cn.lbl.face.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * combinations([1,2,3,4],2)
 * 选1：combinations([2,3,4],1)
 * 不选1：combinations([2,3,4],2)
 */
public class Combinations {
    public void combinations(List<Integer> selected,List<Integer> data,int n){

        if(n==0){
            //output all selected elements + empty list
            for (Integer i:selected){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        if(data.isEmpty()){
            return;
        }


            //选0号元素
        selected.add(data.get(0));
            combinations(selected,data.subList(1, data.size()), n-1);
            //不选0号元素
        selected.remove(selected.size()-1);
            combinations(selected,data.subList(1, data.size()), n);
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4),2);
    }
}
