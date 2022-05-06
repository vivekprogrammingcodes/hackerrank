// package hackerrank;

import java.util.Scanner;

public class pallin {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        A = A.toLowerCase();
        String reverse = "";
        for(int i=A.length()-1 ; i>=0 ; i--) {
            reverse = reverse + A.charAt(i);
        }
        if(reverse.equals(A)) {
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }
        sc.close();
    }
}
