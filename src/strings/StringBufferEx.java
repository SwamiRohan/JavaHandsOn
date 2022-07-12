package strings;

import java.sql.Timestamp;

// String buffer is synchronised means it is thread safe but if we have to write a code when there is only
// one thread involved it is better to use string builder in these cases because string builder is significantly
// better in performance.

public class StringBufferEx {
        public static void main(String[] args) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            System.out.println("Timestamp before : "+timestamp);

            StringBuffer stringBuffer = new StringBuffer("a");
            for (int i =0; i<10000; i++){
                stringBuffer.append("b");
            }

            Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
            System.out.println("Timestamp after : "+ timestamp1);
        }
}
