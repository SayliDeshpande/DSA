public class ReverseWordsII {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        char[] input = s.toCharArray();
        String ans =reverseWords(input);
        System.out.println(ans);

    }

    private static String reverseWords(char[] input) {
        int i=0;
        int j=0;
        int n= input.length;

        while(i<n && j<n){
            while(i < j || i < n && input[i] == ' ')i++;
            while(j < i || j < n && input[j] != ' ')j++;
            reverseString(input, i, j-1);
        }
        return new String(input);
    }

    public static void reverseString(char[] input, int i,int j) {
        while(i < j){
            char temp = input[i];
            input[i++]=input[j];
            input[j--]=temp;
        }
    }
}
// Leetcode problem #557 : Given a string s, reverse the order of characters in each word within a sentence 
//while still preserving whitespace and initial word order.
/*Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"*/
