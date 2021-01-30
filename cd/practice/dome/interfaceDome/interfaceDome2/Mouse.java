package javaPracticeDome.cd.practice.dome.interfaceDome.interfaceDome2;
//USB接口的子类(实现类) 鼠标类
//它是一个普通类
public class Mouse implements USB,A,B{
    @Override
    public void Open() {
        System.out.println("连接鼠标");
    }

    @Override
    public void Close() {
        System.out.println("断开鼠标");

    }
}
