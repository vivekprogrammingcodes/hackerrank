import java.util.Scanner;
/**
 * Solution
 */
public class datatypejava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            System.out.println(a + " can be fitted in:");
            if ((a>= -128) && (a <= 127)) {
                System.out.println("*byte");
            }
            if ((a >= -Math.pow(2,16-1)) && ((a <= Math.pow(2,16-1)-1))) {
                System.out.println("*short");
            }
            if ((a >= -Math.pow(2,32-1)) && ((a <= Math.pow(2,32-1)-1))) {
                System.out.println("*int");
            }
            if ((a >= -Math.pow(2,64-1)) && ((a <= Math.pow(a,64-1)-1))) {
                System.out.println("*long");
            }
        }
        
        sc.close();
    }
}