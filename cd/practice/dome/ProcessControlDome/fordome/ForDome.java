package cd.practice.dome.ProcessControlDome.fordome;
/**
 * 循环结构之for循环
 * 格式
 * for(初始化语句 判断条件语句 控制条件语句 ) {
 *      循环体
 * }
 * 执行流程
 * 第一次循环 ：先执行初始化语句，后执行条件判断，如果不成立，循环结束，如果条件成立，执行循环体，后执行
 *            控制条件语句，第一次循环结束，
 * 第二次循环 ：先执行条件判断，如果不成立，循环结束，如果条件成立，执行循环体，后执行
 *            控制条件语句，第二次循环结束，
 *  依次类推
 *
 * */
public class ForDome {
//    创建main方法
    public static void main(String[] args) {

        //需求 打印5次helloworld
        for(int i = 0; i <= 4; i++) {
            System.out.println("helloworld");
        }
    }
}
