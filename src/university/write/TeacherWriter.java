package university.write;

import university.Teacher;

public class TeacherWriter {
    public static void teacherInfo(Teacher currentTeacher){
        System.out.println("Id: "+currentTeacher.getId()+
                ", Name: "+currentTeacher.getName()+
                ", age: "+currentTeacher.getAge()+
                ", contract type: "+currentTeacher.getType()+
                ", salary: "+currentTeacher.getSalary());
    }
}
