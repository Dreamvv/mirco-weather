package exercise;

import data.Person;

import java.util.ArrayList;
import java.util.ListIterator;

public class Exercise4 {
    public static void main(String[] args) {
        //删除集合中满足条件的元素
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("aa",23));
        list.add(new Person("bb",21));
        list.add(new Person("cc",20));
        list.add(new Person("dd",16));
        list.add(new Person("ee",26));
        list.add(new Person("ff",32));
        list.add(new Person("gg",33));
        list.add(new Person("hh",14));
        //删除集合中age>22的元素
     /* ListIterator<Person> it =  list.listIterator();
      while (it.hasNext()){
          Person ele = it.next();
          if (ele.getAge()>22){
              it.remove();
          }
      }*/
     list.removeIf(ele -> ele.getAge()>22);
        System.out.println(list);
    }
}
