package exceptionhandling;

// what if we don't use finally block

class connection{
    void open(){
        System.out.println("connection opened");
    }
    void close(){
        System.out.println("connection closed");
    }
}
public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        try {
            connection c = new connection();
            // connection opened
            c.open();

            // Exception will be thrown
            int i = 9 / 0;

            // Because Exception is thrown in line of code above it. Below code will never be executed
            // and connection will remain opened that's why finally block is useful
            // Because finally block will always be executed irrespective of exception is thrown or not
            c.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
