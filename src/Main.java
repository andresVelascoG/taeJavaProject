import university.*;
import university.Class;
import university.write.StudentWriter;
import university.write.UniversityWriter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello administrator! Welcome to Andres's University");
        FullTimeTeacher fTeacher1 = new FullTimeTeacher(1,"Anderson",30,50000,10);
        FullTimeTeacher fTeacher2 = new FullTimeTeacher(2,"Laura",26,45000,4);
        PartTimeTeacher pTeacher1 = new PartTimeTeacher(3,"Valeria",22,38000,15);
        PartTimeTeacher pTeacher2 = new PartTimeTeacher(4,"Carlos",45,67000, 26);

        Student student1 = new Student(101, "Andres", 22);
        Student student2 = new Student(102, "Andrea", 18);
        Student student3 = new Student(103, "Juan", 19);
        Student student4 = new Student(104, "Camila", 20);
        Student student5 = new Student(105, "Sebastian", 20);
        Student student6 = new Student(106, "Jose", 23);

        ArrayList<Student> studentsClass1 = new ArrayList<>();
        studentsClass1.add(student1);
        studentsClass1.add(student4);
        studentsClass1.add(student5);

        ArrayList<Student> studentsClass2 = new ArrayList<>();
        studentsClass2.add(student1);
        studentsClass2.add(student3);
        studentsClass2.add(student6);

        Class javaClass = new Class(1,"Java","203",studentsClass1,fTeacher1);
        Class algebraClass = new Class(2,"Lineal Algebra","102",studentsClass2,pTeacher1);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(fTeacher1);
        teachers.add(fTeacher2);
        teachers.add(pTeacher1);
        teachers.add(pTeacher2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        ArrayList<Class> classes = new ArrayList<>();
        classes.add(javaClass);
        classes.add(algebraClass);

        University andresU = new University(students,teachers, classes);
        while(true){
            //scan.nextLine();
            System.out.println("");
            System.out.println("Select a action to perform by typing the number of the action:\n" +
                    "1. Print all the professors\n" +
                    "2. Print all the classes\n" +
                    "3. Create a student and add it to a class\n" +
                    "4. Create a new class\n" +
                    "5. List all the classes of a student\n" +
                    "6. Exit from this menu");
            int selection = scan.nextInt();
            switch (selection){
                case 1:
                    UniversityWriter.teachersInfo(andresU);
                    break;
                case 2:
                    System.out.println("--------------------------");
                    UniversityWriter.classesNames(andresU);
                    System.out.println("Select the number of the class to print all its information");
                    int selectedClass = scan.nextInt();
                    UniversityWriter.classInfo(andresU, selectedClass);

                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Insert the name of the student");
                    String studentName = scan.nextLine();
                    System.out.println("Insert the age of the student ");
                    int studentAge = scan.nextInt();
                    System.out.println("--------------------------");
                    UniversityWriter.classesNames(andresU);
                    System.out.println("Select the class to enroll the student ");
                    int classIndex = scan.nextInt();
                    andresU.enrollStudent(studentName, studentAge, classIndex-1);

                    break;
                case 4:
                    scan.nextLine();
                    System.out.println("Insert the name of the class");
                    String className = scan.nextLine();
                    System.out.println("Insert the classroom of the class ");
                    String classroom = scan.nextLine();
                    System.out.println("--------------------------");
                    UniversityWriter.teachersInfo(andresU);
                    System.out.println("Select a professor for the class ");
                    int teacherIndex = scan.nextInt();
                    System.out.println("--------------------------");
                    ArrayList<Student> studentsArray = new ArrayList<>();
                    boolean addStudent = true;
                    do{
                        UniversityWriter.studentsNames(andresU);
                        System.out.println("Select the index of the student to add");
                        int addedStudent = scan.nextInt();
                        studentsArray.add(andresU.getStudents().get(addedStudent-1));
                        System.out.println("Would you like to add another student?" +
                                "\n 1. Yes" +
                                "\n 2. No");
                        int addStudentSelection = scan.nextInt();
                        if(addStudentSelection == 2){
                            addStudent = false;
                        }
                    }while (addStudent);
                    andresU.createClass(className, classroom, teacherIndex-1, studentsArray);
                    break;
                case 5:
                    UniversityWriter.studentsNames(andresU);
                    System.out.println("Insert the id of the student to search its classes");
                    int studentIndex = scan.nextInt();
                    UniversityWriter.studentClassesInfo(andresU,studentIndex-1);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scan.close();
                    return;
                default:
                    break;
            }
        }
    }
}