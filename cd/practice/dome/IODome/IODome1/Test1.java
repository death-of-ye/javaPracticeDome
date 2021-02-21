package javaPracticeDome.cd.practice.dome.IODome.IODome1;
/**
 * 字符流读写数据之读数据
 * 步骤
 * 1.创建字符流读文件对象
 *  Reader r1 = new FileReader("1.txt");
 * 2.调用方法读取数据
 *  int read = r1.read();
 * 3.释放资源
 *  r1.close();
 *
 * */
import javaPracticeDome.cd.practice.dome.IODome.FileDome.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test1 extends Test{
    public static void main(String[] args) throws IOException {
        File f1 = new File("C//a//2.txt");
        createFile(f1);

        //1.创建字符流读文件对象
        Reader r1 = new FileReader("C//a//1.txt");
        //2.调用方法读取数据
        // (一次读取一个字符)
        //定义变量用于接收读取到字符
//        int read;
//        while ((read = r1.read()) != -1) {
//            System.out.println(read);
//        }
        //一次读取一个字符数组(将每次读到的字符放到一个字符数组中)
        char[] c3 = new char[1024];
        int read1 = r1.read(c3);
        System.out.println(c3);
        System.out.println(read1);
        //3.释放资源
        r1.close();


    }
}
