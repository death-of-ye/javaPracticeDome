package javaPracticeDome.cd.practice.dome.ComprehensiveCase.Landlord;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 模拟斗地主
 * 1.买牌
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 * */
public class Landlord {
    public static void main(String[] args) {
        //1.买牌
        //创建双列集合存储牌型
        Map<Integer,String> pukers = new HashMap<>();
        //创建单列集合存储牌的编号 编号越小，牌越小
        List<Integer> list = new ArrayList<>();
        //牌的数字
        String[] numbers = {"3","4","5","6","7","8","9","10","j","Q","K","A","2"};
        //牌的花色
        String[] colors = {"♥","♠","♣","♦"};
        //牌的编号
        int num = 0;
        //使用增强for嵌套生成所有普通牌
        for (String number : numbers) {//牌的数字
            for (String color : colors) {//牌的花色
                //牌型
                String puker = color + number;
                //将牌型放入牌型集合
                pukers.put(num,puker);
                //将牌的编号放入编号集合
                list.add(num);
                //每放一次序号加一
                num++;

            }
        }
        //添加大小王
        //添加小王
        pukers.put(num,"小王");
        list.add(num++);
        pukers.put(num,"大王");
        list.add(num++);

        //2.洗牌
        //使用collections工具中的shuffle(),模拟洗牌
        Collections.shuffle(list);
        System.out.println(list);
        //3.发牌 将索引取模3来决定发给谁
        //3.1创建玩家集合和底牌(序号)
        List<Integer> liuZhiChao = new ArrayList<>();
        List<Integer> sunMing = new ArrayList<>();
        List<Integer> xueKaiLi = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        //3.2获取编号决定
        for (int i = 0; i < list.size(); i++) {
            //获取编号
            Integer pukerNum = list.get(i);
            //决定发给谁
            if(i >= list.size() - 3) {
                dipai.add(pukerNum);
                System.out.println(pukers.get(pukerNum));
            }else if (i % 3 == 0) {
                liuZhiChao.add(pukerNum);
            }else if (i % 3 == 1) {
                sunMing.add(pukerNum);
            }else {
                xueKaiLi.add(pukerNum);
            }
        }

        //打印牌型
        System.out.println(pukers);
        System.out.println(printPoker(liuZhiChao,pukers));
        System.out.println(printPoker(sunMing,pukers));
        System.out.println(printPoker(xueKaiLi,pukers));
        System.out.println(printPoker(dipai,pukers));



    }

    //4.看牌
    //定义一个方法用来看牌
    //方法名：printPoker()
    //参数列表: List<Integer> Map<Integer,String>
    //返回值：String

    public static String printPoker(List<Integer> nums , Map<Integer , String> pukers) {
        //对序号进行升序排列
        Collections.sort(nums);
        //遍历牌的序号集合，获取每一个编号
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            //num 就是每张牌的序号
            //根据序号在双列集合中找对应的牌
            String puker = pukers.get(num);
            sb.append(puker + "");
        }
        String str = sb.toString();
        return str.trim();
    };

}


