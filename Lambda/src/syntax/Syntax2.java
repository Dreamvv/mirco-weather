package syntax;

import interfaces.LambdaNoReturnMutiPara;
import interfaces.LambdaSingReturnMutiPara;
import interfaces.LambdaSingReturnSignPara;

public class Syntax2 {
    public static void main(String[] args) {
        //1.参数，由于在接口的抽象方法中，已经定义了参数的数量和类型，在Lambda表达式中
        //参数类型可以省略
        LambdaNoReturnMutiPara lambda = (a,b)->{
            System.out.println(a+"+"+b+"="+a+b);
        };


        //参数只有一个时，()小括号可以省略
        LambdaSingReturnSignPara lambda2 = a -> a;

        //方法体中只有一条语句，此时大括号可以省略
        //如果方法体中的一条语句是一个返回语句，省略大括号的同时，也要同时省略return

        LambdaSingReturnMutiPara lambda3 = (a,b) ->a*b;
        System.out.println(lambda3.test(2,5));
    }
}
