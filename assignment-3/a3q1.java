import java.util.*;
class Sum {
void add(int a,int b) {
int sum = a+b;
System.out.println("sum is :" + sum);
}
}

public class a3q1 {
public static void main(String args[]) {

Scanner obj = new Scanner(System.in);
 System.out.println("enter 1st number");
int num1 = obj.nextInt();
 System.out.println("enter 2nd number");
int num2 = obj.nextInt();

  Sum s = new Sum();
s.add(num1,num2);
}
}
