package q3; /* nothing inside it */
import java.util.Scanner;

public class factorial {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        
        if(i<0){
            System.out.println("Factorial is not defined bye");
        } else if(i==0||i==1){
            
        
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    
}
sc.close();
}}
