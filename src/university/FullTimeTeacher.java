package university;

import java.math.BigDecimal;

public class FullTimeTeacher extends Teacher{
    protected int xpYears;

    public FullTimeTeacher(int id, String name, int age, double baseSalary, int xpYears) {
        super(id, name, age, baseSalary, "Full time");
        this.xpYears=xpYears;
    }

    @Override
    public double getSalary() {
        double salary = (double) this.baseSalary * this.xpYears;
        return salary;
    }
}
