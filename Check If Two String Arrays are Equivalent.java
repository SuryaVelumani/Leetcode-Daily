class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();
        
        for(int index = 0; index < word1.length; index++)
        {
            firstString.append(word1[index]);
        }
        for(int index = 0; index < word2.length; index++)
        {
            secondString.append(word2[index]);
        }
        return firstString.toString().equals(secondString.toString());
    }
}
