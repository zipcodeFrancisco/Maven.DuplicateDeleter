
# Delete Duplicates 
* **Objective**
	* To write methods which removes duplicate elements from an array.
* **Purpose**
	* To demonstrate practical understanding of `while`, `for`, and `for each` loops.
* **Instructions**
    * Given an object, `DuplicateDeleter`, with a composite `Integer[]` object, write a method
        * `removeDuplicatesExactly` which removes all values in the array which occur exactly the specified number of times.
        * `removeDuplicates` which removes all values in the array which occur at least the specified number of times.

* **Restrictions**
    * No use of any built-in data structures, (`Collection`, `List`, `Map`)
    * Operations should be [idempotent](https://stackoverflow.com/questions/1077412/what-is-an-idempotent-operation)
        * The output of the methods should always be the same if the input is the same.


















# Sample Behavior - DuplicateDeleter.removeDuplicateExactly(n)

## Example 1
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{1,1,1,23,23,56,57,58};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    
    // : When
    Integer[] actual = deleter.removeDuplicateExactly(3);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [23,23,56,57,58]
    ```
    

## Example 2
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{1,1,1,23,23,56,57,58};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    
    // : When
    Integer[] actual = deleter.removeDuplicateExactly(1);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [1,1,1,23,23]
    ```
    

## Example 3
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    
    // : When
    Integer[] actual = deleter.removeDuplicateExactly(3);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [1, 1, 2, 4, 4, 5, 5, 5, 5]
    ```




















# Sample Behavior - DuplicateDeleter.removeDuplicates(n)

## Example 1
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{1,1,1,23,23,56,57,58};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    
    // : When
    Integer[] actual = deleter.removeDuplicateExactly(1);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    []
    ```




## Example 2
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    
    // : When
    Integer[] actual = deleter.removeDuplicates(2);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [2]
    ```



## Example 3
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    
    // : When
    Integer[] actual = deleter.removeDuplicates(3);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [1,1,2,4,4]
    ```
    
    
    
    
    
    
    
    
    
    
    
# Sample Behavior - Idempotence

## Example 1
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    deleter.removeDuplicates(0);
    deleter.removeDuplicates(1);
    deleter.removeDuplicates(2);
    
    // : When
    Integer[] actual = deleter.removeDuplicates(3);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [1,1,2,4,4]
    ```
    

## Example 2
* Sample Script
    ```
    // : Given
    Integer[] array = new Integer[]{1,1,1,23,23,56,57,58};
    DuplicateDeleter deleter = new DuplicateDeleter(array);
    deleter.removeDuplicates(0);
    deleter.removeDuplicates(1);
    deleter.removeDuplicates(2);
    
    // : When
    Integer[] actual = deleter.removeDuplicatesExactly(3);
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```

* Sample Output
    ```
    [23,23,56,57,58]
    ```
