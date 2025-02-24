package university.write;

import university.Class;
import university.Student;
import university.Teacher;
import university.University;

import java.util.ArrayList;

public class UniversityWriter {
    public static void teachersInfo(University currentUniversity){
        for(Teacher teacher : currentUniversity.getTeachers()){
            System.out.println("");
            TeacherWriter.teacherInfo(teacher);
        }
    }
    public static void classesNames(University currentUniversity){
        ArrayList<Class> currentClasses = currentUniversity.getClasses();
        for(int i=0; i < currentClasses.size(); i++){
            System.out.println((i+1)+".");
            ClassWriter.className(currentClasses.get(i));
        }
    }

    public static void studentsNames(University currentUniversity){
        ArrayList<Student> currentStudents = currentUniversity.getStudents();
        for(int i=0; i < currentStudents.size(); i++){
            System.out.println((i+1)+".");
            StudentWriter.studentBasicData(currentStudents.get(i));
        }
    }

    public static void classInfo(University currentUniversity, int index){
        if(index>currentUniversity.getClasses().size()){
            System.out.println("Please select a valid class");
            return;
        }
        Class currentClass = currentUniversity.getClasses().get(index-1);
        ClassWriter.classInfo(currentClass);
    }

    public static void studentClassesInfo(University university,int studentIndex){
        ArrayList<Class> studentClasses = university.studentClasses(studentIndex);
        for(Class currentClass : studentClasses){
            ClassWriter.className(currentClass);
        }
    }
}
