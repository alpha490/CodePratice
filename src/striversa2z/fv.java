package striversa2z;

public class fv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1,6,7},{2,0,5},{90,7,5}};
		int min = arr[0][0];
		
		for(int i = 0 ; i<3 ;i++)
		{
			for(int j =0 ; j<3 ;j++)
			{
				if(min>arr[i][j])
				{
					min = arr[i][j];
				}
			}
		}
		System.out.println(min);
		int n = 11;
		int a = 0;
		int b = 1;
		
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			 sum = a + b;
			 //System.out.println(sum);
			 a = b;
			 b =sum;
			 
		}
		
	}

}

