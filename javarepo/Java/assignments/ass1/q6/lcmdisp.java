package q6;

import java.util.Scanner;
import selfdefs.gcd;

public class lcmdisp {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        sc.close();

        int c = gcd.calculate(a,b);

        int p= a*b;
        int d= p/c;

        System.out.println(d);
    }
    
}
