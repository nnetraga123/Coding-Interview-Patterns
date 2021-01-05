class Solution{
 public int MaxSumSubarrK(int[] arr, int k) {
    	//edge cases
    	int ans = Integer.MIN_VALUE;
    	int currsum = 0;
    	int counter = 0;
    	for(int i=0;i<arr.length;i++) {
    		currsum += arr[i];
    		if(counter>=k) {
    			currsum -= arr[i-k];
    		}
    		ans = Math.max(ans, currsum);
    		counter++;
    		
    	}
    	return ans;
    	
    }
}
