package exercise;

import data.Person;

import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {
        //TreeSet
        //使用Lambda表达式来实现Comparator接口，实例化一个TreeSet
        TreeSet<Person> set = new TreeSet<>((o1,o2)->{
            if (o1.getAge()>=o2.getAge()){
                return -1;
            }else{
                return 1;
            }
        });
        set.add(new Person("aa",11));
        set.add(new Person("bb",22));
        set.add(new Person("cc",27));
        set.add(new Person("dd",27));
        set.add(new Person("ee",26));
        set.add(new Person("ff",32));
        set.add(new Person("gg",33));
        set.add(new Person("hh",14));
        System.out.println(set);
    }
}
