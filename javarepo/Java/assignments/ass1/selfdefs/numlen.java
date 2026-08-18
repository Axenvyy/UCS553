package selfdefs;

public class numlen {

    public static int calculate(int n){

        int count=0;

        while(n!=0){
            n=n/10;
            count++;
        }

        return count;
    }
    
}
