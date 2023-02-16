class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
         // two pointer approach
        if(s.length() == 0){
            return true;
        }
        for(int i = 0 , j = s.length() - 1 ; i < j ; i++ , j--){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}

/*
Complexity Analysis

Time complexity : O(n) in length n of the string.
We traverse over each character at-most once, until the two pointers meet in the middle, or when we break and return early.

Space complexity : O(1)
No extra space required, at all.

*/
