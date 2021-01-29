package javaPracticeDome.cd.practice.dome;

/**
 * 数据类型转换案例
 * */
public class TransformDome {
    /*
     * 数据类型转换分为自动(隐式)类型转换和强制(显式)类型转换
     * 自动(隐式)类型转换 : 小类型转换为大类型,结果是大类型;
     * 数据类型从大到小为 (默认浮点型)double←float←long←int(默认整型)←char、byte、short
     * 强制(显式)类型转换 : 大类型转换为小类型,结果是小类型;
     * 格式：目标类型 变量名 = (目标类型)要转换的值
     * 注意：强制(显式)类型转换可能会出现精度丢失
     * */

    public static void main(String[] args) {
        int a = 10;
        byte b = 20;
        int c = a + b;
        byte d = (byte)(a + b);
        /*
        byte d = a + b; 这是一种错误的写法 因为在运算过程中小类型byte会自动转换为大类型int，结果还是大类型int;
        正确写法为int c = a + b;
        如果你还就想使用小类型byte 这个时候就需要强制转换
        正确写法为byte d = (byte)(a + b);
        */
        System.out.println(c);
        System.out.println(d);
        /*
        * 注意：强制(显式)类型转换可能会出现精度丢失
        * */
        //定义变量 aa 和 bb;
        float aa = 3.1415926F;
        int bb = (int)(aa);
        System.out.println(bb);//结果为3
        System.out.println(aa);//结果为3.1415926F


    }
}
