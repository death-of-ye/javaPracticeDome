package cd.practice.dome.objectdome.abstractDome.abstractDome1;
/*定义子类 经理*/
public class Manager extends Employee {
    //特有的成员变量
    //奖金
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double salary, String id, double bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void works() {
        System.out.println("看程序猿敲代码");
    }


}
