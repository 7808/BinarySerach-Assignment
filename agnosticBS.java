package Binary_Serach;

public class agnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//when we dont know if it is in acending or descending order
		int[] a = {1,2,3,4,5,6,7};
		
		int target = 5;
        int ans =  bs(a,target);
		System.out.println(ans);
	}
		
		static int bs(int a[], int target)
		{
			 int start = 0;
			 int end = a.length-1;
			 
			 
			 boolean isasc = a[start]<a[end];
				
			 while(start<=end)
			 {
				 int mid = start + (end - start)/2;
				 
				 if(a[mid] == target)
				 {
					 return mid;
				 }
			 
				 
		 if(isasc)
		        {
	              if(target< a[mid])
			     {
				end = mid-1;
			      }
			
			      else 
			       {
				   start = mid+1;
				   }
		        }
			else 
			{
				if(target> a[mid])
			{
				end = mid-1;
			}
			
			else 
			{
				start = mid+1;
			 }
			}
			 }
			 return -1;
			 }
		}
		
		