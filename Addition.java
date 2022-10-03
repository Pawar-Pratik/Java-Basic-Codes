import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----For Addition-----");
		System.out.print("Enter Number 1 :");
		no1 = sc.nextInt();
		System.out.print("Enter Number 2 :");
		no2 = sc.nextInt();
		res = no1+no2;
		System.out.println("Addition of "+no1+" And "+no2+" is : "+res);
		System.out.println();
		
		
		System.out.println("-----For Subtraction-----");
		System.out.print("Enter Number 1 : ");
		no1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		no2 = sc.nextInt();
		res= no1-no2;
		System.out.println("Subtraction of "+no1+" And "+no2+" is : "+res);
		System.out.println();
		
		
		System.out.println("-----For Multiplication-----");
		System.out.print("Enter Number 1 : ");
		no1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		no2 = sc.nextInt();
		res= no1*no2;
		System.out.println("multiplication of "+no1+" And "+no2+" is : "+res);
		System.out.println();
		
		
		float div;
		System.out.println("-----For Division-----");
		System.out.print("Enter Number 1 : ");
		no1 = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		no2 = sc.nextInt();
		div=(float)no1/no2;
		System.out.println("Division of "+no1+" And "+no2+" is : "+div);
				

	}
}
