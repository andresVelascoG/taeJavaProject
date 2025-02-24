package university;

import java.util.ArrayList;
import java.util.List;

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

    private void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }

    public void addTeacher(Teacher newTeacher) {
        this.teachers.add(newTeacher);
    }

    public void addClass(Class newClass) {
        this.classes.add(newClass);
    }

    public void enrollStudent(String name, int age, int classIndex){
        int studentsEnrolled = this.getStudents().size();
        int newId = this.getStudents().get(studentsEnrolled-1).getId() +1;
        Student newStudent = new Student(newId, name, age);
        this.addStudent(newStudent);
        Class currentClass = this.getClasses().get(classIndex);
        currentClass.addStudent(newStudent);
    }

    public  void createClass(String name, String classroom, int teacherId, ArrayList<Student> studentsArray){
        int currentClasses = this.getClasses().size();
        int newId = this.getClasses().get(currentClasses-1).getId() +1;
        Teacher currentTeacher = this.getTeachers().get(teacherId);
        Class newClass = new Class(newId, name, classroom,studentsArray, currentTeacher);
        this.addClass(newClass);
    }

    public ArrayList<Class> studentClasses(int studentIndex){
        int studentId = this.getStudents().get(studentIndex).getId();
        ArrayList<Class> filteredClasses = new ArrayList<>();
        for(Class currentClass:this.getClasses()){
            if(currentClass.hasStudent(studentId)){
                filteredClasses.add(currentClass);
            }
        }
        return filteredClasses;

    }
}
