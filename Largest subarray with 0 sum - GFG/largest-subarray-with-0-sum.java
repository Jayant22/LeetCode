// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int nums[], int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
		int longestStreak = 0, sum_i = 0;

		for (int i = 0; i < n; i++) {
			sum_i += nums[i];

			if(sum_i == 0)
				longestStreak = Math.max(longestStreak, i + 1);
			else{
				if(map.get(sum_i) != null)
					longestStreak = Math.max(longestStreak, i - map.get(sum_i));
				else
					map.put(sum_i, i);
			}
		}
		return longestStreak;
    }
}