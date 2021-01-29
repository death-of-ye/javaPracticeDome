package cd.practice.dome.objectdome.abstractDome.abstractDome1;

/*定义父类 员工类*/
public abstract class Employee {
    //成员变量
    //姓名
    private  String  name;
    //工资
    private  double  salary;
    //工号
    private  String  id;

    //构造方法之无参构造
    public Employee() {
    }
    //构造方法之全参构造
    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    //setXXX和getXXX方法
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //成员方法
    public abstract void works();
}
