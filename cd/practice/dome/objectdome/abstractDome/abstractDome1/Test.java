package cd.practice.dome.objectdome.abstractDome.abstractDome1;
//测试类
/*
* 需求：在开发过程中有程序猿和经理两种角色，他们都有姓名、工号、工资等属性，都有工作等行为。
* 经理有奖金属性，请使用继承思想设计所需要的类
* 父类 Employee
*  name salary id works()
* 子类
* 程序猿类继承Employee
* 经理类继承Employee
* 特有属性  bonus
*
*
*
* */
public class Test {
    public static void main(String[] args) {
        //测试程序猿类
        Employee em = new Programmer();
        em.works();
        System.out.println("____________________");

        //测试经理类
        Employee em1 = new Manager();
        em1.works();
        System.out.println("__________________________");

        //需求：创建一个名字叫刘智超 工资300000 工号为研发部007的员工
        //传统做法
        Programmer p = new Programmer();
        p.setName("刘智超");
        p.setSalary(300000);
        p.setId("研发部007");
        System.out.println("姓名：" + p.getName());
        System.out.println("工资：" + p.getSalary());
        System.out.println("工号：" + p.getId());
        System.out.println("__________________________");
        //使用构造方法
        Programmer p1 = new Programmer("刘智超",300000,"研发部007");
        System.out.println("姓名：" + p.getName());
        System.out.println("工资：" + p.getSalary());
        System.out.println("工号：" + p.getId());
    }
}
