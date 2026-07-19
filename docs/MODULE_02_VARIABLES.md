# 📖 Module 02: Variables & Data Types

## 🎯 Overview

Variables are the foundation of programming. Learn how to declare, initialize, and use variables effectively in Java.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Understand variables and memory
- ✅ Learn all primitive data types
- ✅ Declare and initialize variables
- ✅ Understand type casting
- ✅ Work with constants

---

## 📋 Course Content

### 1. What is a Variable?

A **variable** is a named location in memory that stores a value.

```java
int age = 25;      // Variable declaration and initialization
final int MAX = 100;  // Constant
```

### 2. Primitive Data Types

#### Numeric Types:

| Type | Size | Range | Example |
|------|------|-------|----------|
| **byte** | 1 byte | -128 to 127 | `byte b = 10;` |
| **short** | 2 bytes | -32,768 to 32,767 | `short s = 1000;` |
| **int** | 4 bytes | -2^31 to 2^31-1 | `int i = 50000;` |
| **long** | 8 bytes | -2^63 to 2^63-1 | `long l = 9999999999L;` |
| **float** | 4 bytes | Single precision | `float f = 3.14f;` |
| **double** | 8 bytes | Double precision | `double d = 3.14159;` |

#### Other Types:

| Type | Size | Values | Example |
|------|------|--------|----------|
| **char** | 2 bytes | Single character | `char c = 'A';` |
| **boolean** | 1 byte | true/false | `boolean flag = true;` |

### 3. Variable Declaration & Initialization

```java
// Declaration (memory reserved, value undefined)
int age;

// Initialization (value assigned)
age = 25;

// Declaration + Initialization
int height = 180;

// Multiple variables
int a = 10, b = 20, c = 30;
```

### 4. Naming Conventions

```java
// ✅ Valid and good
int studentAge;        // camelCase
int STUDENT_AGE;       // Constants
int _privateVar;       // Private convention

// ❌ Invalid
int 123abc;            // Cannot start with number
int student-age;       // Cannot use hyphen
int class;             // Reserved keyword
```

### 5. Type Casting

**Widening (Automatic):**
```java
int num = 10;
long bigNum = num;          // int → long (automatic)
double decimal = bigNum;    // long → double (automatic)
```

**Narrowing (Manual):**
```java
double pi = 3.14159;
int truncated = (int) pi;   // double → int (requires cast)
float f = (float) pi;       // double → float (requires cast)
```

### 6. Constants

```java
// Using final keyword
final double PI = 3.14159;
final int MAX_STUDENTS = 100;

// ❌ Error - cannot reassign constant
PI = 3.14;  // Compilation error
```

---

## 💻 Code Examples

### Example 1: Basic Variable Usage

```java
public class VariableDemo {
    public static void main(String[] args) {
        // Primitive types
        int age = 25;
        double height = 5.9;
        char gender = 'M';
        boolean isStudent = true;
        
        // Display
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student: " + isStudent);
    }
}
```

### Example 2: Type Casting

```java
public class TypeCastingDemo {
    public static void main(String[] args) {
        // Automatic widening
        int num = 100;
        long longNum = num;
        
        // Manual narrowing
        double decimal = 99.99;
        int truncated = (int) decimal;
        
        System.out.println("Original: " + decimal);
        System.out.println("Truncated: " + truncated);
    }
}
```

### Example 3: Constants

```java
public class ConstantDemo {
    // Class constants
    static final double PI = 3.14159;
    static final int MAX_ATTEMPTS = 3;
    
    public static void main(String[] args) {
        // Local constants
        final String COMPANY = "TechCorp";
        final double SALARY = 50000.00;
        
        System.out.println("Company: " + COMPANY);
        System.out.println("Salary: " + SALARY);
    }
}
```

---

## 🎯 Practice Exercises

### Basic Exercises
1. Declare variables of all primitive types
2. Write program to swap two numbers
3. Calculate area of circle using PI constant
4. Convert temperature from Celsius to Fahrenheit

### Intermediate Exercises
1. Calculate compound interest
2. Convert distance from kilometers to miles
3. Find age from birth year
4. Calculate average of three numbers

---

## ⚠️ Common Mistakes

```java
// ❌ Wrong: Type mismatch
int num = 3.14;  // Error: double cannot be assigned to int

// ✅ Correct
int num = (int) 3.14;  // Manual casting

// ❌ Wrong: Overflow
byte b = 300;  // Error: 300 exceeds byte range

// ✅ Correct
short s = 300;  // Use appropriate type

// ❌ Wrong: Using before initialization
int x;
System.out.println(x);  // Error: x not initialized

// ✅ Correct
int x = 0;
System.out.println(x);
```

---

## ✅ Checklist

- [ ] Understand all primitive data types
- [ ] Declare variables with proper naming
- [ ] Know variable scope rules
- [ ] Practice type casting
- [ ] Use constants correctly
- [ ] Solve 10+ exercises

---

**Next → Module 03: Operators**
