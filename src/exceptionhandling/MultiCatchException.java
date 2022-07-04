package exceptionhandling;

public class MultiCatchException {
    public static void main(String[] args) {
        try{
            int a[] = new int[2];
            a[3] = 5;
            System.out.println("Hello");
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Bye");
        }
    }
}
