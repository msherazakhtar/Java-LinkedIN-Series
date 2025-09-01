package javaLinkedInSeries;

public class Methods {
    // Method without parameters and return type
    public void sayHello() {
    System.out.println("Hello LinkedIn World, welcome to Java methods!");
}
// Method with parameters and return type
public Integer addNumbers(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
}
    public  void main(String[] args) {
        //Calling method without parameters and return type
        sayHello();
        //Calling method with parameters and return type
        Integer result = addNumbers(20, 12);
        System.out.println("The result is: " + result);
    }
}
