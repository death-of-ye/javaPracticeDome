package javaPracticeDome.cd.practice.dome.interfaceDome.interfaceDome2;
/*
*   这是一个测试类
*   接口特点
    从创建的对象来看：
    它本身不能实例化，必须通过多态的方式实例化子类对象也就是他的实现类。
    它的子类也就是它的实现类，如果是抽象类，那么就不用重写接口的抽象方法如果是普通类就必须重写接口的抽象方法。
    从继承关系来看：
    接口和接口之间是继承关系，可以是单继承也可以是多继承。格式为接口 extends 接口1，接口2
    继承和实现的区别是：继承是“is a ”就是父类定义公有的东西 ，例如狗和动物，实现是“like a”的关系，接口中定义扩展功能，例如警犬和动物
* */
public class Test {
    public static void main(String[] args) {
        //测试鼠标类
        USB usb = new Mouse();
        usb.Open();
        usb.Close();
    }
}
