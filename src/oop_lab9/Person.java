package oop_lab9;

public class Person {
    private String name;
    private int age;
    private Address address;
    private Job job;

    public Person(String name, int age, Address address, Job job) {
        this.name = name;
        this.age = age;
        this.address = this.address;
        this.job = this.job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdderss() {
        return address;
    }

    public void setAdderss(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}//class
