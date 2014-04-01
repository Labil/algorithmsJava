public class Chapter1{
    
    //1.1.9: Make a binary representation of a number N
    public static String binaryRepPosInt(int N){
        String s = "";
        for(int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        
        System.out.println(s);
        return s;
    }
    
    /* 1.1.11: Write a code fragment to print the transposition
     * (rows and columns changed) of a two-dimensional array
     * with M rows and N cols
     */
    public static int[][] transpose(int[][] mat){
        int M = mat.length;
        int N = mat[0].length;
        
        for(int k = 0; k < M; k++){
            for(int u = 0; u < N; u++){
                StdOut.print(mat[k][u]);
            }
            StdOut.printf("\n");
        }
        StdOut.printf("\n");
        
        
        int[][] trans = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                trans[i][j] = mat[j][i];
            }
        }
        for(int k = 0; k < N; k++){
            for(int u = 0; u < M; u++){
                StdOut.print(trans[k][u]);
            }
            StdOut.printf("\n");
        }
        
        return trans;
    }
    
    /* 1.1.15: write a method that takes an array of int
     * values and an int M as args and returns an array
     * of length M whose i'th entry is the number of times
     * the integer i appeared in the argument array. If the
     * values in argument array are all between 0 and M-1, the
     * sum of the values in the returned array should=a.length
     */
    public static int[] histogram(int[] a, int M){
        int[] b = new int[M];
        int sum = 0;
        for(int i = 0; i < M; i++){
            int freq = 0;
            for(int k = 0; k < a.length; k++){
                if(a[k] == i)
                    freq++;
            }
            b[i] = freq;
            sum += freq;
        }
        StdOut.println("The sum of freqs in b: " + sum);
        StdOut.println("Length of orig arr: " + a.length);
        
        return b;
    }
    
    //Fibonacci
    public static long fib(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return fib(N-1) + fib(N-2);
    }
    
    
    public static void main(String[] args){
        
        //int num = Integer.parseInt(args[0]);
        //binaryRepPosInt(num);
        
        /*int M = 3;
        int N = 4;
        
        int[][] mat = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                mat[i][j] = (int)(StdRandom.uniform(1, 10));
            }
        }
        
        transpose(mat);*/
        
        /*int K = 20;
        int[] histArr = new int[K];
        for(int i = 0; i < K; i++){
            histArr[i] = StdRandom.uniform(0, 20);
            StdOut.println(histArr[i]);
        }
        
        histogram(histArr, K);*/
        
        for(int N = 0; N < 100; N++){
            StdOut.println(N + " " + fib(N));
        }
        
    }
}