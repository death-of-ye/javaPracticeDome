package cd.practice.dome.objectdome;
/*
* 定义一个标准的JavaBean
*
* */
public class Student {
    //成员变量 private修饰
    private String name;
    private int age;

    //无参构造方法
    public Student() {};

    //全参构造方法
    public Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    //获取name
    public String getName() {
        return name;
    }
    //设置name
    public void setName(String name) {
        this.name = name;
    }

    //获取age
    public int getAge() {
        return age;
    }
    //设置name
    public void setAge(int age) {
        this.age = age;
    }
}
