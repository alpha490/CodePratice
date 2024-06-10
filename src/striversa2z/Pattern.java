package striversa2z;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =0 ; i<5;i++)
		{
			for(int l=4 ;l>i;l--)
			{
				System.out.print("  ");
			}
			for(int j =0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			for(int m=4 ;m>i;m--)
			{
				System.out.print("  ");
			}
			System.out.println(" ");
		}

	}

}
