package university.write;

import university.Class;
import university.Student;

public class ClassWriter {
    public static void className(Class currentClass){
        System.out.println(currentClass.getName());
    }
    public  static void classInfo(Class currentClass){
        System.out.println("Id: "+currentClass.getId()+
                "\nName: "+currentClass.getName()+
                "\nClassroom: "+currentClass.getClassroom()+
                "\nStudents: ");
        for(Student student : currentClass.getStudents()){
            StudentWriter.studentBasicData(student);
        }
        System.out.println("Teacher: ");
        TeacherWriter.teacherInfo(currentClass.getTeacher());

    }
}
