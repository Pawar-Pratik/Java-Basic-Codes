package marksheet;

import java.util.Scanner;

public class marksheet {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n1,n2,n3;
		String name;
		float avg;
		
		System.out.print("Enter Name : ");
		name = sc.next();
		
		System.out.print("Enter Marks For Subject 1 : ");
		n1 = sc.nextInt();
		System.out.print("Enter Marks For Subject 2 : ");
		n2 = sc.nextInt();
		System.out.print("Enter Marks For Subject 3 : ");
		n3 = sc.nextInt();
		
		avg = (float)(n1+n2+n3)/3;
		
		System.out.println();
		System.out.println("----------MARKSHEET----------");
		System.out.println("Name : "+name);
		System.out.println("Marks for Subject 1 : "+n1);
		System.out.println("Marks for Subject 2 : "+n2);
		System.out.println("Marks for Subject 3 : "+n3);
		System.out.println("Average : "+avg);
		
		if(avg>35)
		{
			if(n1<35 || n2<35 || n3<35)
			{
				System.out.println("\t---FAIL---");
			}
			else
			{
				System.out.println("\t---PASS---");
			}
		}
		else
		{
			System.out.println("\t---FAIL---");
		}
		System.out.println("------------------------------");
	}
}
