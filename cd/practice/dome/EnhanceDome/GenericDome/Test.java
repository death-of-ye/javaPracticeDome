package javaPracticeDome.cd.practice.dome.EnhanceDome.GenericDome;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *什么是泛型？
 * 即泛指任意类型，又叫参数化类型(Parameterized type)，对具体类型的使用起辅助作用，类似于方法的参数
 * 集合类泛型的解释
 * 表示该集合中存放指定类型的元素
 * 案例演示(给list集合中加上泛型String)
 * List <数据类型> list = new ArrayList<> ();
 * 泛型的好处
 *  1.类型安全 2. 避免类型转换
 * 总结
 * 1.泛型一般和集合类相结合使用
 * 2.它是JDK5.0的新特性，在JDK7.0之后，后面的泛型不需要写具体的数据类型(菱形数据)
 * */
public class Test {
    public static void main(String[] args) {
        //不使用泛型
        //1.创建集合对象
        List lis = new ArrayList();
        //2.创建元素对象
        //3.将元素对象添加到集合对象中
        lis.add(1);
        lis.add(2);
        lis.add(3);
        //lis.add("5"); 会报ClassCastException(类型转换异常)
        //4.遍历集合
        for (Object li : lis) {
            int i = (int)(li);
            System.out.println(i);
        }

        System.out.println("__________________");
        //使用泛型
        //1.创建集合对象
        List<String> lis1 = new ArrayList<>();
        //2.创建元素对象
        //3.将元素对象添加到集合对象中
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add("a"); //会报ClassCastException(类型转换异常)
        //4.遍历集合
        for (Object li : lis) {
            System.out.println(li);
        }

    }
}
