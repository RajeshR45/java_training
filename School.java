// OOPS CONCEPT

import java.util.*;

//Abstraction
abstract class Details{

    //Encapsulation
    private String name;

    //Constructor    
    public Details(String name1){
        this.name = name1;

    }

    String getname() { return name; }

    abstract void Add();
}

public class School{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> teacher = new ArrayList<>();
        ArrayList<String> student = new ArrayList<>();

        while(true){

            System.out.print("\n School Management \n 1. Add Teacher \n 2. Add Student \n 3. Show Teachers \n 4. Show Students \n 5.Exit \n Enter an option: ");
            int op = sc.nextInt();

            switch(op){

                case 1:
                    System.out.println("Enter the name of the Teacher: ");
                    String name = sc.next();
                    teacher.add(name);
                    Teacher t = new Teacher(name);
                    t.Add();
                    break;

                case 2:
                    System.out.print("Enter the name of the Student: ");
                    String sname = sc.next();
                    student.add(sname);
                    Student s = new Student(sname);
                    s.Add();
                    break;

                case 3:
                    System.out.print("Teachers:\n");
                    for(String a : teacher){
                        System.out.println(a);
                    }
                    break;

                case 4:
                    System.out.print("Students:\n");
                    for(String a : student){
                        System.out.println(a);
                    }
                    break;

                case 5:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.print("Invalid input");
            }
        }
    }
}

class Teacher extends Details{

    public Teacher(String name1) {
        super(name1);
    }

   // @override
    void Add() {
        System.out.print(getname() + " added successfully ");
    }
}

class Student extends Details{

    public Student(String name1){
        super(name1);
    }

   // @override
    void Add(){
        System.out.print(getname() + " added successfully ");
    }
}