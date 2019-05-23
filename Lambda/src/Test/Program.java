package Test;

public class Program {
    public static void main(String[] args) {
        //1使用接口实现
        Comprator comprator = new MyComprator();
        //2使用匿名内部类
        Comprator comprator1 = new Comprator() {
            @Override
            public int compare(int a, int b) {
                return a-b;
            }
        };

        //3.使用Lambda表达式实现接口
        Comprator comprator2 = (a,b)->a-b;
    }
}

class MyComprator implements Comprator{
    @Override
    public int compare(int a, int b) {
        return a-b;
    }
}

@FunctionalInterface
interface Comprator{
    int compare(int a , int b);

}