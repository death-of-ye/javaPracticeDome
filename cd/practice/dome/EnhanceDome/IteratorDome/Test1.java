package javaPracticeDome.cd.practice.dome.EnhanceDome.IteratorDome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        //测试列表迭代器
        //需求：判断集合中有没有字符串2，如果有就在他后面加字符串java
        //创建集合对象
        List list = new ArrayList();
        //创建元素对象
        //将元素对象添加到集合中
        list.add("1");
        list.add("2");
        list.add("3");
        //遍历集合
        //1.根据集合对象获取其对应的列表迭代器对象
        ListIterator lit = list.listIterator();
        //2.判断列表迭代器对象中是否还有元素
        while (lit.hasNext()) {
            //3.如果有就获取元素
            String s = (String)(lit.next());
            if("2" .equals(s)) { // 这样会规避 空指针异常
                //list.add("java");//会报错ConcurrentModificationException(并发修改异常) 必须使用列表迭代器方法
                lit.add("java");
            }
        }

        System.out.println("_________________________");
        //打印新的list集合
        System.out.println(list);
    }
}
