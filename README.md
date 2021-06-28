# Sum of previous
Implement [com.epam.rd.autotasks.arrays.SumOfPrevious](src/main/java/com/epam/rd/autotasks/arrays/SumOfPrevious.java) method:
<br><b>getSumCheckArray(int[] array)</b> - returns an array of booleans where each element is a result of a check if a corresponding element is a sum of two previous elements in given array.

- Method takes an array of integers as a parameter.
- The length of given array is guaranteed to be 2 or more.
- Given array is guaranteed to be not null.
- Method returns an array of booleans where each element is a result for corresponding element in given array.
- First two elements of the boolean array are always false.

Class [com.epam.rd.autotasks.arrays.SumOfPrevious](src/main/java/com/epam/rd/autotasks/arrays/SumOfPrevious.java)
 contains <b>public static void main(String[] args)</b>. 
 <br>You may use it to check your solution.
 
 Example:
 <br><i>Input array</i>:
 <br>`[1, -1, 0, 4, 6, 10, 15, 25]`
 <br><i>Output array</i>:
 <br>`[false, false, true, false, false, true, false, true]`
 
 
 If you want ro run tests, you need to install 
 [maven](https://maven.apache.org/install.html) and run the below command
 in terminal from your project directory:
  <br>`mvn clean test`