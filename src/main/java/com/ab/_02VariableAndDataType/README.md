# Module 02: Variables & Data Types - README

## 📚 Overview

Variables are the foundation of programming. This module covers variable declaration, all primitive data types, type casting, and constants in Java.

## 🎯 Learning Objectives

- ✅ Declare and initialize variables
- ✅ Understand all primitive data types
- ✅ Perform type casting (widening and narrowing)
- ✅ Use naming conventions
- ✅ Work with constants

---

## 📋 Topics Covered

### Primitive Data Types

**Numeric Types:**
- `byte` (1 byte, -128 to 127)
- `short` (2 bytes, -32,768 to 32,767)
- `int` (4 bytes, default integer type)
- `long` (8 bytes, use L suffix)
- `float` (4 bytes, single precision, use f suffix)
- `double` (8 bytes, default decimal type)

**Other Types:**
- `char` (2 bytes, single character)
- `boolean` (true/false)

### Variable Scope
- Local variables (within methods)
- Instance variables (within class)
- Class variables (static)

### Type Casting
- Automatic widening (int → long → double)
- Manual narrowing (double → int)

---

## 💻 Example Code

```java
// Variable declaration and initialization
int age = 25;
float height = 5.9f;
char gender = 'M';
boolean isStudent = true;

// Constants
final double PI = 3.14159;
final int MAX_AGE = 100;

// Type casting
int num = 100;
long bigNum = num;  // Widening

double decimal = 99.99;
int truncated = (int) decimal;  // Narrowing
```

---

## 📝 Practice Problems

### Beginner
1. Declare variables of all primitive types
2. Write program to swap two numbers
3. Calculate area of rectangle
4. Convert temperature from Celsius to Fahrenheit

### Intermediate
1. Calculate compound interest
2. Convert distance from kilometers to miles
3. Calculate percentage marks
4. Find average of three numbers

### Advanced
1. Calculate BMI (Body Mass Index)
2. Convert currency between different types
3. Calculate distance using distance formula
4. Calculate GPA from marks

---

## 📊 Data Type Reference Table

| Type | Size | Default | Min | Max |
|------|------|---------|-----|-----|
| byte | 1 | 0 | -128 | 127 |
| short | 2 | 0 | -32,768 | 32,767 |
| int | 4 | 0 | -2^31 | 2^31-1 |
| long | 8 | 0L | -2^63 | 2^63-1 |
| float | 4 | 0.0f | ±3.4E-45 | ±3.4E+38 |
| double | 8 | 0.0d | ±4.9E-324 | ±1.8E+308 |
| char | 2 | \u0000 | 0 | 65,535 |
| boolean | 1 | false | - | - |

---

## ✅ Completion Checklist

- [ ] Declare variables of all data types
- [ ] Understand type casting
- [ ] Use naming conventions correctly
- [ ] Work with constants
- [ ] Practice 15+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 01: Flow Chart & Pseudocode](../_01FlowChartAndPseudocode/README.md)
- [Module 03: Operators](../_03Operators/README.md)
- [Documentation](../../docs/MODULE_02_VARIABLES.md)

---

**Master variables and data types - they're the building blocks of Java!** 🏗️
