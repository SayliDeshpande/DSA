class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int subLen = 0;
        int n = s.length();
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                j = Math.max(map.get(c), j);
            }
            subLen = Math.max(subLen, i - j + 1);    
            map.put(c, i + 1);
        }
        return subLen;
    }
}
/*class Solution {
    public int lengthOfLongestSubstring(String s) {
       // brute force approach : time complexity is Bigo(nˆ3)
       // make use of HashSet to check for duplicates
       int n = s.length();
       int subLen = 0;

       for(int i = 0 ; i < n ; i++){
           for(int j = i ; j < n ; j++){
               if(checkIfUnique(s, i , j)){
                   subLen = Math.max(subLen, j - i + 1);
               }
           }
       }
        return subLen;
    }

     boolean checkIfUnique(String s, int start, int end){
         Set<Character> set = new HashSet<>();
         for(int i = start ; i <= end ; i++){
             char c = s.charAt(i);
             if(set.contains(c)){
                 return false;
             }else{
                 set.add(c);
             }
         }
         return true;
     }
}*/
