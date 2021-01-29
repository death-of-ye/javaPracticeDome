package cd.practice.dome.objectdome;
/*定义一个手机类*/
public class Phone {
    //成员变量 定义在类中，方法外
    //品牌
    String brand;
    //型号
    String model;

    //成员方法 先不写static 修饰符
    //打电话
    public void call() {
        System.out.println("打电话");
    }
}
