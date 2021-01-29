/**
 * 变量的数据类型
 * 基本类型
 * 整数型(字节型 byte 短整型 short 整数型 int 长整型 long)
 * 浮点型(单精度浮点 float 双精度浮点 double)
 * 字符型(字符型 char)
 * 布尔型(布尔型 boolean)
 * 引用类型
 * 类(class)
 * 接口(interface)
 * 数组([])
 * 注意事项：
 * 整数型默认是int 如果使用long要在数值后加L 大小写都可以
 * 浮点型默认是double 如果使用float 要在数值后加F 大小写都可以
 *
 * */
public class VariableDome1 {
    public static void main(String[] args) {
//        字节型 byte
        byte a = 1;
        System.out.println(a);
//        短整型 short
        short b = 2;
        System.out.println(b);
//        整型 int
        int c = 30;
        System.out.println(c);
//        长整型 long
        long d = 444444444444L;
        System.out.println(d);
//        单精度浮点型 float
        float aa = 0.12F;
        System.out.println(aa);
//        双精度浮点型
        double bb = 0.15924;
        System.out.println(bb);
//        字符型 char
        char abc = 'a';
        System.out.println(abc);
//        布尔型
        boolean x = true;
        boolean y = false;
        System.out.println(x);
        System.out.println(y);
    }
}
