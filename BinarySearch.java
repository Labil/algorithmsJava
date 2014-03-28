import java.util.Arrays;

public class BinarySearch
{
	public static int rank(int key, int[] a)
	{
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi)
		{
			int mid = lo + (hi - lo) / 2;
			if(key < a[mid]) hi = mid - 1;
			else if(key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
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