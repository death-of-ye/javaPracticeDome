package javaPracticeDome.cd.practice.dome.ComprehensiveCase.SimulateUploadingAvatar;

import java.awt.image.BufferedImageFilter;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

//使用控制器模拟上传头像
public class SimulateUploadingAvatar {
    public static void main(String[] args) throws IOException {
        File path = getPath();
//        System.out.println(path);
        Boolean exists = isExists(path.getName());
//        System.out.println(exists);
        if (exists) {
            //3.如果存在，就提示该头像已存在，上传失败
            System.out.println("该头像已存在，上传失败");
        }else {
            //4.如果不存在，就上传到目的地文件，提示上传成功
            uploadFile(path);
        }
    }
    //1.定义一个方法用于获取用户上传的图片路径

    /**
     * @Description: 用于获取用户上传的头像路径
     * @return: File file
     * @Author: death-of-ye
     */
    public static File getPath() {
        //1.提醒用户输入要上传的头像路径
        Scanner sc = new Scanner(System.in);
        //7.由于不知道多少次会成功，所有使用while循环
        while (true) {
            System.out.println("请输入要上传的头像路径");
            String path = sc.nextLine();
            //2.判断文件后缀名是否是 .jpg .png
            //3.如果不是就提示用户：您输入的不是图片，请重新输入
            if (!path.endsWith(".jpg") && !path.endsWith(".png")) {
                System.out.println("您输入的不是图片，请重新输入");
                continue;
            }

            //4.如果是就继续执行程序，判断路径是否存在，是否是个文件
            File file = new File(path);
            if (file.exists() && file.isFile()) {
                //6.如果是，就直接返回
                return file;
            } else {
                //5.如果不是就提示，你输入的头像已存在，请重新输入
                System.out.println("你输入的头像不存在，请重新输入");
            }
        }


    }

    //2.定义一个方法用于判读用户上传的图片路径是否存在
    public static Boolean isExists(String path) {
        //1.将目的地文件夹封装成file对象
        File file = new File("C/a");
        //2.获取目的的文件夹下的所有文件(夹)的名称数组
        String[] list = file.list();
        //3.遍历第二部获取到数组，下面的数据依次和path进行比较
        for (String name : list) {
            if (name.equals(path)) {
                //4.如果一致，说明该用户头像已存在，返回true
                return true;
            }
        }
        return false;
    }

    //4.定义一个方法用于文件上传
    /**
     * @Description: 文件上传
     * @Param: File  path 关联数据源文件
     * @Author: death-of-ye
     * */
    public static void uploadFile(File path) throws IOException {
        //1.创建字节缓冲输入流，关联数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        //2.关键字节缓冲输出流，关联目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C//a//" + path.getName()));
        //3.定义变量，用于接收读取到的字节
        int len;
        //4.循环读取，只要条件满足就一直读，并将读到的字节赋值给变量
        while ((len = bis.read()) != -1) {
            //5.将读取的字节写入到目的地
            bos.write(len);
        }

        //6.释放资源
        bis.close();
        bos.close();

        System.out.println("已上传到C/a/" + path.getName());
    }
}
