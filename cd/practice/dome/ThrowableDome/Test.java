package javaPracticeDome.cd.practice.dome.ThrowableDome;
/**
 * 异常的处理方法
 * 1.JVM处理：由控制器打印错误信息，终止程序
 * 2.自己处理:使用try...catch(finally) 捕获异常
 * try{
 *     //尝试执行的代码
 * }catch(Exception e){
 *     //出现可能异常处理代码
 * }finally{
 *     //一定会执行的代码，如关闭资源等等
 * }
 * 特点：先处理异常，后继续执行代码
 * 执行流程：先执行try{}语句中的代码看看是否有异常，
 *          有：先执行catch(){}中的代码，后执行finally{}中的代码,继续执行后面的代码
 *          没有：执行finally{}中的代码,继续执行后面的代码
 *
 * 3.交给调用者处理：使用throws抛出异常
 * 特点：执行结束后，程序不继续执行
 * */
public class Test {
    public static void main(String[] args) throws Exception{
        try{
            int a = 10 / 0;
        }catch (Exception e) {
            System.out.println("被除数不能为0");
        }finally {
            System.out.println("看看我执行了");
        }

        System.out.println("_________________________");
        //因为show方法抛出异常，调用者(main方法)必须处理异常
        //处理异常一 继续抛
        //处理二：使用try{}catch(){}处理
        try{
            show();
        }catch (Exception e){
            System.out.println("程序出问题了");
        }

        System.out.println("_________________________");

    }

    //定义一个方法抛出异常
    public static void show() throws Exception{
        int a = 10 / 0;
        System.out.println(a);
    }
}
