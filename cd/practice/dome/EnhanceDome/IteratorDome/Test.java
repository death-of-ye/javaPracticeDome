package javaPracticeDome.cd.practice.dome.EnhanceDome.IteratorDome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
*   为啥要使用迭代器？
    对过程的重复叫做迭代。
    迭代器是遍历集合的的通用方法，可以在遍历的同时删除或添加
    迭代器的常用方法
    next() : 返回迭代的下一个元素对象
    hasNext() : 判断是否还有某个元素，有则返回true
    案例：使用迭代器遍历LIst集合

    用法
    1.根据集合对象获取其对应的迭代器对象
    2.判断迭代器对象中是否还有元素
    3.如果有就获取元素

    注意：
    列表迭代器是list迭代器独有的遍历方法，可以在对集合遍历的同时添加或删除
    但必须使用列表迭代器中的方法去实现

    总结
    普通的迭代器在遍历的同时不能修改集合元素，如果需要修改就要使用列表迭代器
*
* */
public class Test {
    public static void main(String[] args) {
        //案例：使用迭代器遍历LIst集合
        //创建集合对象
        List list = new ArrayList();
        //创建元素对象
        //将元素对象添加到集合中
        list.add("1");
        list.add("2");
        list.add("3");
        //遍历集合
        //基本用法
       /* //1.根据集合对象获取其对应的迭代器对象
        Iterator it = list.iterator();
        //2.判断迭代器对象中是否还有元素
        while (it.hasNext()) {
            //3.如果有就获取元素
            String s = (String)(it.next());
            System.out.println(s);
        }*/
        System.out.println("____________________");
        //扩展用法
        //需求：判断集合中有没有字符串2，如果有就在他后面加字符串java
        //1.根据集合对象获取其对应的迭代器对象
        Iterator it = list.iterator();
        //2.判断迭代器对象中是否还有元素
        while (it.hasNext()) {
            //3.如果有就获取元素
            if("2" .equals(it)) {

            }
        }
    }
}
