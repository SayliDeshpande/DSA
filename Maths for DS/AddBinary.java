//leetcode problem : https://leetcode.com/problems/add-binary/description/
//Time Complexity :- BigO(max(M, N)), M & N is the length of string a, b;

//Space Complexity :- BigO(max(M, N)), which is the size of "res" object

class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        //we crete i & j pointer for string a & b and we have to start adding from right to left 
        int i = a.length() - 1; 
        int j = b.length() - 1; 
        int carry = 0; 
        // iterate over the loop until the both condition become false
        while(i >= 0 || j >= 0){
            int sum =carry; 
            // we subtract 0 from char to convert it into int, so that we can perform operations on it
            if(i >= 0) sum += a.charAt(i--) - '0'; 
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            // getting carry depend on the quotient we get by dividing sum / 2 that will be our carry. Carry could be either 1 or 0 
			// if sum is 0 res is 1 & then carry would be 0;
            // if sum is 1 res is 1 & carry would be 0
            // if sum is 2 res is 0 & carry would be 1
            // if sum is 3 res is 1 & carry would be 1
            res.append(sum % 2); //moduling the sum so, we can get remainder and add it into our result
        }
        
        if(carry != 0) res.append(carry);// add it into res until carry becomes 0;
        // revese the answer we get & convt to string and return by the help 
        return res.reverse().toString();
        
    }
}
