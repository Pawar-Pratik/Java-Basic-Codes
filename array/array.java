package array;

import java.util.Scanner;

public class array {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		allarray obj = new allarray();
		Scanner sc = new Scanner (System.in);
		
		do 
		{
			System.out.println("\n---MENU---\n[1] Show \n[2] Even Odd \n[3] Search \n[4] Position");
			System.out.println("Enter Your Choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				obj.simple();
				break;
				
			case 2:
				obj.positive();
				break;
				
			case 3:
				obj.search();
				break;
				
			case 4:
				obj.print();
				break;
				
			default :
				System.out.println("Invalid Choice...");
				break;
			}
		System.out.println();
		System.out.print("Do you want to continue ?  PRESS 1 : ");
		ch = sc.nextInt();
		}while(ch==1);
		System.out.println("Thank You...");

	}

}