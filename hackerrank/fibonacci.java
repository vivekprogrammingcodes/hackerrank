// import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n  = 5;
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        // int n3;
        for (int i = 1; i < n ; i++) {
            
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2 ;
            n2  = sum;
        }
    }
}
