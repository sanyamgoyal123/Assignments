import java.util.*;
class leap_year{
void check(int y)
{
 if(y%4==0 && y%100!=0 || y%400==0)
   System.out.println("leap year");
 else
   System.out.println("not a leap year");
}
}
public class a3q2 {
   public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter year");
     int year=sc.nextInt();
       leap_year l = new leap_year();
       l.check(year);
   }
 }