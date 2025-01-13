public class TilingProblem {
    //You are given a 2xN floor and 2x1 tile, your task is to fill the entire floor with tile
    //return the number of ways in which the tiles can be arranged in the floor
    public static int ways(int N){
        if(N==0 || N==1){
            return 1;
        }
        //the tile can be arranged either horizontally or vertically
        //Vertically
        int verWays = ways(N-1);
        //Horizontally
        int horWays = ways(N-2);
        return verWays + horWays;

    }
    public static void main(String[] args){
        System.out.println(ways(3));
    }
    
}
