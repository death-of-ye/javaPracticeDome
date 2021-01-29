package cd.practice.dome.methodsdome;
/**
 * 认识方法
 * 格式
 * 修饰符 返回值类型 方法名(参数类型 参数值...){
 *      方法体语句
 *      return 返回值
 *
 * }
 *
 * */
public class MethodsDome1 {
    public static void main(String[] args) {
        //调用方法的注意事项
        //1.调用哪个方法就写哪个方法的名字
        //2.方法要什么类型的参数，你就传什么类型的参数，要几个就传几个
        //3.返回值什么类型，你就用什么类型接收
        int x = sum(1,2);
        System.out.println(x);
    }
    /*
    * 注意：方法与方法之间是平级不能嵌套
    * 要定义方法：1.明确返回值类型 2.明确参数列表 3. 明确方法名
    * */
    //定义一个方法求两个数的和
    public static int sum(int num1, int num2) {
        //方法体语句
        int sum = num1 + num2;
        return  sum;
    }
}
