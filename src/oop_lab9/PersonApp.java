package oop_lab9;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("wiparat Seesatja",21,
                new Address("176 M.4","Phattalung",
                        "93000"),
                new Job("Teacher",15000));
        System.out.println(person.toString());


    }//main
}//class
