class Main{
    public static void main(String[] args){
        //Print numbers from N to 1
        //calculate factorial of a number
        //print the sum of first N natural numbers.
        // printDec(10);
        // System.out.println(factorial(5));
        // System.out.println(sum(5));
        System.out.println(fibonacci(6));

    }
    public static void printDec(int N){
       //base case
        if(N == 0){
            return;
        }
        //work
        System.out.print(N+" ");
        //recursion
        printDec(N-1);
    }
    public static int factorial(int num){
        //B C
        if(num == 0){
            return 1;
        }
        int ans = num * factorial(num-1);
        return ans;
    }
    public static int sum(int N){
        if(N == 0){
            return 0;
        }
        int snM1 = sum(N-1);
        int ans = N + snM1;
        return ans;
    }
    public static int fibonacci(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        int ans = fibonacci(N-1) + fibonacci(N-2);
        return ans;
            
    }
}
// Note - Base Case is important to avoid Stack Overflow