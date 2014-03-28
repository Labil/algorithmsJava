Notes to Algorithms (4th edition) by Robert Sedgewick & Kevin Wayne
Chapter 1


Static methods allow us to encapsulate and reuse code and to develop 
programs as a set of independent modules.

Data abstraction extends encapsulation and reuse to allow us to define non-primitive data types,
thus supporting object-oriented programming.

Compiling creates a lower-level version of the program in bytecode in the BinarySearch.class

A data type is a set of values and a set of operations on those values. 
Ex. primitive data types:
Integers, with arithmetic operations (int)
Real numbers, again with arithmetic operations (double)
Booleans, the set of values { true, false } with logical operations (boolean)
Characters, the alphanumeric characters and symbols that you type (char)

^ (xor) //exclusive or

The operators * and / (and %) have higher precedence than the + and - operators
Among the logical operators, ! has the highest precedence, followed by && and then ||
Operators of the same precedence are applied left to right. Parentheses to override

Casting to an int is truncation instead of rounding. Casting should be used sparingly and w/care

Java's int has 2^32 different values by design, so it can be represented in a 32-bit 
machine word
Similarly, the double standard specifies a 64-bit representation

Java has five additional primitive data types:
- 64-bit integers (long)
- 16-bit integers (short)
- 16-bit characters (char)
- 8-bit integers (byte)
- 32-bit single-precision real numbers (float)

If you assign one array name to another, they now refer to the same array. To copy you
have to create a new array and initialize it with the values of the array you wish to copy

Two-dimensional arrays:
To declare a two-dimensional array in Java just add a pair of brackets double[][] a,
double[][] a = new double[M][N]
Two-dimensional arrays may have irregular size (jagged), but the most common is to have a fixed
length for the sub-arrays
Java initializes all entries in arrays of numeric type to zero, and og boolean type to false

Static methods are called functions in many programming languages, since they can behave like
mathematical functions. In java, the modifier "static" distinguishes these methods from
instance methods.

A method encapsulates a computation that is defined as a sequence of statements. A method takes
arguments (values of given data types) and computes a return value of some data type, or causes
a side effect that depends on the arguments.

Things to note about methods:
	- Arguments are passed by value and can thus be changed inside the methods

Recursion - three rules of thumb
- the recursion has a base case - always include a conditional statement with a return as
	the first statement in a program/method
- recursive calls must address subproblems that are smaller in some sense, so that
	recursive calls converge to the base case.
- Recursive calls should not address subproblems that overlap

Unit testing
A best practice in Java programming is to include a main() in every library of static methods that tests the methods in the library (some other languages disallow multiple main() methods, and thus to not support this approach). Proper unit testing can be a challenge in itself.
At a minimum, every module should contain a main() method that exercises the code in the module and provides some assurance that it works.

External libraries
- standard system libraries java.lang.* - Does not need to be imported. //Math, Integer, Double,
	String, StringBuilder and a lot of other libraries
- Imported system libraries such as java.utils.Arrays. -> needs to be imported at top
- Other libraries, for example ones you or others create yourselves, things from this book etc

To invoke a method from another library, we prepend the library name to the method name for each call
Math.abs(), Arrays.sort(aaa) etc

It is worthwhile to consider every program that you write as a library implementation, for possible reuse in the future.
- Write code for the client, a top-level implementation that breaks the computation up into manageable parts
- Articulate an API (documentation) for the library of static methods that can address each part
- Develop an implementation of the API with main() that tests the methods independent of the client
The purpose of an API is to separate the client from the implementation: the client should know nothing about the implementation other than information given in the API, and the implementation should not take properties of any particular client into account. (More p. 33)
