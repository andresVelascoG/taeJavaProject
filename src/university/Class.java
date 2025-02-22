package university;

import java.util.ArrayList;

public class Class {
    protected int id;
    protected String name;
    protected String classroom;
    protected ArrayList<Student> students;
    protected ArrayList<Teacher> teachers;

    public Class(int id, String name, String classroom, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.students = students;
        this.teachers = teachers;
    }
}
