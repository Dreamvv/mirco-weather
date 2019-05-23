package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppleServer {
    private List<Apple> appleStores = new ArrayList<>();


    public List<Apple> getReadApple(){
        ArrayList result = new ArrayList();
        for (Apple apple : appleStores){
            if (apple.getColor().equals("Read")){
                result.add(apple);
            }
        }

        return result;
    }


    public List<Apple> getAppleBy(Predicate<Apple> predicate){
        ArrayList list = new ArrayList();
        for (Apple apple : appleStores){
            if (predicate.test(apple)){
                list.add(apple);
            }
        }
        //基于stream进行过滤
      //  appleStores.stream().filter(predicate).collect(Collectors.toList())
        return list;
    }

    public static void main(String[] args) {
        AppleServer server = new AppleServer();
        server.getAppleBy(a->a.getColor().equals("red"));
    }
}
