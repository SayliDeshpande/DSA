public class ReverseInteger7 {
    public static void main(String[] args) {
        System.out.println(reverse(45684));
    }


    public static int reverse(int x) {

        long reversed = 0; // why long ?? long has bigger range that int , so starting with int, technically, it will not go over long range


        while(x != 0){ // perform reverse till input is 0
            int pop = x % 10; // remanider : last digit
            x /= 10; // remaning number except last digit
            reversed = reversed * 10 + pop;
            // cannot assign value which is greater than Integer.Max_value and less that Integer MIN_VALUE
            // when reversing an integer there is a possiblity that reversed number might go beyond
            //INTEGER.Max_value e,g. lets say given interger is equal to INTEGER.Max_value
            // what we try to reverse it , it will go beyond the limit
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }

        }
        return (int)reversed;
    }
}
