package javaPracticeDome.cd.practice.dome.IODome.FileDome;

import java.io.File;
import java.io.IOException;

/**
 * File类
 *  概述：文件、文件夹，一个file对象代表磁盘上的一个文件或文件夹，用于操作文件
 *      (夹)路径。
 * 构造方法
 *  File(String pathname) 根据字符串类型的路径名创建file对象
 *  File(String parent, String child) 根据字符串类型的父文件夹路径加字符串类型子文件(夹)创建file对象
 *  File(File parent, String child) 根据父文件夹对象加字符串类型子文件(夹)创建file对象
 * 成员方法
 *  创建 如果没有就创建，返回true 有就不创建，返回false
 *      createNewFile()创建文件
 *      mkdir()创建单级目录
 *      mkdirs()创建多级目录或单级目录
 *
 *  判断
 *
 * */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求：将C/a/1.txt封装成File对象
        //1.根据字符串类型的路径名创建file对象
        File file = new File("C//a//1.txt");
        //2.根据字符串类型的父文件夹路径加字符串类型子文件(夹)创建file对象
        File file1 = new File("C//a","1.txt");
        //3.根据父文件夹对象加字符串类型子文件(夹)创建file对象
        File file2 = new File(file,"");

        //创建文件
        File file3 = new File("C//a");
        boolean mkdir1 = file3.mkdirs();

        System.out.println(file);
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(mkdir1);
    }
}
