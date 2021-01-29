package javaPracticeDome.cd.practice.dome.OperatorDome;
/**
 * 赋值运算符实例
 * 概述：把数据赋值给变量或常量
 * 分类：1.基本赋值--> =   2.扩展赋值 += -= *= /= %=
 * 好处：自动强制转换数据类型
 *
 * */
public class OperatorDome3 {
    public static void main(String[] args) {
//      基本赋值
        int a = 10; //把10赋值给变量a;
//      扩展赋值
        a+=10; //把左右两边的数据相加后赋值给左边 同等于 a = a + 10;
        System.out.println(a);//20
//      好处
        short b = 10;
/*      b = b + 1;当我们这样写时发现报错，这是为啥呢？因为在运算过程中 短整型(short)b会
        自动提升为整数型(int),结果还是整数型，把他赋值给短整型b当然报错。
        解决办法1：强制转换
        b = (short)(b + 1);
        System.out.println(b);*/
//      解决办法2：使用扩展运算符
        b+=1;
        System.out.println(b);
    }
}
