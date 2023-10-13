import java.util.Scanner;

public class Sum
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x,y;
System.out.println("Enter first number: ");
x = sc.nextInt();
System.out.println("Enter second number: ");
y= sc.nextInt();
int sum = x+y;
System.out.println("The sum of x and y is: " +sum);
}
}