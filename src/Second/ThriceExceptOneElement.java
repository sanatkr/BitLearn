package Second;

public class ThriceExceptOneElement {

	public static void main(String[] args) {
		
		int[] arr = {5,7,5,4,7,11,11,9,11,7,5,4,4};
		int ans = 0;
		
		for(int i=0;i<32;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if((arr[j]&(1<<i))!=0)
				{
					count++;
				}
			}
			
			if(count%3!=0)
			{
				ans = ans|(1<<i);
			}
		}
		System.out.println("The required answer is : "+ans);

	}

}
