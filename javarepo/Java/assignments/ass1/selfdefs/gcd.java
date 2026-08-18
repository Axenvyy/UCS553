package selfdefs;

public class gcd {

    static public int calculate(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
}
