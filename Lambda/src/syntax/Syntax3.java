package syntax;

import interfaces.LambdaSingReturnSignPara;

public class Syntax3 {
    public static void main(String[] args) {
        //方法引用
        //可以快速的将一个Lambda表达式的实现指向一个已经实现的方法
        //语法：方法的隶属者::方法名
        //参数的类型，返回值类型必须和接口中定义的一致
        LambdaSingReturnSignPara lambda = a ->change(a);

        LambdaSingReturnSignPara lambda2 = Syntax3::change;
    }

    private static int change(int a){
        return a*2;
    }

}
