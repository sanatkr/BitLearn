package First;

public class OddTimes {

	public static void main(String[] args) {
		int[] arr = {2,8,3,1,2,2,3,2,8,1,1};
		int ans = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			ans = ans ^ arr[i];
		}
		
		System.out.println(ans);
	}

}
