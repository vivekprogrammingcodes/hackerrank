// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class multiple35 {
    
    static Long multiple(Long n) {
        
        long a, threeMultiple, b, fiveMultiple, c, fifteenMultiple  ;
       
            if( n % 3 == 0 ) {
                 a = (n / 3) - 1 ;
                threeMultiple = a*((3+(a*3))/2);
            } else {
                a = n / 3;
                threeMultiple = a*((3+(a*3))/2);
            }
            System.out.println(threeMultiple);            

            if( n % 5 == 0 ) {
                b = (n / 5) - 1;
                fiveMultiple = b*((5+(b*5))/2);
            } else {
                b = n / 5;
                fiveMultiple = b*((5+(b*5))/2);
            }
            System.out.println(fiveMultiple);

            if( n % 15 == 0 ) {
                c = (n / 15) - 1 ;
                fifteenMultiple = c*((15+(c*15))/2);
            } else {
                c = n / 15;
            fifteenMultiple = c*((15+(c*15))/2);
            } 
            System.out.println(fifteenMultiple);

            return threeMultiple + fiveMultiple - fifteenMultiple;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            Long n = in.nextLong();
            System.out.println(multiple(n));
        }
        in.close();
    }
}