package array;

import java.util.Scanner;

public class allarray {
	int arr[] = new int[5];
	Scanner sc = new Scanner (System.in);
	
	
	public void simple()
	{
		//simple
		
		System.out.println("Enter array : ");
		for(int i=0 ; i<5 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Your array is : ");
		for(int i=0 ; i<5 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public void positive() 
	{
		//even odd
		System.out.println("Enter array : ");
		for(int i=0 ; i<5 ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Even number in your array : ");
		for(int i=0 ; i<5 ; i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd number in your array : ");
		for(int i=0 ; i<5 ; i++)
		{
			if(arr[i]%2 != 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	
	public void search()
	{
		//search
		System.out.println("Enter size of Array : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		boolean flag=false;
		int i;
		int positiion=0; 
		
		System.out.println("Enter Array : ");
		for(i=0 ; i<n ; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("your array : ");
		for(i=0 ; i<n ; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter Number to search : ");
		int s=sc.nextInt();
		for(i=0 ; i<n ;i++)
		{
			if(s==a[i])
			{
				flag=true;
				positiion=i+1;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("= "+s+" is Present in Array! and Found at : "+positiion+" position");
		}
		else
		{
			System.out.println("= "+s+" is not Present in array!");
		}
		
	}
	
	
	public void print()
	{
		//positions
		System.out.println("Enter size of Array : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		int i;
		
		System.out.println("Enter Array : ");
		for(i=0 ; i<n ; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("your array : ");
		for(i=0 ; i<n ; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the position for the element : ");
		int k=sc.nextInt();
		for(i=0 ; i<n ; i++)
		{
			if(k == i+1)
			{
				System.out.println(a[i]+" element is at "+k+" Position");
				break;
			}
		}
	}

}
