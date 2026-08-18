package q4;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args){

    Scanner sc= new Scanner(System.in);

    int n=sc.nextInt();

    int a=1; int b= 1;
    int c=0;


    for(int i=0; i<n; i++){
        System.out.println(a);
     c= b+a;
        a=b;
        b=c;

        
    }

    



    sc.close();   
}}
  
