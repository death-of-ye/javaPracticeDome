package cd.practice.dome.ProcessControlDome.fordome;
/**
 * 循环模式之for循环案例
 * 需求：计算所有的水仙花数之和
 * 分析：
 * 水仙花数：就是指一个三位数，它的各位数字的立方等于本身
 *
 * */
public class ForDome4 {
    public static void main(String[] args) {
        //1.定义变量sum，初始值为0
        int sum = 0;

        //2.使用for循环获取100-1000之间的三位数
        for(int i = 100; i < 1000; i++) {
            //3判断它是否是水仙花数，如果是就加给sum
            int a = i % 10;//个位
            int b = i / 10 % 10;//十位
            int c = i / 100 % 10; //百位
            if(a*a*a + b*b*b + c*c*c == i) {
                System.out.println(i);
                sum += i;
            }
        }

        //打印结果
        System.out.println("sum: " + sum);
    }
}
