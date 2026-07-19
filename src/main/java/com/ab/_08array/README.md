# Module 08: Arrays - README

## 📚 Overview

Arrays are collections of elements of the same type. Learn to work with 1D, 2D, and perform searching and sorting operations.

## 🎯 Learning Objectives

- ✅ Declare and initialize arrays
- ✅ Work with 1D and 2D arrays
- ✅ Perform array operations
- ✅ Implement searching algorithms
- ✅ Implement sorting algorithms

---

## 📋 Topics Covered

### Array Types
- **1D Arrays**: Single dimension
- **2D Arrays**: Two dimensions (matrix)
- **Multi-dimensional**: 3D and beyond

### Array Operations
- **Traversal**: Access all elements
- **Searching**: Linear search, binary search
- **Sorting**: Bubble sort, selection sort, insertion sort
- **Manipulation**: Insert, delete, reverse

---

## 💻 Example Code

```java
// 1D Array declaration and initialization
int[] arr = new int[5];                    // Size 5
int[] arr = {10, 20, 30, 40, 50};         // With values

// Accessing elements
int first = arr[0];
arr[2] = 100;  // Modify

// Array iteration
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// For-each iteration
for (int num : arr) {
    System.out.println(num);
}

// 2D Array
int[][] matrix = new int[3][3];
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// 2D iteration
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## 📝 Practice Problems

### Beginner
1. Find sum of array elements
2. Find average of array elements
3. Find maximum element
4. Find minimum element

### Intermediate
1. Find second largest element
2. Reverse array
3. Rotate array by K positions
4. Remove duplicates

### Advanced
1. Implement binary search
2. Implement bubble sort
3. Find common elements in arrays
4. Merge two sorted arrays

---

## 📊 Common Array Algorithms

### Linear Search
- Time: O(n)
- Space: O(1)
- Works on unsorted arrays

### Binary Search
- Time: O(log n)
- Space: O(1)
- Requires sorted array

### Bubble Sort
- Time: O(n²)
- Space: O(1)
- Simple but slow

### Quick Sort
- Time: O(n log n) average
- Space: O(log n)
- Efficient

---

## ✅ Completion Checklist

- [ ] Declare and initialize arrays
- [ ] Work with 1D and 2D arrays
- [ ] Implement searching algorithms
- [ ] Implement sorting algorithms
- [ ] Practice 30+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 07: Functions/Methods](../_07function/README.md)
- [Module 09: Strings](../_09String/README.md)
- [Documentation](../../docs/MODULE_08_ARRAYS.md)

---

**Arrays are fundamental - master them for data structure success!** 📊
