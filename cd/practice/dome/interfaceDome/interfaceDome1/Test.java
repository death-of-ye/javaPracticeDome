package javaPracticeDome.cd.practice.dome.interfaceDome.interfaceDome1;
/**
 * 这是一个测试类
 * 接口就是提供唯一规则、规范
 * 格式 interface 接口名 {}
 * 类和接口的关系
 * 它们之间是实现关系，使用implements表示(class 类名 implements 接口名 )
 *
 * */
public class Test {
    public static void main(String[] args) {
        //多态
        Smoking sm = new Teacher();
        sm.smoking();
    }
}
