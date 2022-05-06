import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        if(n<1) {
            System.out.println("not prime");
        } else {
            int c = 2;
            while (c*c <= n) {
                if(n % c == 0) {
                    System.out.println("not prime");
                    System.exit(0);
                }                
                c = c + 1;
            }
            System.out.println("prime");
        }
        sc.close();
    }
}
