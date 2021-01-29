package javaPracticeDome.cd.practice.dome.ProcessControlDome.whiledome;
/**
 * 循环结构之while语句
 * 格式
 * 初始化语句
 * while(条件判断语句) {
 *     循环体语句
 *     控制条件语句
 * }
 * 执行流程
 * 第一次循环 ：先执行初始化语句，后执行条件判断，如果不成立，循环结束，如果条件成立，执行循环体，后执行
 *            控制条件语句，第一次循环结束，
 * 第二次循环 ：先执行条件判断，如果不成立，循环结束，如果条件成立，执行循环体，后执行
 *            控制条件语句，第二次循环结束，
 * 依次类推
 *
 *
 * */
public class WhileDome1 {
    public static void main(String[] args) {
        //需求：打印5次helloworld
        //第一种 使用for循环打印
        for(int i = 0; i <= 4; i++) {
            System.out.println("helloworld");
        }
        System.out.println("_________________________________________");
        //第二种 使用while循环打印
        //初始化语句
        int x = 0;
        //条件判断语句
        while (x <= 4) {
            //循环体语句
            System.out.println("helloworld");
            //控制条件语句
            x++;
        }
    }
}
