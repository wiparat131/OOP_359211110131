package oop_lab7;


import java.util.Scanner;

public class StudentApp {
    private static Student s3;

    public static void main(String[] args) {
        //create object as Student
        Student s1 = new Student();
        s1.setId("0001");
        s1.setName("Boy Saiyai");
        s1.setPid("1111111111111");
        s1.setAddress("11/1 T.Thamyai A.Thangsong");

        System.out.println(s1.toString());

        Student s2 = new Student("0002",
                "Girl Saiyai",
                "222222222222",
                "22/22 T.Thamyai A.Thangsong");

          System.out.println(s2.toString());
        // s3 = inputData(s3);
        //System.out.println(s3.toString());

        System.out.println(s2.getId());
        s2.setId("004");
        System.out.println(s2.getId());
        s2.group = "IS223";
        System.out.println(s2.group);
        System.out.println(Student.age);
        s2.age = 30;
        System.out.println(Student.age);
        System.out.println(s2.age);

    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your student info: ");
        System.out.print("student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Person: ");
        s.setPid(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddress(scanner.nextLine());
        return s;
    }

}//class
