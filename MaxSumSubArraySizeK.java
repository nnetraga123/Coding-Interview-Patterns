class Solution{
 public int MaxSumSubarrK(int[] arr, int k) {
    	//TODO edge cases, checking arr and k for validity. 
      // Based on contrainsts the sum can overflow for numbers and might need to use long.
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
