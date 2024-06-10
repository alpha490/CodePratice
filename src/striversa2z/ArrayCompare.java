package striversa2z;

import java.util.ArrayList;
import java.util.List;

public class ArrayCompare {

	public List<Integer> comparearray(int[]arr1 , int[]arr2)
	{
		List<Integer> li = new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==arr2[i])
			{
				li.add(arr1[i]);
			}

		}
		return li;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayCompare Ac = new ArrayCompare();
        int[] arr1 = {1,3,45,5,4,5,4,5,6,4,3,2,1,1,9};
        int[] arr2 = {1,3,45,5,6,5,4,7,6,9,3,2,2,1,9};
		System.out.println(Ac.comparearray(arr1,arr2));
	}

}
