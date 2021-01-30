package javaPracticeDome.cd.practice.dome.interfaceDome.interfaceDome3;
/**
 *   接口的成员特点
 *   1.它没有成员变量，只有公有、静态的常量,(系统默认会使用public static final 常量名 = 常量值)
 *   2.JDK7及以前，接口只有公有的、抽象方法，
 *     JDK8以后可以有默认方法(public default 返回值类型 方法名(){})和静态方法(static 返回值类型 方法名(){})，
 *     JDK9以后可以有私有方法(private 返回值类型 方法名(){})
 *   3.由于接口不能实例化也没有需要初始化成员，所以没有构造方法。*/
public class Test {
    public static void main(String[] args) {
        //测试USB接口
        //USB.num = 20; 这样写程序会报错，因为接口中的只有常量，常量的值不可更改
        System.out.println(USB.NUM);
    }
}
