package First;

import java.util.*;

public class CheckSetOrUnset {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value below");
		int n = sc.nextInt();
		int i = 3;
		
		if((n&(1<<i)) == 0)
		{
			System.out.println("the bit is unset");
		}
		else
		{
			System.out.println("The bit is set");
		}

	}

}
