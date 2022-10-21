class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0)
        {
            return false;
        }
        final Map<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++)
        {
            if(map.containsKey(nums[index]))
            {
                final int previous = map.get(nums[index]);
                if(index - previous <= k)
                {
                    return true;
                }
            }
            map.put(nums[index], index);
        }
        return false;
    }
}
