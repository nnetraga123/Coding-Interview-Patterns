public int characterReplacement(String s, int k) {
        /*int ans = 0;
        HashMap<Character, Integer> seen = new HashMap<>();
        int currlength = 1;
        int deletions = 0;
        char[] c = s.toCharArray();
        char tocomp = c[0];
        int lastindex = 0;
        char prevcomp = c[0];
        Boolean update = true;
        for(int i=1;i<s.length();i++) {
        	char curr = c[i];
        	if(c[i]==tocomp) {
        		currlength++;
        	}
        	else {
        		if(deletions<k) {
        			if(!seen.containsKey(c[i])) {
        				seen.put(c[i],i);
        			}
        			
        			currlength++;
        			deletions++;
        			if(update) {
        			lastindex = seen.get(c[i]);
        			update = false;
        			prevcomp = c[i];
        			}
        		}
        		else {
        			ans = Math.max(currlength, ans);
        			currlength = 1;
        			deletions = 0;
        			i = lastindex;
        			tocomp = prevcomp;
        			update = true;
        		}
        		
        	}
        	
        }
        return Math.max(ans,currlength);*/
	 int len = s.length();
     int[] count = new int[26];
     int start = 0, maxCount = 0, maxLength = 0;
     for (int end = 0; end < len; end++) {
         maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
         while (end - start + 1 - maxCount > k) {
             count[s.charAt(start) - 'A']--;
             start++;
         }
         maxLength = Math.max(maxLength, end - start + 1);
     }
     return maxLength;
    }
