package javalib;
class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class CE {
    public static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        }
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch  (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
