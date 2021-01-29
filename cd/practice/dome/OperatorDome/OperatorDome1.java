package cd.practice.dome.OperatorDome;
/**
 * 加法运算的特点
 * 1.如果运算符两边都是数值类型则进行加法运算
 * 2.如果运算符两边都是字符串类型或任意一边是字符串类型则进行字符串拼接
 * 3.如果字符类型参与运算则按字符在计算机中所代表的值进行运算
 * */
public class OperatorDome1 {

    public static void main(String[] args) {
//        定义两个变量同为数值类型 如果运算符两边都是数值类型则进行加法运算
        int a = 1;
        byte b = 1;
        System.out.println(a + b); // 2
//        定义一个变量为字符类型 如果字符类型参与运算则按字符在计算机中所代表的值进行运算
        char c = 'a';
        System.out.println(a + c); // 98
//        如果运算符两边都是字符串类型或任意一边是字符串类型则进行字符串拼接
        System.out.println("hello" + a ); // hello1
        System.out.println("hello" + "world" ); // helloworld
    }
}
