package cd.practice.dome.OperatorDome;
/**
 * 关系运算符实例
 * 概述：用于描述变量之间是否为相等关系
 * 常见的有：== != <= >= > <
 * 注意：在java中等于为==而不是=
 * */
public class OperatorDome4 {
    public static void main(String[] args) {
//        定义三个变量
        int a = 10;
        int b = 10;
        int c = 20;
//        等于 ==  判断两个变量是否相等 相等为true反之为false，有且只有这两种结果
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println("__________________________________________");
//        不等于 != 判断两个变量是否不相等 不相等为true反之为false，有且只有这两种结果
        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println("__________________________________________");
//        大于 > 判断第一个变量是否大于第二个变量 大于为true反之为false，有且只有这两种结果
        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println("__________________________________________");
//        大于等于 >= 判断第一个变量是否大于等于第二个变量 大于等于为true反之为false，有且只有这两种结果
        System.out.println(a >= b);
        System.out.println(a >= c);

    }
}
