import java.util.Scanner;

public class Question18
{

public static void main(String[] args) 
{

int n, x, flag = 0, i = 0;

Scanner s = new Scanner(System.in);
System.out.print("Enter size of array:");
n = s.nextInt();

int a[] = new int[n];
System.out.println("Enter the elements of array:");

for(i = 0; i < n; i++)
{
a[i] = s.nextInt();
}

System.out.print("Enter the element you want to find:");
x = s.nextInt();

for(i = 0; i < n; i++)
{

if(a[i] == x)
{
flag = 1;
break;
}

else
{
flag = 0;
}

}

if(flag == 1)
{
System.out.println(x + " is found in array");
}

else
{
System.out.println(x + " not found in array");
}

}
}


