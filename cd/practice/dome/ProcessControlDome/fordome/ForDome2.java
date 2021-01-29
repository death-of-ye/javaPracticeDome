package cd.practice.dome.ProcessControlDome.fordome;
/**
 * 循环模式之for循环案例
 * 需求：计算1到5之间的数字之和
 * 分析：1：定义变量sum 2.依次获取1-5之间的数字 3.获取的数据加给sum 4.打印结果
 *
 * */
public class ForDome2 {
    public static void main(String[] args) {
        //1：定义变量sum作为数字之和
        int sum = 0;

        //2.依次获取1-5之间的数字
        for(int i = 1; i <= 5; i++) {
            //3.获取的数据加给sum
            sum += i;
        }

         //4.打印结果
        System.out.println("sum: " + sum);

    }
}
