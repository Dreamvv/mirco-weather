package syntax;

import interfaces.*;

public class Syntax1 {
    public static void main(String[] args) {
        //Lambda表达式的基础语法
        //Lambda是一个匿名函数
        /*
        * ()用来描述参数列表
        * {}用来描述方法体
        * -> lambda运算符 goes to
        * */
        //无参无返回值
        LambdaNoReturnNoPara lambda1 = ()->{
            System.out.println("hello world");
        };
        lambda1.test();

        //无返回值，单个参数
        LambdaNoReturnSingPara lambda2 = (int a)-> {
            System.out.println(a);
        };
        lambda2.test(2);

        //无返回值，多个参数
        LambdaNoReturnMutiPara lambda3 = (int a , int b)->{
            System.out.println(a+b);
        };
        lambda3.test(5,10);

        //无参有返回值
        LambdaSingReturnNoPara lambda4 = ()-> 100;

        System.out.println( lambda4.test());

        //单个参数有返回值
        LambdaSingReturnSignPara lambda5 = (int a) -> a;
        System.out.println(lambda5.test(500));

        //多个参数有返回值
        LambdaSingReturnMutiPara lambda6 = (int a,int b)->a+b;
        System.out.println(lambda6.test(20,50));
    }
}
