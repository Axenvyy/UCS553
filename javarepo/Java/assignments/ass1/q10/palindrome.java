package q10;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String str  = sc.nextLine();

        sc.close();

        String normed= str.toLowerCase();

        char[] arr = normed.toCharArray();

        int n= arr.length;

        int j=n-1;
        int i=0;

        boolean palindrome = true;

        while(i<j){
            if(arr[i]!=arr[j]){palindrome=false;break;};
            i++;j--;
        }

        System.out.println(palindrome);

        
    }
    
}
