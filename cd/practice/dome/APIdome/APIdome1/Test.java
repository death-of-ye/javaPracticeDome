package javaPracticeDome.cd.practice.dome.APIdome.APIdome1;
/**
 * 测试类
 * Object类
 * 概述：
 * 它是类层次中最顶级的基类，可以说是所有类都会间接或直接继承自Object类，是所有类的父类。它是java.base模块下java.lang包下的一个普通类。
 * 构造方法：
 * 只有一个默认的构造方法，可以直接初始化对象
 * 成员方法：
 * 常用的成员方法有四种：bashCode(),getClass(),toString(),equals()
 * 1.int bashCode(): 返回对象的哈希码值，该方法通过对象的地址值进行计算
 * 2.Class<?> getClass():返回对象的字节码文件对象(对象的运行时类对象)
 * 3.String toString():返回对象的字符串表示
 * 4.boolean equals():返回某个对象是否与调用这个方法的对象是否相等，默认情况下是比较两个对象的地址值，建议重写。
 * */
public class Test {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        //1.int bashCode(): 返回对象的哈希码值，不同对象的哈希值一般不同
        int code1 = o1.hashCode();
        int code2 = o2.hashCode();
        System.out.println(code1);
        System.out.println(code2);
        System.out.println("______________________________________");

        //2.Class<?> getClass():返回对象的字节码文件对象(对象的运行时类对象),一个类只有一个字节码文件
        Class cl1 = o1.getClass();
        Class cl2 = o2.getClass();
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println("______________________________________");

        //3.String toString():返回对象的字符串表示，默认是地址值，不同对象有不同的地址值
        //                    地址值是有全类名(包名+类名) + @ + 该对象的哈希值无符号十六进制
        String s1 = o1.toString();
        String s2 = o2.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("___________________________________________");

        //4.boolean equals():返回某个对象是否与调用这个方法的对象是否相等，默认情况下是比较两个对象的地址值，不同对象有不同的地址值,建议重写。
        boolean b1 = o1.equals(o2);
        System.out.println(b1);

    }
}
