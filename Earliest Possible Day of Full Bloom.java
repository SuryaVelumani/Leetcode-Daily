class Solution {
  public int earliestFullBloom(int[] plantTime, int[] growTime) {
    int cur = 0, ans = 0, n = plantTime.length;
   
    PriorityQueue<int[]> q = new PriorityQueue<>(n, (int[] o1, int[] o2) -> o2[1] - o1[1]);
    for(int i = 0; i != n; i++)
      q.add(new int[]{plantTime[i], growTime[i]});
    
    while(!q.isEmpty()){
      int t[] = q.poll();  
      ans = Math.max(ans, cur + t[0] + t[1]);
      cur += t[0];
    }
           
    return ans;
  }
}
