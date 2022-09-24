public class SkipCharA {
    public static void main(String[] args) {
        String input = "bbcaacdhea";
        //skipping(input,"");                          // without returning a value

        System.out.println(skippingReturn(input));      // with returning a value
    }

    private static void skipping(String input, String output) {

        if(input.isEmpty()){
            System.out.println(output);
            return;
        }

        char c= input.charAt(0);
        if(c == 'a')
            skipping(input.substring(1),output);
        else
            skipping(input.substring(1),output+c);
    }


    private static String skippingReturn(String input) {

        if(input.isEmpty()){
            return " ";
        }

        char c= input.charAt(0);
        if(c == 'a')
            return skippingReturn(input.substring(1));
        else
            return c + skippingReturn(input.substring(1));
    }

}
