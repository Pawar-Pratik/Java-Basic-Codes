package ifelse;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n1,n2;
		System.out.print("Enter 1st Number : ");
		n1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number : ");
		n2 = sc.nextInt();
		
		if(n1 > n2)
		{
			System.out.println(n1+" is Greater than "+n2);
		}
		else if(n1 == n2)
		{
			System.out.println("Both numbers are equal");
		}
		else
		{
			System.out.println(n2+" is Greater than "+n1);
		}
	}
}
