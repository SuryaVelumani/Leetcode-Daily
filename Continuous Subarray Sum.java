class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        if(k == 0)
        {
            boolean flag = false;
            for(int index = 1; index < nums.length; index++)
            {
                if(nums[index] == 0 && nums[index - 1] == 0)
                {
                    flag = true;
                }
            }
            return flag;
        }
        map.put(0,-1);
        int temp = 0;
        for(int index = 0; index < nums.length; index++)
        {
            temp += nums[index];
            if(map.containsKey(temp % k))
            {
                if((index - (map.get(temp % k))) > 1)
                {
                    return true;
                }
            }
            map.putIfAbsent(temp % k, index);
        }
        return false;
    }
}
