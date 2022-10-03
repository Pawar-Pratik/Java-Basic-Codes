import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		float area;
		System.out.println("---For Circle---");
		System.out.print("Enter radius : ");
		n1 = sc.nextInt();
		area= (float) (n1*n1*3.14);
		System.out.println("Area of circle : "+area);
		System.out.println();
		
		
		System.out.println("---For Rectangle---");
		System.out.print("Enter Length : ");
		n1= sc.nextInt();
		System.out.print("Enter Breadth : ");
		n2= sc.nextInt();
		area = n1*n2;
		System.out.println("Area of Rectangle is : "+area);
		System.out.println();
		
		
		System.out.println("---For Traiangle---");
		System.out.print("Enter height of triangle : ");
		n1=sc.nextInt();
		System.out.print("Enter Base of triangle : ");
		n2=sc.nextInt();
		area=(float) (0.5*n1*n2);
		System.out.println("Area of Triangle is : "+area);
		System.out.println();
		
		
		System.out.println("---For Square---");
		System.out.println("Enter Side length of square : ");
		n1 = sc.nextInt();
		area=n1*n1;
		System.out.println("Area of square is : "+area);
		System.out.println();
		
	}
}
