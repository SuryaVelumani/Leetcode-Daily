class Solution {
    public int maxLength(List<String> arr) {
        List<String> answer = new ArrayList<>();
        answer.add("");
        for(String str : arr)
        {
            if(!uniqueFunction(str))
            {
                continue;
            }
            List<String>tempList = new ArrayList<>();
            for(String child : answer)
            {
                String demo = child + str;
                if(uniqueFunction(demo))
                {
                    tempList.add(demo);
                }
            }
            answer.addAll(tempList);
        }
        int ans = 0;
        for(String str:answer)
        {
            ans = Math.max(ans, str.length());
        }
        return ans;
    }
    
    private boolean uniqueFunction(String str)
    {
        if(str.length() > 26)
        {
            return false;
        }
        boolean used[] = new boolean[26];
        char arr[] = str.toCharArray();
        for(char ch : arr)
        {
            if(used[ch - 'a'])
            {
                return false;
            }
            else
            {
                used[ch - 'a'] = true;
            }
        }
        return true;
    }
}
