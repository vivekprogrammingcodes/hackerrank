// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class fibonaccievensum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();

            long n1 = 0;
            long n2 = 1;
            long sum = 0;
            long sum2 = 0;
            while(sum < n) {
                sum = n1 + n2 ;
                if(sum % 2 == 0) {
                    sum2 = sum2 + sum ;
                }
        
                System.out.println(sum);
                n1 = n2;
                n2 = sum ;
            }
            System.out.println(sum2);
        }
        in.close();
    }
}
