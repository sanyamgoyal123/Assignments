import java.util.*;
public class a3q5 {
   public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
   int num = n.nextInt();
        int rev=0,temp,l,o;
        o=num;

        while(num!=0)
        {
            temp=num/10;
            l=num%10;
            rev=rev*10+l;
            num=temp;
        }
      if(o==rev)
            System.out.println("Is Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}