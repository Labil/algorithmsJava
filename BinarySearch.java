import java.util.Arrays;

public class BinarySearch
{
	//non-recursive
	public static int rank(int key, int[] a)
	{
		//This is non-recursive way. Here this method is now using the recurive method
		//and is itself just an interface to the recursive function so the user don't have
		//to deal with extra parameters (lo & hi)

		/*int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi)
		{
			int mid = lo + (hi - lo) / 2;
			if(key < a[mid]) hi = mid - 1;
			else if(key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;*/

		return rank(key, a, 0, a.length -1);
	}

	//recursive implementation, can be named the same - > overloading
	public static int rank(int key, int[] a, int lo, int hi)
	{	
		if(lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if(key < a[mid]) return rank(key, a, lo, mid - 1);
		if(key > a[mid]) return rank(key, a, mid + 1, hi);
		else return mid;
	}

	//unit test client, system calls main() and passes argument value "whitelist.txt" to main()
	public static void main(String[] args)
	{
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		//Loop waits for input from user to supply key
		while(!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if(rank(key, whitelist) == -1)
				StdOut.println(key);
		}
	}
}

/*
	//First compile java program in command line
	javac BinarySearch.java --> creates a BinarySearch.class
	//then
	java BinarySearch largeW.txt < largeT.txt
*/

