package exceptionhandling;

public class ExceptionHandlingEx1 {
    public static void main(String[] args) {
        try {
            int i = 9 / 0;
            System.out.println("output is :  + i); " + i);
        } catch (Exception ex) {
            System.out.println("Exception is thrown" + ex);
        } finally {
            System.out.println("Bye");
        }
    }
}
