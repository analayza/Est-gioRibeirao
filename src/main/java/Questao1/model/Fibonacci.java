package Questao1.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public String fibonacci( Integer entrada){
        ArrayList<Integer> list = new ArrayList<>();
        int f1 = 0;
        int f2 = 1;
        list.add(f1);
        int limit = entrada;
        while (f2 <= limit){
            list.add(f2);
            int fn = f1 + f2;
            if(fn > limit)
                break;
            f1 = f2;
            f2 = fn;
        }

        System.out.println(list);
        if(list.contains(entrada)){
            return  "O número pertence a sequencia Fibonacci";
        }else{
            return "O número não pertence a sequencia Fibonacci";
        }
    }
}
