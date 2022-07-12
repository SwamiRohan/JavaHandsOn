package strings;

import java.sql.Timestamp;

// String Builder is better in performance but the problem with string builder is - it is not synchronised
// means it is not thread safe (two threads can call a string builder method simultaneously)
// if threading is involved it is better to use string buffer in these cases.

public class StringBuilderEx {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Timestamp before : "+timestamp);

        StringBuilder stringBuilder = new StringBuilder("a");
        for (int i =0; i<10000; i++){
            stringBuilder.append("b");
        }

        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        System.out.println("Timestamp after : "+ timestamp1);
    }
}
