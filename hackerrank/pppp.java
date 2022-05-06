import java.util.Scanner;

public class pppp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxprime = -1;
        while (n % 2 == 0 ) {
            maxprime = 2;
            n = n / 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            while (n % i == 0) { 
                maxprime = i; 
                n = n / i; 
            } 
        } 

        if (n > 2) 
           maxprime = n; 


        System.out.println(maxprime);

        sc.close();
    }
}
