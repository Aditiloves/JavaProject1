import java.util.Scanner;


public class starpattern1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int i,j,n;
		System.out.println("Enter value for n :: ");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		}
		
	}
}
