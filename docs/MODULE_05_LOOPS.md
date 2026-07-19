# 📖 Module 05: Loops & Flow Control

## 🎯 Overview

Loops allow you to execute code repeatedly. Master different loop types and flow control statements.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Use for loops effectively
- ✅ Use while and do-while loops
- ✅ Understand for-each loop
- ✅ Use break and continue
- ✅ Handle nested loops

---

## 📋 Course Content

### 1. for Loop

```java
// Syntax
for (initialization; condition; increment/decrement) {
    // Code to execute
}

// Example: Print 1 to 10
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

// Example: Sum of first 10 numbers
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
System.out.println("Sum: " + sum);
```

### 2. while Loop

```java
// Syntax
while (condition) {
    // Code to execute
    // Remember to change condition
}

// Example: Count from 1 to 5
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### 3. do-while Loop

```java
// Syntax
do {
    // Code executes at least once
} while (condition);

// Example
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### 4. for-each Loop

```java
// Syntax
for (dataType variable : array/collection) {
    // Use variable
}

// Example
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

### 5. break Statement

```java
// Exit loop immediately
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;  // Exit loop
    }
    System.out.println(i);  // Prints 1, 2, 3, 4
}
```

### 6. continue Statement

```java
// Skip current iteration
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue;  // Skip iteration
    }
    System.out.println(i);  // Prints all except 5
}
```

### 7. Nested Loops

```java
// Multiplication table
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print((i * j) + "\t");
    }
    System.out.println();
}
```

---

## 💻 Code Examples

### Example 1: Print Pyramid

```java
public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output:
// *
// * *
// * * *
// * * * *
// * * * * *
```

### Example 2: Factorial

```java
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
```

---

## 🎯 Practice Exercises

1. Print multiplication table from 1 to 12
2. Find sum of digits in a number
3. Check if number is palindrome
4. Find GCD of two numbers
5. Generate prime numbers up to 100

---

## ✅ Checklist

- [ ] Master all loop types
- [ ] Use break and continue correctly
- [ ] Create nested loops
- [ ] Solve 20+ exercises

---

**Next → Module 06: Pattern Printing**
