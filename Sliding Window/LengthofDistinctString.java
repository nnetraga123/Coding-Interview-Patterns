class Solution{
//Logic and reasoning is sound in answer, but does not pass for all test cases. Indexing becomes a problem as 
// the value of i needs to change to previous most. 
// Proposed change, compare to rightmost index of reapeating instead of leftmost
 /*Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
     * 
     * Example 1:

Input: s = "eceba", k = 2
Output: 3
Explanation: The substring is "ece" with length 3.
Example 2:

Input: s = "aa", k = 1
Output: 2
Explanation: The substring is "aa" with length 2.
     * 
     * */
    public int lengthofDistinctSubstring(String s, int k) {
    	int ans = 0;
    	HashMap<Character,Integer> distinct = new HashMap<>();
    	int currdistinct = 0;
    	int currlength = 0;
    	char[] c = s.toCharArray();
    	for(int i=0;i<c.length;i++) {
    		char kl = c[i];
    		if(!distinct.containsKey(c[i])&&currdistinct<=k) {
    			currdistinct++;
    			currlength++;
    			distinct.put(c[i], i);
    		}
    		else {
    			currlength++;
    			if(currdistinct>k&&distinct.containsKey(c[i])) {
    				ans = Math.max(ans, currlength);
    				int temp = i;
    				
    				i = distinct.get(c[i])+1;
    				distinct.remove(c[temp]);
    				currlength = 0;
    				
    			}
    			
    		}
    	}
    	return ans;
    	
    }

}
