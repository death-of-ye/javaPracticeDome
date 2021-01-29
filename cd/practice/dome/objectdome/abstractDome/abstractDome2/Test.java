package javaPracticeDome.cd.practice.dome.objectdome.abstractDome.abstractDome2;
/**
 * static关键字
 * 概述：
 * 它代表静态的，它可以修饰类的方法、变量,被该类下的所有对象共享
 * 特点：
 * 修饰的类不能被继承，但可以继承别的类
 * 修饰的方法不能被重写
 * 修饰的变量即最终变量，就是java中的常量，只能赋值一次。
 * 调用方法：
 * 类名.
 * 需求：定义研发部成员类，让每个成员自我介绍
 * Developer
 * 成员变量：姓名name 工作内容work，部门名字departmentName
 * 成员变量：自我介绍selfIntroduction()
 * */
public class Test {
    public static void main(String[] args) {
        //创建两个员工测试
        Developer d1 = new Developer();
        d1.name = "孙敏";
        d1.work = "敲代码";
        d1.selfIntroduction();
        Developer d2 = new Developer();
        d1.name = "刘智超";
        d1.work = "看人敲代码";
        d1.selfIntroduction();

    }
}
