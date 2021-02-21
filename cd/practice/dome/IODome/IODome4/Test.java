package javaPracticeDome.cd.practice.dome.IODome.IODome4;

import java.io.*;

/**
 *字符缓冲使用法
 * 分类：
 *      BufferedReader字符缓冲输入流
 *          构造方法
 *              public BufferedReader(Reader reader);
 *          成员方法
 *              public String readLine() 一次读取一行数据并返回读取到的内容，读取不到返回null
 *      BufferedWriter字符缓冲输出流
 *          构造方法
 *              public BufferedWriter(Writer writer);
 *          成员方法
 *              public void newLine() 根据当前操作系统给出对应的换行符
 *
 *  注意：字符流只能拷贝文本文件
 * */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求：使用字符缓冲流将1.txt的内容拷贝到2.txt中
        //1.创建字符缓冲输入流，关联数据源文件
        BufferedReader br = new BufferedReader(new FileReader("C//a//1.txt"));
        //2.创建字符缓冲输出流，关联目的地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("C//a//2.txt"));
        //3.定义变量，用于存储获取到字符
        int len;
        //4.循环读取，只要条件已满足就读取，并将读取到的字符赋值给变量
        while ((len = br.read()) != -1) {
            //5.将读取的字符写入目的地文件
            bw.write(len);
        }
        //6.释放资源
        br.close();
        bw.close();
    }
}
