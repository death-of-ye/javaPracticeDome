package cd.practice.dome.ProcessControlDome.fordome;
/**
 * 循环模式之for循环案例
 * 需求：计算1到1000之间的偶数之和
 * 分析：1：定义变量sum,初始值为0 2.依次获取1-1000之间的数 3.判断获取的数字是否是偶数，是就
 *      加给sum不是则继续循环 5.打印结果
 *
 * */
public class ForDome3 {
    public static void main(String[] args) {
        //1.定义变量sum,初始值为0
        int sum = 0;
        //2.依次获取1-1000之间的偶数 使用for循环
        for(int i = 1; i <= 1000; i++) {
            if(i % 2 == 0) {
                //3.判断获取的数字是否是偶数，是就加给sum不是则继续循环
                sum += i;
            }
        }
        //4.打印结果
        System.out.println("sum: " + sum);

    }
}
