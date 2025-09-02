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

public static void staticMethod(){
    System.out.println("This is a static method");
}
    public static void main(String[] args) {
        Methods obj = new Methods();
        //Calling method without parameters and return type
        obj.sayHello();
        //Calling method with parameters and return type
        Integer result = obj.addNumbers(20, 12);
        System.out.println("The result is: " + result);

        //Calling static method
        staticMethod();
    }
}
