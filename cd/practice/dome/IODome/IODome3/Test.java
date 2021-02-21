package javaPracticeDome.cd.practice.dome.IODome.IODome3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流读写数据之拷贝数据
 * 步骤
 * 1.创建字符流读文件对象
 *  Reader r1 = new FileReader("C//a//1.txt");
 * 2.创建字符流写文件对象
 *  Writer w = new FileWriter("C//a//2.txt");
 * 3.调用方法读取数据
 * int read = r1.read();
 * 4.调用方法写入数据
 *  4.1 int read = r1.read(int x);
 *  4.2 int read = r1.read(char[] c，int index，int length);
 *  4.3 int read = r1.read(string str);
 * 5.释放资源
 *  r1.close();
 *  w.close();
 *
 * */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
        * 拷贝文件核心六步
        * 1.创建字符输入流对象，即数据源文件
        * 2.创建字符输出流对象，即目的地文件
        * 3.定义变量，记录获取到的字符
        * 4.循环读取，只要条件满足就一直读取，将读取到的字符赋值给变量
        * 5.将读取的字符写入目的地文件
        * 6.释放资源
        * */

        //1.创建字符输入流对象，即数据源文件
        FileReader fr = new FileReader("C//a/1.txt");
        //2.创建字符输出流对象，即目的地文件
        FileWriter fw = new FileWriter("C//a/2.txt");
        //3.定义变量，记录获取到的字符
        int s;
        //4.循环读取，只要条件满足就一直读取，将读取到的字符赋值给变量
        /*while ((s = fr.read()) != -1) {
            System.out.println(s);
            //5.将读取的字符写入目的地文件
            fw.write(s);
        }*/
        char[] cs = new char[2048];
        while ((s = fr.read(cs)) != -1) {
            System.out.println(s);
            //5.将读取的字符写入目的地文件
            fw.write(cs , 0 , s);
        }
        //6.释放资源
        fr.close();
        fw.close();


    }
}
