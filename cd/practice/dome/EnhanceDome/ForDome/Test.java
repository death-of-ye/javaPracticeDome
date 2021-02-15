package javaPracticeDome.cd.practice.dome.EnhanceDome.ForDome;


import java.util.ArrayList;
import java.util.List;

/*
* 增强for格式
* for(元素的数据类型 变量名 : 要遍历的数组或复合对象){
*      循环体 变量也是元素
*
* 快捷方法
* iter ------ 回车
*
* 注意:
* 增强for的底层依赖的是迭代器(Iterator),它是迭代器的简写形式
* }
* */
public class Test {
    public static void main(String[] args) {
        //需求:使用增强for遍历list集合
        //步骤
        //1.创建集合对象
        List list = new ArrayList();
        //2.创建元素对象
        //3.将元素对象添加到集合中
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //4.遍历集合
        for(Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("______________________");

        for (Object o : list) {
            //o是集合中的元素 其本身应为Integer类型
            Integer i = (Integer) o;
            System.out.println(i);
        }

    }
}
