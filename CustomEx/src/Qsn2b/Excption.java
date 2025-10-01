package Qsn2b;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Excption {
    public static void main(String[] args) {
        try {
            int number = -10;
            if (number < 0) {
                throw new MyCustomException("Number cannot be negative!");
            }
            System.out.println("Number is: " + number);
        } 
        catch (MyCustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
