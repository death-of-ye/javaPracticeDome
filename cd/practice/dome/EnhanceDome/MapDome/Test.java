package javaPracticeDome.cd.practice.dome.EnhanceDome.MapDome;

import javaPracticeDome.cd.practice.dome.EnhanceDome.MapDome.Student;

import java.util.*;

/**
 * 双列集合之map集合
 * 特点:元素由键值对【Entry】组成 键(key)唯一，值（value）可重复
 * 应用:Map<T1，T2> map= new HashMap<>();
 * 需求:向Map集合中添加3个元素，并遍历打印。
 * 方法： put():给map集合中添加元素
 *              第一次添加，返回null
 *              第二次添加，用新值覆盖旧值，返回旧值
 *       keySet()：获取所有的key
 *       get();通过可以获取value值
 *  遍历步骤：
 *  获取键的集合 keySet()
 *  遍历键
 *  根据键获取值
 * */
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        //键：学生学号 值：学生的具体信息
        Map<Integer,Student> map = new HashMap<>();

        //创建元素对象
        Student s1 = new Student("张三",24);
        Student s2 = new Student("李四",25);
        Student s3 = new Student("张三",24);

        //将元素对象添加到集合中
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        System.out.println(map);

        //根据键获取值
        System.out.println("key:" + 1 + "=" + s1);
        //遍历集合
        //使用增强for遍历
        //1.获取所有的键
//        Set<Integer> keys = map.keySet();
//        //2.遍历键
//        for (Integer key : keys) {
////            key 每一个键
////            3.根据键获取值
//            System.out.println("key:" + key + "=" + map.get(key));
//        }

        //使用迭代器遍历
        //1.获取所有的键
        Set<Integer> keys = map.keySet();
        //2.遍历键
       //根据集合创建迭代器
        Iterator<Integer> it = keys.iterator();
        //判断迭代器是否有元素
        while (it.hasNext()){
            //key 代表键
            Integer key = it.next();
//          3.根据键获取值
            System.out.println("key:" + key + "=" + map.get(key));


        }
    }
}
