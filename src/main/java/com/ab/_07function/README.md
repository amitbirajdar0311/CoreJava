# Module 07: Functions/Methods - README

## 📚 Overview

Functions (Methods) allow you to write reusable code blocks. Learn to create, call, overload, and optimize methods.

## 🎯 Learning Objectives

- ✅ Declare and call methods
- ✅ Use parameters and return values
- ✅ Implement method overloading
- ✅ Use recursion
- ✅ Follow best practices

---

## 📋 Topics Covered

### Method Components
- **Method signature**: Name, parameters, return type
- **Method body**: Code to execute
- **Return statement**: Value to return
- **Parameters**: Input to method
- **Arguments**: Actual values passed

### Method Types
- **No parameters, no return**: `void method()`
- **With parameters, no return**: `void method(int a)`
- **No parameters, with return**: `int method()`
- **With parameters and return**: `int method(int a, int b)`

### Advanced Concepts
- **Method overloading**: Same name, different parameters
- **Recursion**: Method calling itself
- **Scope**: Variable scope within methods
- **Best practices**: Naming, documentation, efficiency

---

## 💻 Example Code

```java
// Method with no parameters and no return
public static void greet() {
    System.out.println("Hello!");
}

// Method with parameters
public static void printName(String name, int age) {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

// Method with return value
public static int add(int a, int b) {
    return a + b;
}

// Method overloading
public static int add(int a, int b) { return a + b; }
public static int add(int a, int b, int c) { return a + b + c; }
public static double add(double a, double b) { return a + b; }

// Recursion
public static int factorial(int n) {
    if (n == 0 || n == 1) return 1;
    return n * factorial(n - 1);
}

// Calling methods
greet();
printName("John", 25);
int sum = add(5, 10);
```

---

## 📝 Practice Problems

### Beginner
1. Create method to calculate average
2. Create method to check if number is even
3. Create method to print "Hello" N times
4. Create method to convert temperature

### Intermediate
1. Create method to check if number is prime
2. Create method to calculate GCD
3. Create method to reverse a string
4. Create method to count vowels

### Advanced
1. Create method for binary search
2. Create method for sorting
3. Create method for permutations
4. Create method for combinations

---

## 📊 Method Overloading Rules

```java
// ✅ Valid Overloading
public static void method(int a) { }
public static void method(double a) { }        // Different type
public static void method(int a, int b) { }    // Different number
public static void method(int a, double b) { } // Different order

// ❌ Invalid Overloading
public static void method(int a) { }
public static int method(int a) { }            // Only return type differs
```

---

## ✅ Completion Checklist

- [ ] Create methods with different signatures
- [ ] Implement method overloading
- [ ] Use recursion correctly
- [ ] Understand variable scope
- [ ] Practice 30+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 06: Pattern Printing](../_06Pattern/README.md)
- [Module 08: Arrays](../_08array/README.md)
- [Documentation](../../docs/MODULE_07_FUNCTIONS.md)

---

**Methods make code reusable and organized - master them!** 📦
