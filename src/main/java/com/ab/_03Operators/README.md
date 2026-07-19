# Module 03: Operators - README

## 📚 Overview

Operators perform operations on variables and values. This module covers all operator types including arithmetic, relational, logical, bitwise, and assignment operators.

## 🎯 Learning Objectives

- ✅ Use all operator types
- ✅ Understand operator precedence
- ✅ Know operator associativity
- ✅ Write complex expressions
- ✅ Optimize using operators

---

## 📋 Topics Covered

### Operator Types

**Arithmetic Operators:** +, -, *, /, %
**Relational Operators:** ==, !=, >, <, >=, <=
**Logical Operators:** &&, ||, !
**Bitwise Operators:** &, |, ^, ~, <<, >>, >>>
**Assignment Operators:** =, +=, -=, *=, /=, %=
**Ternary Operator:** condition ? valueIfTrue : valueIfFalse
**Increment/Decrement:** ++, --

### Operator Precedence (High to Low)
1. Parentheses, Array, Dot
2. ++, --, +, -, !, ~
3. *, /, %
4. +, -
5. <<, >>, >>>
6. <, <=, >, >=
7. ==, !=
8. &
9. ^
10. |
11. &&
12. ||
13. Ternary (?:)
14. Assignment (=, +=, -=, etc.)

---

## 💻 Example Code

```java
// Arithmetic
int sum = 10 + 5;        // 15
int diff = 10 - 5;       // 5
int product = 10 * 5;    // 50
int quotient = 10 / 5;   // 2
int remainder = 10 % 3;  // 1

// Relational
boolean result1 = 10 > 5;    // true
boolean result2 = 10 == 5;   // false

// Logical
boolean and = (10 > 5) && (5 < 8);  // true
boolean or = (10 > 5) || (5 > 8);   // true

// Ternary
String status = (age >= 18) ? "Adult" : "Minor";

// Bitwise
int a = 5;      // 0101
int b = 3;      // 0011
int andResult = a & b;   // 0001 = 1
int orResult = a | b;    // 0111 = 7
```

---

## 📝 Practice Problems

### Beginner
1. Calculate simple interest
2. Check if number is divisible by 5 and 3
3. Find maximum of two numbers using ternary
4. Swap two numbers using arithmetic

### Intermediate
1. Check if year is leap year
2. Calculate BMI and classify
3. Determine eligibility for discount
4. Check if three sides form valid triangle

### Advanced
1. Count set bits in a number
2. Check if number is power of 2
3. Calculate bitwise operations
4. Solve complex expressions

---

## 📊 Operator Reference

| Operator | Type | Example | Result |
|----------|------|---------|--------|
| + | Arithmetic | 10 + 5 | 15 |
| - | Arithmetic | 10 - 5 | 5 |
| * | Arithmetic | 10 * 5 | 50 |
| / | Arithmetic | 10 / 5 | 2 |
| % | Arithmetic | 10 % 3 | 1 |
| == | Relational | 10 == 5 | false |
| > | Relational | 10 > 5 | true |
| && | Logical | true && false | false |
| \|\| | Logical | true \|\| false | true |
| & | Bitwise | 5 & 3 | 1 |
| \| | Bitwise | 5 \| 3 | 7 |
| ?: | Ternary | x > 0 ? "pos" : "neg" | Depends |

---

## ✅ Completion Checklist

- [ ] Master arithmetic operators
- [ ] Use relational operators correctly
- [ ] Combine logical operators
- [ ] Understand operator precedence
- [ ] Practice 20+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 02: Variables & Data Types](../_02VariableAndDataType/README.md)
- [Module 04: Conditional Statements](../_04ConditionalStatement/README.md)
- [Documentation](../../docs/MODULE_03_OPERATORS.md)

---

**Operators are the tools to manipulate data - master them!** 🛠️
