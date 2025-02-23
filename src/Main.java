import university.*;
import university.Class;

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
            System.out.println("Select a action to perform by typing the number of the action:\n" +
                    "1. Add a product\n" +
                    "2. List the products\n" +
                    "3. Sell a quantity of a product\n" +
                    "4. Remove a product\n" +
                    "5. Exit from this menu");
            int selection = scan.nextInt();
            switch (selection){
                case 1:
                    scan.nextLine();
                    System.out.println("Insert the name of the product to add:");
                    String name = scan.nextLine();
                    System.out.println("Insert the quantity of the product:");
                    int quantity = scan.nextInt();
                    System.out.println("Insert the price of the product:");
                    double price = scan.nextDouble();
                    Product newProduct = new Product(name,quantity,price);
                    mySupermarket.addProduct(newProduct);
                    break;
                case 2:
                    mySupermarket.listProducts();
                    break;
                case 3:
                    scan.nextLine();
                    mySupermarket.listProducts();
                    System.out.println("Insert the index of the product ");
                    int index = scan.nextInt();
                    System.out.println("Insert the quantity of the product ");
                    int productQuantity = scan.nextInt();
                    mySupermarket.sellProduct(index, productQuantity);
                    break;
                case 4:
                    mySupermarket.listProducts();
                    System.out.println("Insert the index of the product to delete");
                    int deleteIndex = scan.nextInt();
                    mySupermarket.deleteProduct(deleteIndex);
                    break;
                default:
                    System.out.println("Exiting the program.");
                    scan.close();
                    return;
            }
        }
    }
}