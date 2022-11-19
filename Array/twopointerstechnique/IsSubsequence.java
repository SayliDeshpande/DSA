public class IsSubsequence {

    public static void main(String[] args) {
        String s="axc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }


    public static boolean isSubsequence(String s, String t) {

        int i =0;
        int j=0;

        int count=s.length();

        while(j<s.length() && i <t.length())
        {
                if(s.charAt(j)==t.charAt(i)) {
                    i++;
                    j++;
                    count--;
                }else {
                    i++;
                }
        }
        if(count==0)
            return true;

        return false;


    }
}
