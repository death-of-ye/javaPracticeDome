package cd.practice.dome.ProcessControlDome.fordome;
/**
 * 循环模式之for循环案例
 * 需求：打印1到5之间的数字
 *
 * */
public class ForDome1 {
    //创建main方法
    public static void main(String[] args) {
        //第一种办法 这种方法比较原始
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("————————————————————————");

        //通过原始方法发现，改变的只是输出的值，这个时候就可以使用for循环
        //第二种方法 使用for循环
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("————————————————————————");

        //打印5-1之间的数字
        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
