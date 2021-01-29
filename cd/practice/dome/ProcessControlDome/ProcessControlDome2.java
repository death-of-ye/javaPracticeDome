package cd.practice.dome.ProcessControlDome;
/**
 * 案例：键盘输入两个数，求它们的和
 *
 * */
//导包
import java.util.Scanner;
public class ProcessControlDome2 {
    public static void main(String[] args) {
        //创建scanner对象
        Scanner sc = new Scanner(System.in);

        //提醒用户录入数据,并接收
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();

        //求和
        int sum = a + b;

        //打印结果
        System.out.println("sum: " + sum);
    }


}
