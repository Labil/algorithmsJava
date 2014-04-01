public class Fibonacci{
   
    static long[] fibs;
    //Fibonacci
    public static long fib(int N){
        if(N == 0) return fibs[0];
        if(N == 1) return fibs[1];
        fibs[N] = fibs[N-1] + fibs[N-2];
        return fibs[N];
    }
    
    
    public static void main(String[] args){
        int N = 100;
        fibs = new long[N];
        fibs[0] = 0;
        fibs[1] = 1;
        for(int i = 0; i < N; i++){
            StdOut.println(i + " " + fib(i));
        }
        
    }
}