package javaPracticeDome.cd.practice.dome.objectdome;
/*测试手机类*/
public class TestPhone {
    //main方法是程序入口，程序是从这开始的
    public static void main(String[] args) {
        //创建phone类
        Phone p = new Phone();

        //调用成员变量并打印
        String brand = p.brand = "iphone";
        String model= p.model = "12";
        System.out.println("我的手机是"+ brand + model);
        //调用成员方法
        p.call();
    }
}
