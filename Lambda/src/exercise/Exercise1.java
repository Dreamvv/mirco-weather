package exercise;

import data.Person;

import java.util.ArrayList;

public class Exercise1 {
    //集合排序
    public static void main(String[] args) {
        //已知在一个ArrayList中有若干个Person对象。按照年龄进行降序排序

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("aa",21));
        list.add(new Person("bb",24));
        list.add(new Person("cc",28));
        list.add(new Person("dd",12));
        list.add(new Person("ee",26));
        list.add(new Person("ff",32));
        list.add(new Person("gg",33));
        list.add(new Person("hh",14));

        list.sort((a1,a2)->a2.getAge()-a1.getAge());
        System.out.println(list);
    }
}
