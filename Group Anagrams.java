class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list = new ArrayList<>();
        HashMap<String, ArrayList<String>>map = new HashMap<>();
        for(String s : strs)
        {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sortStr = new String(ch);
            if(map.containsKey(sortStr))
            {
                ArrayList<String>tempList = map.get(sortStr);
                tempList.add(s);
                map.put(sortStr, tempList);
            }
            else
            {
                ArrayList<String>tempList = new ArrayList();
                tempList.add(s);
                map.put(sortStr, tempList);
            }
        }
        for(String s : map.keySet())
        {
            list.add(new ArrayList(map.get(s)));
        }
        return list;
    }
}
