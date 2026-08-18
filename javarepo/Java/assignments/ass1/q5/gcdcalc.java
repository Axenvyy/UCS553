
package q5;

import selfdefs.gcd;
import java.util.Scanner;

class Main{
public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    sc.close();

    int c= gcd.calculate(a, b);

    System.out.println(c);

    
}}
