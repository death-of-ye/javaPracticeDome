package javaPracticeDome.cd.practice.dome;

/**
 * 这是我的第一个JAVA程序 Hello World
 */
public class HelloWorld {
    /**
     * JAVA的入口是main方法，格式是固定的
     */
    public static void main(String[] args) {
        /*
         * 这是main的主体
         * */
        // 这是一条输出语句 输出  Hello World
        System.out.println("Hello World");
        String xx = xx(120);
        System.out.println(xx);
    }

    public static String xx (int num) {
        int x = 0;
        int y = 0;
        int z = 0;
        int a = 0;
        for (;;){
            if(x * 2 * 1.2 == num){
                z = num / 2 - x;
                break;
            }else {
                x++;
            }
        }
        for (;;){
            if(y * 2 * 0.8 == num){
                a = num / 2 - y;
                break;
            }else {
                y++;
            }
        }
        return "赚了" + z + "元" + "赔了"+ a +"元";


    }


}
