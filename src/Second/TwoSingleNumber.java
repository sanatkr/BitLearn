package Second;

public class TwoSingleNumber {

	public static void main(String[] args) {
		
		//int[] arr = {3,6,4,4,3,8};
		int[] arr = {10,8,8,9,12,9,6,11,10,6,12,17};
		int xoxAll = 0;
		
		// taking the xor of all the elements
		for(int i=0;i<arr.length;i++)
		{
			xoxAll = xoxAll ^ arr[i];
		}
		
		int pos = 0;
		
		// find the position where the resultant xoxAll have set bit
		while(xoxAll>0)
		{
			if((xoxAll & 1) == 1)
			{
				break;
			}
			xoxAll = xoxAll >> 1;
			pos++;
		}
		
		int ans1=0,ans2=0;
		
		// separating two groups based on the bits they have at the position pos
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]&(1<<pos))==0)
			{
				ans1 = ans1 ^ arr[i];
			}
			else
			{
				ans2 = ans2 ^ arr[i];
			}
		}
		
		System.out.println("The first number is : "+ans1);
		System.out.println("The second number is : "+ans2);
	}

}
