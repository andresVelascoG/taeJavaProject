package university;

import java.math.BigDecimal;

public abstract class Teacher extends Person{
    protected double baseSalary;

    public Teacher(int id, String name, int age, double baseSalary) {
        super(id, name, age);
        this.baseSalary = baseSalary;
    }

    public abstract double getSalary();

}
