package strings;

public class StringExample {
    public static void main(String[] args) {
        String str = "RohanSwami";
        System.out.println(str.length()); // return the length of the string
        System.out.println(str.charAt(2)); // return the character present at index 2
        System.out.println("rohan".equalsIgnoreCase(str)); // compare both string ignoring case sensitive
        System.out.println(str.substring(3)); // return substring from index 3 to end
        System.out.println(str.substring(2,7)); // returns substring as per beg and end index
    }
}
