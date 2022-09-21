public class PatternUsingRecursion {
    public static void main(String[] args) {
        int row=4;
        int column=0;
        printTriangle1(row, column);
        printTriangle2(row, column);
    }

    public static void printTriangle1(int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("*");
            printTriangle1(r,c+1);
        }else{
            System.out.println();
            printTriangle1(r-1,0);
        }

    }


    public static void printTriangle2(int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            printTriangle2(r,c+1);
            System.out.print("*");
        }else{
            printTriangle2(r-1,0);
            System.out.println();
        }

    }
}
