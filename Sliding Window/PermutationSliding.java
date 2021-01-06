class Solution{
 public boolean checkInclusion(String s1, String s2) {
     int n = s1.length();
     int start = 0;
     int[] cc = new int[26];
     for(int i=0;i<s1.length();i++){
         cc[s1.charAt(i)-'a']++;
     }
     int end = n-1;
     while(end<s2.length()){
         
             int[] temp = cc.clone();
             //current wwindow
             for(int i=start;i<=end;i++){
                 temp[s2.charAt(i)-'a']--;
             }
             if(arrayzero(temp)){
                 return true;
             }
             
         
         //increment window by
         end++;
         start++;
     }
     return false;
 }
 
 public boolean arrayzero(int[] arr){
     for(int i=0;i<arr.length;i++){
         if(arr[i]>0){
             return false;
         }
     }
     return true;
 }
}
