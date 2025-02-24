package university;

import java.util.ArrayList;

public class Class {
    protected int id;
    protected String name;
    protected String classroom;
    protected ArrayList<Student> students;
    protected Teacher teacher;

    public Class(int id, String name, String classroom, ArrayList<Student> students, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.students = students;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean hasStudent(int id){
        for(Student student : this.getStudents()){
            if(student.getId()==id){
                return true;
            }
        }
        return false;
    }
}
