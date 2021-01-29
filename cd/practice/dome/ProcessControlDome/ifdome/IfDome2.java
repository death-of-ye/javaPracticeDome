package javaPracticeDome.cd.practice.dome.ProcessControlDome.ifdome;

/**
 * 选择结构之if语句
 * 第一种格式
 * if(关系表达式) {
 *  语句体1
 * }else {
 *  语句体2
 * }
 * 执行流程
 * 如果表达式成立，则执行语句体1;反之执行语句体2;
 *
 *
 * */
public class IfDome2 {
    public static void main(String[] args) {
        //需求 判断两个数字是否相等

        //定义两个int变量
        int a = 10;
        int b = 20;

        //通过if语句判断
        if(a != b) {
            System.out.println("a和b是不相等的");
        }else {
            System.out.println("a和b是相等的");
        }
    }
}
