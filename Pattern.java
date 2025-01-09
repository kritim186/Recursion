public class Pattern {
    public static void patt(int N){
       //Rows(Outer Loop)
       for(int i = 0; i < N; i++){
        //spaces
        for(int j = N-1; j > i; j--){
            System.out.print(" ");
        }
        //Stars
        for(int k = 0; k <= i; k++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
    public static void patt2(int n){
        //rows
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = n-1; j >= i; j--){
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        patt(5);
        patt2(5);
    }
}
