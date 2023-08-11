import java.util.Scanner;

public class switch1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int ch;
		int n1,n2,res;
		float div;
		System.out.println("[1] Addition \n[2] Subtraction \n[3] Multiplication \n[4] Division");
		System.out.print("Enter Your Choice : ");
		ch = sc.nextInt();
		switch(ch) 
		{
			case 1:
				//Addition
				{
					System.out.print("Enter 1st Number : ");
					n1=sc.nextInt();
					System.out.print("Enter 2nd Number : ");
					n2=sc.nextInt();
					res=n1+n2;
					System.out.println("Addition of "+n1+" and "+n2+" is : "+res);
				}
				break;
			
			case 2:
				//Subtraction
				{
					System.out.print("Enter 1st Number : ");
					n1=sc.nextInt();
					System.out.print("Enter 2nd Number : ");
					n2=sc.nextInt();
					res = n1-n2;
					System.out.println("Subtraction od "+n1+" and "+n2+" is : "+res);
				}
				break;
				
			case 3: 
				//Multiplication
				{
					System.out.print("Enter 1st Number : ");
					n1=sc.nextInt();
					System.out.print("Enter 2nd Number : ");
					n2=sc.nextInt();
					res=n1*n2;
					System.out.println("Multiplication of "+n1+" and "+n2+" is : "+res);
				}
				break;
				
			case 4:
				//Division
				{
					System.out.print("Enter 1st Number : ");
					n1=sc.nextInt();
					System.out.print("Enter 2nd Number : ");
					n2=sc.nextInt();
					div =(float)n1/n2;
					System.out.println("Division of "+n1+" and "+n2+" is : "+div);
				}
				break;

			default:
				System.out.println("---INVALID CHOICE---");
				break;
		}
	}
}
