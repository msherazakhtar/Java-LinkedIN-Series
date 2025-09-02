package javaLinkedInSeries;

public class Encapsulation {
    //private data fields
    private String name;
    private int age;
    private double salary;

    //Getter and Setter methods
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        //Setting values using setter methods
        obj.setName("Jane Doe");
        obj.setAge(28);
        obj.setSalary(55000.75);
        //Getting values using getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Salary: " + obj.getSalary());
    }
}
