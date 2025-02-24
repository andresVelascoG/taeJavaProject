package university;

import java.math.BigDecimal;

public abstract class Teacher extends Person{
    protected String type;
    protected double baseSalary;

    public Teacher(int id, String name, int age, double baseSalary, String type) {
        super(id, name, age);
        this.baseSalary = baseSalary;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double getSalary();

}
