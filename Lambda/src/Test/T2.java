package Test;

import java.util.function.Function;

public class T2 {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("hello")).start();

        new Thread(() -> System.out.println("hello")).start();
        System.out.println( getAge(a ->Integer.parseInt(a),"111"));
    }

    public static Integer getAge(Function<String,Integer> function,String args){
         return  function.apply(args);
    }
}
