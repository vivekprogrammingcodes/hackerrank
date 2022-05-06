import java.util.Scanner;

public class multiplesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = n / 3;
        int threemultiple = a*((3+(a*3))/2);

        System.out.println(threemultiple);

        sc.close();
    }
}
