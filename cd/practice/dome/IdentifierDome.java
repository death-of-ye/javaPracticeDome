package javaPracticeDome.cd.practice.dome;

/**
 * 理解标识符案例
 * 概述：标识符就是给类、方法、变量、常量等取名字的序列
 * 组成：大小写英文字母、数字、下划线、美元符号
 * */
public class IdentifierDome {
    /*
    * 概述：标识符就是给类、方法、变量、常量等取名字的序列
    * 组成：大小写英文字母、数字、下划线、美元符号
    * 规则：1.不能以数字开头 2. 不能和关键字同名 3. 严格区分大小写
    * 规范：1.类和接口所有英文单词都必须首字母大写 2.方法和变量从第二个英文单词开始所有英文单词首字母大写
    *      3.常量全部大写 英文单词之间用下划线隔开 4.包名全部用小写 多级路径之间用小数点隔开 一般是公司域名反写 包其实就是
    *      文件夹
    * */
    public static void main(String[] args) {
        //定义变量指刘智超的名字
        int liuZhiChaoAge = 25;
        System.out.println(liuZhiChaoAge);

//        int 1a = 1; 错误写法 1.不能以数字开头
//        int class = 1; 错误写法 2.不能和关键字同名
        int a = 1;
        int A = 1;
        System.out.println(a);//结果为1
        System.out.println(A);//结果为1
        /*
         * 虽然 System.out.println(a) 和 System.out.println(A)都是1;
         * 但是 变量a和变量A是两个变量。
         * 3. 严格区分大小写
         */

    }
}
