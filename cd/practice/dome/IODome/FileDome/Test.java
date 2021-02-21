package javaPracticeDome.cd.practice.dome.IODome.FileDome;

import java.io.File;
import java.io.IOException;

/**
 * File类
 * 概述：文件、文件夹，一个file对象代表磁盘上的一个文件或文件夹，用于操作文件
 * (夹)路径。
 * 构造方法
 * File(String pathname) 根据字符串类型的路径名创建file对象
 * File(String parent, String child) 根据字符串类型的父文件夹路径加字符串类型子文件(夹)创建file对象
 * File(File parent, String child) 根据父文件夹对象加字符串类型子文件(夹)创建file对象
 * 成员方法
 * 创建 如果没有就创建，返回true 有就不创建，返回false
 *  boolean newFile = file.createNewFile();创建文件
 *  boolean mkdirs = file.mkdir()创建单级目录
 *  boolean mkdirs = file.mkdirs()创建多级目录或单级目录
 * 判断
 *  boolean directory = file.isDirectory(); 判断是否是文件夹
 *  boolean file1 = file.isFile(); 判断是否是文件
 *  boolean exists = file.exists(); 判断是否存在
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求：将C/a/1.txt封装成File对象
        //1.根据字符串类型的路径名创建file对象
        File file = new File("C://a//1.txt");
        //2.根据字符串类型的父文件夹路径加字符串类型子文件(夹)创建file对象
        File file1 = new File("C://a", "1.txt");
        //3.根据父文件夹对象加字符串类型子文件(夹)创建file对象
        File file2 = new File(file, "");

        //创建文件
        File file3 = new File("C://a//b");
        File file4 = new File("C://a//2.txt");
        File file5 = new File("C://a//3.txt");
        createFile(file4);
        createFiles(file3);
        System.out.println("________________________");

        //判断文件
        isMyFile(file3);
        isMyFile(file4);
        isMyFile(file5);


        System.out.println(file);
        System.out.println(file1);
        System.out.println(file2);
    }

     /**
      * @Description: 创建文件
      * @Param: File file
      * @Author: 刘智超
      * */
     public static void createFile(File file) throws IOException {
         boolean newFile = file.createNewFile();
         if (newFile) {
             System.out.println("文件创建成功");
         }else {
             System.out.println("创建失败或者已存在");
         }
     }

     /**
      * @Description:创建文件夹
      * @Param:File file
      * @Author:刘智超
      * */
     public static void createFiles(File file) {
         boolean mkdirs = file.mkdirs();
         if (mkdirs){
             System.out.println("文件夹创建成功");
         }else {
             System.out.println("创建失败或者已存在");
         }
     }

     /**
      * @Description:判断file对象是否是文件
      * @Param:File file
      * @Author:刘智超
      * */
     public static void isMyFile(File file) {
         boolean directory = file.isDirectory();
         boolean file1 = file.isFile();
         boolean exists = file.exists();
         System.out.println(exists);
         System.out.println(directory);
         System.out.println(file1);
         if (directory) {
             System.out.println(file + " 是一个文件夹");
         }else if (file1) {
             System.out.println(file+ " 是一个文件");
         }else if (!exists) {
             System.out.println(file+ " 根本不存在是否需要创建");
         }else {
             System.out.println("你是不是秀逗了");
         }

     }
}


