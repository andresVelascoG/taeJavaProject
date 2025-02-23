import university.FullTimeTeacher;
import university.PartTimeTeacher;
import university.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello administrator! Welcome to Andres's University");
        FullTimeTeacher fTeacher1 = new FullTimeTeacher("");
        FullTimeTeacher fTeacher2 = new FullTimeTeacher("");
        PartTimeTeacher pTeacher1 = new PartTimeTeacher("");
        PartTimeTeacher pTeacher2 = new PartTimeTeacher("");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        ArrayList<Student> studentsClass1 = new ArrayList<>();
        studentsClass1.add(student1);
        studentsClass1.add(student4);
        studentsClass1.add(student5);

        ArrayList<Student> studentsClass2 = new ArrayList<>();
        studentsClass2.add(student1);
        studentsClass2.add(student3);
        studentsClass2.add(student6);

        SuperMarket mySupermarket = new SuperMarket(firstProduct);
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