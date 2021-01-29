package cd.practice.dome.objectdome;
/*
* 测试student类
* */
public class TestStudent {
    public static void main(String[] args) {
        //通过空参创建对象
        Student stu = new Student();
        stu.setAge(10);
        stu.setName("李白");
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println("______________________________");
        //通过全参创建对象
        Student stu1 = new Student("华盛顿",7);
        System.out.println(stu1.getAge());
        System.out.println(stu1.getName());
    }
}
