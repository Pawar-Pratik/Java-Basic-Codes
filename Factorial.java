package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which nos factorial do u want");
		int n=sc.nextInt();
		int i=1;
		int factorial=1;
		while(i<=n)
		{
			factorial *=i;
			i++;
		}
		System.out.println("factorial of "+n+" is : "+factorial);
	}

}
