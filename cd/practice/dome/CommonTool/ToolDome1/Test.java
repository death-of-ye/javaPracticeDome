package javaPracticeDome.cd.practice.dome.CommonTool.ToolDome1;
import java.util.List;
import java.util.ArrayList;
/*
* 单列集合(Collection)之list集合
* 特点：可添加重复的数据(可重复)，存取顺序相同(有序)
* 注意：
* list是接口所以使用时需先使用多态实例化list接口 List  list = new ArrayList();
* 常用成员方法
* public boolean add(E e) 将指定元素插入此列表中的末尾
* public E get(int index)返回此列表中指定位置的元素。
* public int size() 返回此列表中的元素数。
* 步骤：
* 创建集合对象
* 创建元素对象
* 将元素对象添加到集合对象中
* 遍历集合
* */
public class Test {
    public static void main(String[] args) {
        //需求给list集合中添加三个学生对象，并遍历
        //创建集合对象
        List list = new ArrayList();
        //创建元素对象
        Student stu1 = new Student("刘智超",24);
        Student stu2 = new Student("刘智超",24);
        Student stu3 = new Student("孙敏",25);
        Student stu4 = new Student("刘津晶",26);
        //将元素对象添加到集合对象中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        System.out.println("list集合是:" + list);
        System.out.println("list集合中第3个元素是:" + list.get(2));
        System.out.println("list集合有" + list.size() + "个元素");
        System.out.println("___________________________________");
        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            Object obj1 = list.get(i);
            System.out.println("索引为"+ i +"的元素是" + obj1 );
        }
    }
}
