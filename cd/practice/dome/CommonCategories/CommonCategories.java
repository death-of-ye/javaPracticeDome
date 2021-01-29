package cd.practice.dome.CommonCategories;
/**
 * JAVA常用类
 *
 * */
//导包
import java.util.Random;
public class CommonCategories {
    public static void main(String[] args) {
        //创建Random类
        Random random = new Random();
        //通过random.nextInt(10)获取随机数
        int num = random.nextInt(10);//10代表获取随机数的范围是0-10之间，包含0不包含10，前闭后开
    }
}
