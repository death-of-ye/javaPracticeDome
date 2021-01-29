package javaPracticeDome.cd.practice.dome.CommonCategories;
/**
 * 猜数字小游戏
 * */
//导包
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        //创建导包类对象
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //生成1-100的随机数
        int num = r.nextInt(100) + 1;
        System.out.println("请用户输入0-100之间的数字");
        //使用for循环开始猜数字 由于不知道多少次可以猜对因此使用死循环
        A:for(;;) {
            //获取键盘录入数字
            int numIn = sc.nextInt();
            //录入数字与随机数比较，并给与提示
            if(numIn > num) {
                System.out.println("猜大了");
            }else if(numIn < num) {
                System.out.println("猜小了");
            }else {
                //猜对后，关闭循环
                System.out.println("恭喜你猜对了");
                break A;
            }
        }

    }
}
