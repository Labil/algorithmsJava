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
	java BinarySearch numbers1.txt < numbers2.txt
	//The numbers1 & 2 are whiles with some numbers in them. The program checks whether
	//the numbers in numbers2 are in the numbers1.txt file and prints out the ones that aren't

	This is a process called whitelisting. Imagine a credit card company that needs to
	check whether customer transactions are for a valid account. To do so, they can
	- Keep customers account numbers in a file, which we refer to as a whitelist
	- Produce the account number associated with each trasaction in the standard input stream
	- Use the test client to put onto standard output the numbers that are NOT associated with any
		customer, and refuse them.

	On the booksite, under the data tab, there are two files, largeW.txt (1 mill ints) and
	largeT.txt (10 million ints). (Ok, i didn't find them...) Here just a working program would not be sufficient. For 
	example, a much simpler implementation of rank(), which does not even require the array to be 
	sorted, is to check every entry
	- the computer is too slow to run this brute-force implementation of rank() for large
	number of inputs. Solving the whitelist problem for a large number of inputs is not
	feasible without efficient algorithms such as binary search and mergesort

	NOTE: to use with the test data, maybe change the program from printing out all the numbers to
	just recapping how many was not found?
*/

