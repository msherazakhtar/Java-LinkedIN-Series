package javaLinkedInSeries;
public class ClassesAndObjects {
    //Data Fields
    String name;
    int age;
    double salary;

    //Method to display values
    public void displayValues(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        //Creating object of the class
        ClassesAndObjects obj = new ClassesAndObjects();
        //Assigning values to data fields
        obj.name = "John Doe";
        obj.age = 30;
        obj.salary = 45000.50;
        //Calling method to display values
        obj.displayValues();
        
    }
}
