class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        for(int index = 0; index < nums.length; index++){
            int jindex = Math.abs(nums[index]) - 1;
            if(nums[jindex] < 0){
                res[0] = jindex + 1;
            } else{
                nums[jindex] = -nums[jindex];
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index]>0){
                res[1] = index+1;
            }
        }
        return res;
    }
}
