class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0) {
            return "";
        }
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i<t.length();i++) {
            int count = map.getOrDefault(t.charAt(i),0);
            map.put(t.charAt(i), count +1);
        }
        
        int val = map.size();
        
        int l = 0, r = 0;
        int formed = 0;
        
        Map<Character, Integer> window = new HashMap<Character, Integer>();
        int[] ans = {-1,0,0};
        
        while (r<s.length()) {
            char c = s.charAt(r);
            int n = window.getOrDefault(c,0);
            window.put(c, n+1);
            
            if(map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }
            
            while(l<=r && formed==val) {
                c = s.charAt(l);
                //save smallest window
                if(ans[0]==-1 || r-l+1< ans[0]) {
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;
                }
                
                window.put(c, window.get(c)-1);
                if(map.containsKey(c) && window.get(c).intValue()<map.get(c).intValue()) {
                    formed--;
                }
                l++;
            }
            
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2]+1);
    }
}
