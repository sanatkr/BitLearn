package Second;

public class ExceptTwoNumber {

	public static void main(String[] args) {
		
		//int[] arr = {3,6,1,4};
		  int[] arr = {1,6,4,7,5};
		int N = arr.length;
		
		int xoxArray = 0;
		
		// taking the xor of the given array elements and the numbers present in the range 1 to N+2
		for(int i=0;i<arr.length;i++)
		{
			xoxArray = xoxArray ^ arr[i];
		}
		for(int i=1;i<=N+2;i++)
		{
			xoxArray = xoxArray ^ i;
		}
		
		int pos = 0;
		
		// finding the first position from the LSB side where the xoxArray have set bit  
		while(xoxArray>0)
		{
			if((xoxArray&1) ==1)
			{
				break;
			}
			xoxArray = xoxArray>>1;
			pos++;
		}

		
		int ans1=0,ans2=0;
		
		// checking first in the given array
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
		
		//checking then in the range 1 to N+2
		for(int i=1;i<=N+2;i++)
		{
			if((i&(1<<pos))==0)
			{
				ans1 = ans1 ^ i;
			}
			else
			{
				ans2 = ans2 ^ i;
			}
		}
		
		
		System.out.println("The first answer is : "+ans1);
		System.out.println("The second answer is : "+ans2);

	}

}
