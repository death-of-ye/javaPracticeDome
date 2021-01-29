package cd.practice.dome.ProcessControlDome.whiledome;
/**
 * 循环结构之do...while
 * 格式
 * 初始化语句
 * do {
 *     循环体语句
 *     控制条件语句
 * }while(条件判断语句);
 * 流程
 * 第一次循环 ：先执行初始化语句，后执行循环体和控制条件语句，最后进行条件判断如果不成立，循环结束，
 *            如果条件成立，继续循环。
 * 第二次循环 ：执行循环体和控制条件语句，最后进行条件判断如果不成立，循环结束，如果条件成立，继续循环。
 * 依次类推
 * */
public class DoWhileDome {
    public static void main(String[] args) {
        //需求 使用do...while模拟练习知识点的过程
        //1.定义变量count作为学习次数 isOk作为是否学会
        int count = 0;
        boolean isOk = false;
        //2.通过do...while语句判读是否学会 true学会了 false还没学会
        do {
            System.out.println("这是我第" + count + "次练习");
            if(count >= 3) {
                isOk = true; //代表学会了
                System.out.println("我学会了");
            }
            count++;
        }while (!isOk);
    }
}
