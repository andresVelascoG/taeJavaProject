package university;

public class PartTimeTeacher extends Teacher {
    protected int activeHours;

    public PartTimeTeacher(int id, String name, int age, double baseSalary, int activeHours) {
        super(id, name, age, baseSalary);
        this.activeHours = activeHours;
    }

    @Override
    public double getSalary() {
        return (double) this.baseSalary * this.activeHours;
    }
}
