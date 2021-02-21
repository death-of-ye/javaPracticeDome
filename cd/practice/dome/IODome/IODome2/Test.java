package javaPracticeDome.cd.practice.dome.IODome.IODome2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符流读写数据之写数据
 * 步骤
 * 1.创建字符流写文件对象
 *  Writer w = new FileWriter("C//a//2.txt");
 * 2.调用方法写入数据
 *  2.1 int read = r1.read(int x);
 *  2.1 int read = r1.read(char[] c，int index，int length);
 *  2.1 int read = r1.read(string str);
 * 3.释放资源
 *  r1.close();
 *
 * */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求：给2.txt中写入字符
        //1.创建字符流写文件对象
        Writer w = new FileWriter("C//a//2.txt");
        //2.调用方法写入数据
        //按单个字符写入
        int x = '流';
        w.write(x);
        //按字符数组写入
        char[] c = {'称','心','如','意'};
        w.write(c,0,2);
        //按字符串写入
        w.write("我叫刘智超");
        //3.释放资源
        w.close();
    }
}
