package cd.practice.dome.ProcessControlDome;
/**
 * 选择结构之switch语句示例
 *
 * */
//导包
import java.util.Scanner;
public class Swic {

    //创建main方法
    public static void main(String[] args) {

        /*需求：根据键盘录入数字，输出相对应的星期*/
        //创建键盘录入对象，以便用户输入，接受数据
        Scanner sc = new Scanner(System.in);

        //提醒用户输入数字，并接收
        System.out.println("请输入数字");
        int week = sc.nextInt();

        //根据用户输入的数字判断 使用switch判断
        switch (week) {
            case 1 :
                System.out.println("今天是星期一");
                break;
            case 2 :
                System.out.println("今天是星期二");
                break;
            case 3 :
                System.out.println("今天是星期三");
                break;
            case 4 :
                System.out.println("今天是星期四");
                break;
            case 5 :
                System.out.println("今天是星期五");
                break;
            case 6 :
                System.out.println("今天是星期六");
                break;
            case 7 :
                System.out.println("今天是星期天");
                break;
            default:
                System.out.println("看来你不是地球人");
                break;
        }
    }

}
