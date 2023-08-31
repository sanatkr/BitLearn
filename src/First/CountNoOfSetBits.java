package First;
import java.util.*;

public class CountNoOfSetBits {
	
	
	//check whether the bit at the specified position is set or unset
	public static boolean checkBit(int n,int pos)
	{
		if((n&(1<<pos))==0)
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number below :- ");
		int n = sc.nextInt();
		
		int count = 0;
		
		//Approach 1
//		while(n>0)
//		{
//			if((n&1) == 1)
//			{
//				count++;
//			}
//			n = n>>1;
//		}
		
		//Approach 2
//		for(int i=0;i<32;i++)
//		{
//			if(checkBit(n,i))
//			{
//				count++;
//			}
//		}
		
		
		//Approach 3
		
		while(n>0)
		{
			n = n & (n-1);
			count++;
		}
		
		System.out.println("Total number of set bits are :-  "+count);
		sc.close();

	}

}
