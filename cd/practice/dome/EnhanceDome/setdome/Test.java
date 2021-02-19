package javaPracticeDome.cd.practice.dome.EnhanceDome.setdome;

import javaPracticeDome.cd.practice.dome.EnhanceDome.setdome.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * 单列集合之set集合
 * 特点:不可重复、无序
 * 应用:Set<T> set = new HashSet<>();
 * 需求:向set集合中添加五个元素，并遍历打印。
 * */
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        Set<Student> set = new HashSet<>();
        //创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("虚竹",35);
        Student s3 = new Student("段誉",25);
        Student s4 = new Student("乔峰",41);
        Student s5 = new Student("虚竹",35);
        //将元素对象添加到集合对象中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s5);
        set.add(s4);
        //遍历集合
        /*
        * 使用遍历时发现没有去重，这个是为什么呢？
        * 因为set集合确保数据的唯一依赖于equals()和hashCode()两个方法，在没有重写的情况下，它默认调用Object下的方法，比较是
        * 两个的地址值
        * */
        System.out.println(set);
        System.out.println("__________________________");
        System.out.println("使用迭代器遍历");
        //使用迭代器遍历
        //1.找到集合对应的迭代器
        Iterator it = set.iterator();
        //2.判断迭代器中是否还有
        while (it.hasNext()){
            //如果有就打印
            System.out.println(it.next());
        }
        System.out.println("使用for增强遍历");
        //使用for增强遍历
        for (Student student : set) {
            System.out.println(student);
        }

    }
}
