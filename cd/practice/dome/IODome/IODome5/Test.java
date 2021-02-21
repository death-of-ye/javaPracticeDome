package javaPracticeDome.cd.practice.dome.IODome.IODome5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流读写数据之拷贝数据
 * 步骤
 * 1.创建字节输入流对象，关联信息源文件
 *   FileInputStream fis = new FileInputStream("C//a//1.jpg");
 * 2.创建字节输出流对象，关联目的地文件
 *   FileOutputStream fos = new FileOutputStream("C//a//2.jpg");
 * 3.定义变量用于接收读取的内容
 *   byte[] b = new byte[2048];
 *   int sb;
 * 4.使用循环读取，只要条件满足就读，并将读取的内容赋值给变量
 *   while ((sb = fis.read(b)) != -1) {
 *              5.将读取到内容写入目的地文件
 *              fos.write(sb);
 *          }
 * 6.释放资源
 *   fis.close();
 *   fos.close();
 *
 * */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求：使用字节流将1.jpg拷贝给2.jpg
        //1.创建字节输入流对象，关联信息源文件
        FileInputStream fis = new FileInputStream("C//a//1.jpg");
        //2.创建字节输出流对象，关联目的地文件
        FileOutputStream fos = new FileOutputStream("C//a//3.jpg");
        //3.定义变量用于接收读取的内容
        byte[] b = new byte[102400];
        int sb;
        //4.使用循环读取，只要条件满足就读，并将读取的内容赋值给变量
        while ((sb = fis.read(b)) != -1) {
            //5.将读取到内容写入目的地文件
            fos.write(b , 0 , sb);
        }
        //释放资源
        fis.close();
        fos.close();

    }
}
