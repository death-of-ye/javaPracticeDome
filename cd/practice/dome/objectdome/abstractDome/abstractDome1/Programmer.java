package cd.practice.dome.objectdome.abstractDome.abstractDome1;
/*定义子类 程序员*/
public class Programmer extends Employee{

    //构造方法之空参构造之间访问父类空参构造
    public Programmer() {
    }
    //构造方法之全参构造之间访问父类全参构造
    public Programmer(String name, double salary, String id) {
        super(name, salary, id);
    }

    @Override
    public void works() {
        System.out.println("程序猿要敲代码");
    }
}
