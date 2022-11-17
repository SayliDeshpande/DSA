public class ReverseString {
    public static void main(String[] args) {

        String s= "hello";
       reverseString(s);
        System.out.println(reverseString(s));
    }

    private static String reverseString(String input) {
        char[] s = input.toCharArray();
        int start= 0;
        int end = s.length-1;

        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end]= temp;

            start++;
            end--;
        }
        return  new String(s);
    }

}


// leetcode prpblem : https://leetcode.com/problems/reverse-string/description/
