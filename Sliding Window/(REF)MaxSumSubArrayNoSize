   /*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     *
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.*/
    
 //REF of type of manipulation on simillar problem. This is sovled using greedy but there are multiple ways to do so. 
 // Need to test if sliding window is possible with this, what would the sliding window size be?
 // How would we be incrementing the window. 
    public int MaxSumArrayNoSize(int[] arr) {
    	int ans = Integer.MIN_VALUE;
    	int currsum = arr[0];
    	for(int i=1;i<arr.length;i++) {
    		
    		currsum = Math.max(arr[i], currsum+arr[i]);
    		ans = Math.max(ans, currsum);
    		
    	}
    	return ans;
    }
