public class EvenOrOdd {
    public static void main(String[] args) {
        int num=5;
        System.out.println(isEvenOdd(num));
    }

    private static boolean isEvenOdd(int num) {
        // any number &' with 1 is thsat number only, 1 & 1 = 1 , 0 & 1 = 0 etc.
        //in this case , internally everything is in 0s or 1s, so whiever the number is perform & with 1 on the same if returned 1 then odd else even
        return (num & 1) != 1;
    }
}
