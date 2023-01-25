class Solution {
    public int myAtoi(String s) {
        /*
        // what are the rules here :
        1. Whitespaces : ignore any leading whitespace.
        2. Sign : determines if the final result is negative or positive 
        3. Digits : Discard any leading zeros.
                    If no digits were found, return 0.
                    Read in all the digit characters until the first non-digit character
        4.Anything else:If any other character,stop building the output number.
        5.32-bit Integer Range: Integer.MIN_VALUE < output < Intger.MAX_VALUE
        */
        long output = 0;
        int sign = 1; // reule #2
        int index = 0;
        int n = s.length();
        while(index < n && s.charAt(index) == ' '){ // rule #1 : discard leading whitespaces
            index++;
        }
        if(index < n && s.charAt(index) == '-'){ // rule#2 : handle if negative
            sign = -1;
             index++;
        }else if(index < n && s.charAt(index) == '+'){
            index++;
        }
       

        while(index < n && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';
            output = output * 10 + digit;

            if(output < Integer.MIN_VALUE || output > Integer.MAX_VALUE){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            index++;
        }
        return sign * (int)output;
     }
}

/*
Complexity Analysis

If N is the number of characters in the input string.

Time complexity: O(N)

We visit each character in the input at most once and for each character we spend a constant amount of time.

Space complexity: O(1)

We have used only constant space to store the sign and the result.


*/
