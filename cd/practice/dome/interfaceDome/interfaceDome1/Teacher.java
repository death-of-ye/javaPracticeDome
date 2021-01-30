package javaPracticeDome.cd.practice.dome.interfaceDome.interfaceDome1;
//接口Smoking的实现类(可以理解为他的子类)
public class Teacher implements Smoking{
    @Override
    public void smoking() {
        System.out.println("抽烟有害健康");
    }
}
