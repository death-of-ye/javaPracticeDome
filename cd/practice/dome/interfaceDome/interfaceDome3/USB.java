package javaPracticeDome.cd.practice.dome.interfaceDome.interfaceDome3;
//接口USB
public interface USB {
    //成员常量
    public static final int NUM = 10;

    //成员方法
    //JDK7及以前的写法
    public abstract void m1();

    //JDK8以后的写法
    public static void m2() {
        System.out.println("我是JDK8以后的新特性static方法");
    };
    public default void m3() {
        System.out.println("我是JDK8以后的新特性default方法");
    };

    //JDK9以后的写法
    private static void m4() {
        System.out.println("我是JDK9以后的新特性private方法");
    };

    //构造方法
    //public USB(){};这样写会报错因为接口中没有构造方法
}
