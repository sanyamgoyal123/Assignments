import java.util.*;
public class a3q7 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        int rev=0,temp,l;
        temp=num;

        while(num!=0)
        {
            temp=num/10;
            l=num%10;
            rev=rev*10+l;
            num=temp;
        }
        System.out.println("Reversed number is "+rev);
    }
}