import java.util.*;
public class a3q6 {

    public static void main(String[] args) {
   Scanner obj = new Scanner(System.in);
    int num = obj.nextInt();
        int i=2,f=0;

        while(i<(num/2))
        {
            if(num%i==0){
                f=1;
                break;
            }
            else{
                f=0;
            }
            i++;
        }

        if(f==0)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}