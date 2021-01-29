package cd.practice.dome.OperatorDome;
/**
 * 概述：又叫三目运算符 有三部分组成
 * 格式：关系表达式?表达式1:表达式2;
 * 执行流程：关系表达式成立执行表达式1，不成立就执行表达式2
 * 例子：比较两个数的大小
 * 思路：1.先定义两个变量
 *      2.通过三元运算符计算出最大的数
 *      3.打印输出结果
 * */
public class OperatorDome6 {
    public static void main(String[] args) {
//        1.先定义两个变量
        int a = 10;
        int b = 20;
//        2.通过三元运算符计算出最大的数
        int max = (a > b) ? a : b;
//        3.打印输出结果
        System.out.println("max: " + max);
    }

}
