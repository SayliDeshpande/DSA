public class SubSequence {
    
    // Idea is : pass two strings, input and output
    //initially output string is empty, start processing input which is unprocessed string, and output will be in processed string
    //whenever unprocessed string i.e. input string is empty return processed string i.e output
    // start reading char by char, and make two recursive calls, one recursive call with char and without char
    public static void main(String[] args) {
        String str= "abc";
        subseq("",str);
    }

    private static void subseq(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subseq(processed,unprocessed.substring(1));
        subseq(processed+ch,unprocessed.substring(1));
    }
}
