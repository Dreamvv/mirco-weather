package exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise3 {

    public static void main(String[] args) {
        //集合遍历
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

        list.forEach(ele ->{
            if (ele %2 ==0){
                System.out.println(ele);
            }
        });

        list.forEach(a -> System.out.print(a));
    }
}
