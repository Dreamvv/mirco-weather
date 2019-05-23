package syntax;

import data.Person;

public class Syntax4 {
    public static void main(String[] args) {

     /*   PersonCreater creater = ()->{
            return new Person();
        };*/

     PersonCreater creater = ()-> new Person();

     //构造方法引用
        PersonCreater creater1 = Person::new;
        Person a = creater1.getPerson();

        PersonCreater2 creater2 = Person::new;
        Person b = creater2.getPerson("pony",48);
        System.out.println(b);
    }
}

interface PersonCreater{
    Person getPerson();
}

interface PersonCreater2{
    Person getPerson(String name,int age);
}