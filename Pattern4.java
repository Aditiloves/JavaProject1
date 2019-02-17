
public class Pattern4
{
	public static void main(String[] args) {
		int i=0,j=0,k=0,z=7;
		for(i=0;i<5;i++)
		{
			System.out.print("\n");
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=z;k>i;k--)
			{
				System.out.print("*");
			}
			z--;
		}
	}

}
