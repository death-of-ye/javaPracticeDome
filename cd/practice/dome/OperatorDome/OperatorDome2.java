package cd.practice.dome.OperatorDome;
/**
 * ++或--
 * 概述：++：自身值+1 --：自身值-1
 * 特点：1.单独使用时放在变量前后结果相同 2.参与运算时，在前时先自增或自减后参与运算 ，在后时
 * 先以原值参与运算后自增或自减
 *
 * */
public class OperatorDome2 {
    public static void main(String[] args) {
//        先定义一个int变量
        int a = 1;
/*        自增 单独使用
            a++;
            ++a;
*/
        System.out.println(a);
        /*
        * 参与运算
        * */
//        int b = a++;
        int b = ++a;
        System.out.println(a);//2或者2
        System.out.println(b);//1或者2

    }
}
