package Binary_Serach;

public class BS1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//search in sorted array
		int[] nums = {-1,0,3,5,9,12};
		
		int target = 9;
		int s = binarysearch(nums,target);
		System.out.println(s);
		}
		
	static int binarysearch(int[] a, int target)
		{
			 int start = 0;
			 int end = a.length-1;
			 while(start<=end)
			 {int mid = start + (end - start)/2;
	       if(target< a[mid])
{end = mid-1;}
			
			else if (target>a[mid])
			{start = mid+1;}else
			{
				return mid;
			//answer found
			}}
			 return -1;}}
