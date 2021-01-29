package javaPracticeDome.cd.practice.dome.ProcessControlDome.ifdome;

/**
 * 选择结构之if语句
 * 第三种格式
 * if(关系表达式1) {
 *  语句体1
 * }else if(关系表达式2) {
 *  语句体2
 * }else if(关系表达式n) {
 *  语句体n
 * }else {
 *  语句体n+1
 * }
 * 执行流程
 * 如果表达式1成立，则执行语句体1;如果表达式2成立，则执行语句体2;依次类推,如果表达式n成立，
 * 则执行语句体n,否则执行语句体n+1
 * */
//导包
import java.util.Scanner;
public class IfDome3 {
    public static void main(String[] args) {
        //需求：判断语文成绩是良好还是优秀或者及格

        //创建scanner对象
        Scanner sc = new Scanner(System.in);

        //提醒用户录入语文成绩
        System.out.println("请输入0到100之内的数字作为语文成绩");

        //接受数据
        double fraction = sc.nextDouble();

        //通过if语句判断,并输出结果
        if (fraction >= 90) {
            System.out.println("该同学的语文成绩是优秀的");
        }else if (fraction >= 70 && fraction < 90) {
            System.out.println("该同学的语文成绩是良好的");
        }else if (fraction >= 60 && fraction < 70) {
            System.out.println("该同学的语文成绩是及格的");
        }else {
            System.out.println("该同学的语文成绩是不及格的");
        }

    }



}
