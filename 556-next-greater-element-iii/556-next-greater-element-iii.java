class Solution {
    public int nextGreaterElement(int n) {
    char arr[] = (Integer.toString(n)).toCharArray();

		int l = arr.length - 2, r = arr.length - 1;
		StringBuilder Str = new StringBuilder();

		while(l >= 0 && arr[l] >= arr[l+1])	l--;

		if(l == -1) return -1;

		while(arr[r] <= arr[l]) r--;

		swap(arr,l,r);

		for (int i = 0; i <= l; i++) Str.append(arr[i]);

		for (int i = arr.length - 1; i > l; i--) Str.append(arr[i]);

		long ans = Long.parseLong(Str.toString());

		return (ans > Integer.MAX_VALUE) ? -1 : (int)ans;
	}

    void swap(char[] arr, int left, int right){
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}

