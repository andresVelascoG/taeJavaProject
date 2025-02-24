package university;

import java.util.ArrayList;

public class University {
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Class> classes;

    public University(ArrayList<Student> students, ArrayList<Teacher> teachers, ArrayList<Class> classes) {
        this.students = students;
        this.teachers = teachers;
        this.classes = classes;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }

    public void addTeacher(Teacher newTeacher) {
        this.teachers.add(newTeacher);
    }

    public void addClass(Class newClass) {
        this.classes.add(newClass);
    }
}
