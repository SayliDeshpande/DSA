
// leetcode problem : https://leetcode.com/problems/valid-palindrome/submissions/844863140/

public class ValidPalindrom {
    public static void main(String[] args) {
        String s="";//"race a car";//"A man, a plan, a canal: Panama";

        System.out.println( isPalindrom(s));
    }

    private static boolean isPalindrom(String s) {

        // two pointer approach

        if(s.isEmpty())
            return true;

        int start = 0;
        int end= s.length()-1;

        char chead, ctail;
        while(start <= end){
            chead = s.charAt(start);
            ctail =s.charAt(end);

            if(!Character.isLetterOrDigit(chead)) {
                start++;
            }else if(!Character.isLetterOrDigit(ctail)){
                end--;
            }else{
                if(Character.toLowerCase(chead)!= Character.toLowerCase(ctail)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
