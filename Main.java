class Main{
    public static void main(String[] args){
        //Print numbers from N to 1
        //calculate factorial of a number
        //print the sum of first N natural numbers.
        // printDec(10);
        // System.out.println(factorial(5));
        // System.out.println(sum(5));
        // System.out.println(fibonacci(6));
        // int[] arr = {2, 4, 0, 1, 0};
        // System.out.println(findKey(arr, 0, 0));
        // System.out.println(findLastKey(arr, 0, 0));
        System.out.println(expo(3, 10));
        System.out.println(expoOptimized(3, 10));

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
    //find the first occurrence of an element in an array
    public static int findKey(int[] arr, int index, int key){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == key){
            return index;  
        }
        return findKey(arr, index+1,key);
                        
    } 
    public static int findLastKey(int[] arr, int index, int key){
        if(index == arr.length){
            return -1;
        }
        int ans = findLastKey(arr, index+1,key);
        if(ans == -1 && arr[index] == key){
            return index;  
        }
        return ans;
                        
    } 
    public static int fibonacci(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        int ans = fibonacci(N-1) + fibonacci(N-2);
        return ans;
            
    }
    //Print X to the power N using Recursion
    //here the time complexity is O(N)..N ---> 0
    public static int expo(int x, int n){
        //When it comes to writing a Base Case we know what is the output for that case.
        if(n == 1){
            return x; 
        }
        int ans = x * expo(x, n-1);
        return ans;
    }
    //Optimized way to solve the expo question in O(logN) time complexity
    public static int expoOptimized(int x, int n){
        if(n == 1){
            return x;
        }
        int ans;
        if(n%2 == 0)
              ans = expoOptimized(x, n/2) * expoOptimized(x, n/2);
        else  ans = x * expoOptimized(x, n/2) * expoOptimized(x, n/2);
        return ans;    
    }
    
}
// Note - Base Case is important to avoid Stack Overflow