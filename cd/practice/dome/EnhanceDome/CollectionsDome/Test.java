package javaPracticeDome.cd.practice.dome.EnhanceDome.CollectionsDome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections工具类
 * 概述:根据集合进行操作的工具类
 * 常用成员方法：
 * 1.sort(List<T>):根据自然顺序将指定列表升序进行排列例如1-9、a-z等等
 * 2.max(collection<T>)：返回集合的最大元素
 * 3.reverse(List<T>):翻转List集合元素
 * 4.shuffle(List<T>)：使用默认随机沅随机置换指定列表
 * */
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();

        //往集合中添加数据
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(3);
        list.add(5);
        //打印集合
        System.out.println("没有处理数据之前的是 " + list);
        System.out.println("____________________");
        //获取集合最大元素
        Integer max = Collections.max(list);
        System.out.println("集合中的最大元素是: " + max);
        System.out.println("________________________");
        //对集合进行升序排列
        Collections.sort(list);
        System.out.println("集合升序排列后的结果是：" + list);
        //降序排列(先升序后反转)
        Collections.reverse(list);
        System.out.println("集合降序排列的结果是：" + list);
        //随机置换(相当于洗牌)
        Collections.shuffle(list);
        System.out.println("洗牌后的结果是：" + list);
    }
}
