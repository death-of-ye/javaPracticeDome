package javaPracticeDome.cd.practice.dome.objectdome;

//定义一个父类
public class Parent {
    private  String name;
    private  int age;


    // 快捷键ALT+Insert 快速创建构造函数 和getXXX，setXXX方法
    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
