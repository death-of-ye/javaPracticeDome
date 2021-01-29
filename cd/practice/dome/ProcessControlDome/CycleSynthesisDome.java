package cd.practice.dome.ProcessControlDome;
/**
 * 循环综合案例
 * 假设有三个班级，每个班级有35名同学，现在要把100个橙子发到每个同学手上，且每个人只能拿一个。
 * 如果橙子发完了，也就结束啦。
 * */
public class CycleSynthesisDome {
    public static void main(String[] args) {
        //1.定义变量 橙子的数量
        int count = 0;
        //2.使用for循环模拟发橙子的过程
        A:for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= 35; j++) {
                System.out.println("我正在给第" + i + "个班第" + j + "个同学发橙子");
                count++;

                if(count >= 100) {
                    System.out.println("橙子发完了");
                    break A;
                }
            }
        }
        //3.打印了多少个
        System.out.println("一共发了"+ count +"个");
    }
}
