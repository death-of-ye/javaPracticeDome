package cd.practice.dome.OperatorDome;
/**
 * 认识运算符案例
 * 概述：java中用于常量和变量之间运算的符号
 * 分类：1.算数运算符 2.赋值运算符 3.关系运算符 4.逻辑运算符 5.三元运算符
 * 算数运算符
 * 概述：顾名思义就是java中用于常量和变量之间算数运算的符号
 * 分类：加(+)减(-)乘(*)除(/)取余(%)自增(++)自减(--)
 * 注意事项：/获取两个数据的商 整数相除还是整数，如果想要获取小数结果就必须有浮点型参与运算
 *         %获取两个数据的余数
 * */
public class OperatorDome {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(a + b); //结果5
        System.out.println(a - b); //结果1
        System.out.println(a * b); //结果6
        System.out.println(a / b); //结果1
        System.out.println(a % b); //结果1
        System.out.println("______________________________________");
        //注意事项 如果想要获取小数结果就必须有浮点型参与运算
        System.out.println(3 / 2.0); //结果 1.5
        System.out.println(3 / 2);   //结果 1
    }

}
