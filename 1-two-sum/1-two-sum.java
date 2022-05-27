class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int arr[] = {-1, -1};

        if(arr.length == 0)
            return arr;

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(target - nums[i])){
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
                System.out.println(nums[map.get(target - nums[i])]+ " " + nums[i] + " " + arr[0] + " " + arr[1]);
                return arr;
            }

            map.put(nums[i],i);
        }

        return arr;
    }
}