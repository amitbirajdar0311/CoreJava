# 📖 Module 07: Functions/Methods

## 🎯 Overview

Functions (Methods) allow you to write reusable code blocks. Learn to create, call, and optimize methods.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Declare and call methods
- ✅ Use parameters and return values
- ✅ Understand method overloading
- ✅ Use recursion
- ✅ Follow best practices

---

## 📋 Course Content

### 1. Method Declaration & Calling

```java
// Syntax
accessModifier returnType methodName(parameters) {
    // Method body
    return value;  // if return type is not void
}

// Example
public static int add(int a, int b) {
    int sum = a + b;
    return sum;
}

// Calling
int result = add(10, 20);
System.out.println(result);  // 30
```

### 2. Method with no Parameters and no Return

```java
public static void greet() {
    System.out.println("Hello!");
}

greet();  // Calling
```

### 3. Method with Parameters

```java
public static void printName(String name, int age) {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

printName("John", 25);
```

### 4. Method with Return Value

```java
public static int multiply(int a, int b) {
    return a * b;
}

int product = multiply(5, 3);
System.out.println(product);  // 15
```

### 5. Method Overloading

Multiple methods with same name but different parameters:

```java
// Overload 1: Two parameters
public static int add(int a, int b) {
    return a + b;
}

// Overload 2: Three parameters
public static int add(int a, int b, int c) {
    return a + b + c;
}

// Overload 3: Different types
public static double add(double a, double b) {
    return a + b;
}

// Calling
System.out.println(add(5, 10));           // 15
System.out.println(add(5, 10, 15));       // 30
System.out.println(add(5.5, 10.5));       // 16.0
```

### 6. Recursion

A method calling itself:

```java
// Factorial using recursion
public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;  // Base case
    }
    return n * factorial(n - 1);  // Recursive case
}

System.out.println(factorial(5));  // 120
```

### 7. Variable Scope

```java
public static void scopeExample() {
    int x = 10;  // Local variable
    
    if (x > 5) {
        int y = 20;  // Local to if block
        System.out.println(x);  // ✅ Accessible
        System.out.println(y);  // ✅ Accessible
    }
    
    // System.out.println(y);  // ❌ Error: y not in scope
}
```

---

## 💻 Code Examples

### Example 1: Basic Methods

```java
public class MethodDemo {
    
    // Method 1: No parameters, no return
    public static void sayHello() {
        System.out.println("Hello World!");
    }
    
    // Method 2: With parameters, no return
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    
    // Method 3: With parameters and return
    public static int getMax(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static void main(String[] args) {
        sayHello();                    // Hello World!
        printSum(10, 20);              // Sum: 30
        int max = getMax(15, 8);       // 15
        System.out.println("Max: " + max);
    }
}
```

### Example 2: Method Overloading

```java
public class Calculator {
    
    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println(add(5, 10));              // 15
        System.out.println(add(5, 10, 15));         // 30
        System.out.println(add(5.5, 10.5));         // 16.0
    }
}
```

### Example 3: Recursion - Fibonacci

```java
public class Fibonacci {
    
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.print(fib(i) + " ");
        }
        // Output: 0 1 1 2 3 5 8 13
    }
}
```

### Example 4: Prime Number Checker

```java
public class PrimeChecker {
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(17));   // true
        System.out.println(isPrime(20));   // false
        System.out.println(isPrime(2));    // true
    }
}
```

---

## 🎯 Practice Exercises

1. Create method to check if number is palindrome
2. Create method to calculate GCD of two numbers
3. Create method to reverse a string
4. Create method to count vowels in a string
5. Create method to find sum of array elements

---

## ⚠️ Common Mistakes

```java
// ❌ Wrong: Missing return statement
public static int getValue() {
    int x = 10;
    // Missing return x;
}

// ✅ Correct
public static int getValue() {
    int x = 10;
    return x;
}

// ❌ Wrong: Returning wrong type
public static int getDouble(int x) {
    return "double";  // Error: String cannot be returned as int
}

// ✅ Correct
public static int getDouble(int x) {
    return x * 2;
}
```

---

## ✅ Checklist

- [ ] Create methods with different signatures
- [ ] Use method overloading
- [ ] Implement recursion
- [ ] Understand variable scope
- [ ] Solve 20+ exercises

---

**Next → Module 08: Arrays**
