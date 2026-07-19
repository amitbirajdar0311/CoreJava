# 📖 Module 08: Arrays

## 🎯 Overview

Arrays are collections of elements of the same type stored in contiguous memory. Learn to work with 1D, 2D, and multi-dimensional arrays.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Declare and initialize arrays
- ✅ Work with 1D and 2D arrays
- ✅ Perform array operations
- ✅ Use searching and sorting
- ✅ Handle array edge cases

---

## 📋 Course Content

### 1. 1D Array Declaration & Initialization

```java
// Declaration and Initialization
int[] arr = new int[5];              // Size 5, default values 0
int[] arr = {10, 20, 30, 40, 50};   // Initialize with values
int[] arr = new int[]{1, 2, 3};     // Anonymous array

// Accessing elements
int first = arr[0];      // 10
int last = arr[4];       // 50
arr[2] = 100;            // Modify element
```

### 2. Array Properties

```java
int[] arr = {10, 20, 30, 40, 50};

// Length
int len = arr.length;    // 5

// Iterate
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// For-each
for (int num : arr) {
    System.out.println(num);
}
```

### 3. 2D Arrays

```java
// Declaration and Initialization
int[][] matrix = new int[3][3];
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing elements
int element = matrix[0][1];   // 2
matrix[1][2] = 100;           // Modify

// Iterate
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### 4. Common Array Operations

#### Sum of Elements
```java
int[] arr = {10, 20, 30, 40, 50};
int sum = 0;
for (int num : arr) {
    sum += num;
}
System.out.println(sum);  // 150
```

#### Find Maximum
```java
int[] arr = {10, 50, 20, 40, 30};
int max = arr[0];
for (int num : arr) {
    if (num > max) {
        max = num;
    }
}
System.out.println(max);  // 50
```

#### Reverse Array
```java
int[] arr = {1, 2, 3, 4, 5};
for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
// Result: {5, 4, 3, 2, 1}
```

### 5. Searching

#### Linear Search
```java
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;  // Not found
}
```

#### Binary Search
```java
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

### 6. Sorting

#### Bubble Sort
```java
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

---

## 💻 Code Examples

### Example 1: Find Average

```java
public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        double average = (double) sum / arr.length;
        System.out.println("Average: " + average);  // 30.0
    }
}
```

### Example 2: 2D Matrix Operations

```java
public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Print matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        // Sum all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);  // 45
    }
}
```

### Example 3: Duplicate Elements

```java
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
```

---

## 🎯 Practice Exercises

1. Find second largest element in array
2. Rotate array by k positions
3. Find common elements in two arrays
4. Count frequency of elements
5. Remove duplicates from array

---

## ✅ Checklist

- [ ] Declare and initialize arrays
- [ ] Work with 1D and 2D arrays
- [ ] Implement searching algorithms
- [ ] Implement sorting algorithms
- [ ] Solve 20+ exercises

---

**Next → Module 09: Strings**
