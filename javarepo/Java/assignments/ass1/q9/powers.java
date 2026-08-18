package q9;
import java.util.Scanner;


public class powers {

    static int calculate(int base, int exp){
    int result =1;

    while (exp>0){
        if((exp & 1)==1){
            result *= base;
        }
        base *= base;
        exp=exp/2;
    }
    return result;
}

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int base = sc.nextInt();
        int exponent = sc.nextInt();

        sc.close();

        int result = calculate(base, exponent);

        System.out.println(result);
        }
    
};


