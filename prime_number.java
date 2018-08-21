import java.util.Scanner;
class prime_number {

public static void main(String args[]) {
 int f;
Scanner obj = new Scanner(System.in);

int n = obj.nextInt();

for(int i=1;i<=n;i++)
{
  f = 0;
   for(int j=1;j<=n;j++)
{

if(i%j==0)
f++;
}
if(f==2)
System.out.println(i);
}

}
}