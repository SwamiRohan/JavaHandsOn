package exceptionhandling;


// Here InvalidAgeException is a sub Exception of Exception as it is extending the exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
public class CustomException {
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age should be more than 18");
        }
        else{
            System.out.println("Welcome, to cast your vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(19);
        }catch (InvalidAgeException iex){
            System.out.println("Caught the Exception: " + iex);
        }
    }
}
