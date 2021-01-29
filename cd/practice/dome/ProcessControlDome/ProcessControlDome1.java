package javaPracticeDome.cd.practice.dome.ProcessControlDome;
/***
 * scanner的基本使用
 * 概述：可以通过scanner类扫描用户在控制台输入的数据
 * 步骤 1.导包 (在类前输入 import java.util.Scanner;)
 *     2.创建键盘输入对象(在类中创建 Scanner sc = new Scanner(System.in);)
 *     3.接受数据 (int i = sc.nextInt();)
 */
//1.导包
import java.util.Scanner;
public class ProcessControlDome1 {
    public static void main(String[] args) {

        //2.创建键盘输入对象
        Scanner sc = new Scanner(System.in);

        // 提示用户输入一个整数
        System.out.println("请输入一个整数");

        //3.接受数据
        int i = sc.nextInt();//代码执行过程中会等待用户录入数据

        //将用户输入的数据打印到控制台
        System.out.println("i: " + i);
    }
}
