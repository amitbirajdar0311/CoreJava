# 📖 Module 03: Operators

## 🎯 Overview

Operators perform operations on variables and values. Master all operator types to write efficient Java code.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Understand all operator types
- ✅ Master operator precedence
- ✅ Use operators in expressions
- ✅ Understand operator associativity

---

## 📋 Course Content

### 1. Arithmetic Operators

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `+` | Addition | `10 + 5` | 15 |
| `-` | Subtraction | `10 - 5` | 5 |
| `*` | Multiplication | `10 * 5` | 50 |
| `/` | Division | `10 / 5` | 2 |
| `%` | Modulus | `10 % 3` | 1 |
| `++` | Increment | `x++` or `++x` | x + 1 |
| `--` | Decrement | `x--` or `--x` | x - 1 |

```java
int a = 10, b = 3;
int add = a + b;       // 13
int subtract = a - b;  // 7
int multiply = a * b;  // 30
int divide = a / b;    // 3 (integer division)
int remainder = a % b; // 1

// Pre and Post increment
int x = 5;
System.out.println(++x);  // 6 (increment first)
System.out.println(x++);  // 6 (use first, then increment)
```

### 2. Relational Operators

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `==` | Equal to | `10 == 5` | false |
| `!=` | Not equal to | `10 != 5` | true |
| `>` | Greater than | `10 > 5` | true |
| `<` | Less than | `10 < 5` | false |
| `>=` | Greater or equal | `10 >= 10` | true |
| `<=` | Less or equal | `10 <= 5` | false |

```java
int a = 10, b = 5;
boolean result1 = a > b;    // true
boolean result2 = a == b;   // false
boolean result3 = a != b;   // true
boolean result4 = a <= b;   // false
```

### 3. Logical Operators

| Operator | Name | Example | Explanation |
|----------|------|---------|-------------|
| `&&` | AND | `a && b` | Both must be true |
| `\|\|` | OR | `a \|\| b` | At least one must be true |
| `!` | NOT | `!a` | Reverses boolean |

```java
int age = 25;
boolean valid = age > 18 && age < 60;  // true
boolean canVote = age >= 18 || age == 17;  // true
boolean isMinor = !(age >= 18);  // false
```

### 4. Bitwise Operators

| Operator | Name | Example |
|----------|------|----------|
| `&` | AND | `a & b` |
| `\|` | OR | `a \| b` |
| `^` | XOR | `a ^ b` |
| `~` | NOT | `~a` |
| `<<` | Left shift | `a << 2` |
| `>>` | Right shift | `a >> 2` |
| `>>>` | Unsigned right shift | `a >>> 2` |

```java
int a = 5;      // 0101
int b = 3;      // 0011

int and = a & b;    // 0001 = 1
int or = a | b;     // 0111 = 7
int xor = a ^ b;    // 0110 = 6
int not = ~a;       // 1010 (inverted)
```

### 5. Assignment Operators

| Operator | Example | Equivalent |
|----------|---------|------------|
| `=` | `a = 5` | Assign |
| `+=` | `a += 5` | `a = a + 5` |
| `-=` | `a -= 5` | `a = a - 5` |
| `*=` | `a *= 5` | `a = a * 5` |
| `/=` | `a /= 5` | `a = a / 5` |
| `%=` | `a %= 5` | `a = a % 5` |

```java
int x = 10;
x += 5;   // x = 15
x *= 2;   // x = 30
x /= 3;   // x = 10
x %= 3;   // x = 1
```

### 6. Ternary Operator

```java
// Syntax: condition ? valueIfTrue : valueIfFalse

int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
System.out.println(status);  // Adult

// Nested ternary
int marks = 75;
String grade = marks >= 90 ? "A" : 
               marks >= 80 ? "B" : 
               marks >= 70 ? "C" : "D";
```

### 7. Operator Precedence

| Precedence | Operator | Associativity |
|------------|----------|---------------|
| 1 | `()` `[]` `.` | Left to Right |
| 2 | `++` `--` `+` `-` `!` `~` | Right to Left |
| 3 | `*` `/` `%` | Left to Right |
| 4 | `+` `-` | Left to Right |
| 5 | `<<` `>>` `>>>` | Left to Right |
| 6 | `<` `<=` `>` `>=` | Left to Right |
| 7 | `==` `!=` | Left to Right |
| 8 | `&` | Left to Right |
| 9 | `^` | Left to Right |
| 10 | `\|` | Left to Right |
| 11 | `&&` | Left to Right |
| 12 | `\|\|` | Left to Right |
| 13 | `?:` | Right to Left |
| 14 | `=` `+=` `-=` etc. | Right to Left |

---

## 💻 Code Examples

### Example 1: All Operators

```java
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        
        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        
        // Logical
        System.out.println("a > b && a > 0: " + (a > b && a > 0));
        System.out.println("a > b || b > 20: " + (a > b || b > 20));
    }
}
```

---

## 🎯 Practice Exercises

1. Calculate simple interest using operators
2. Check if number is divisible by 5 and 3
3. Find maximum of two numbers using ternary operator
4. Swap two numbers without third variable
5. Check if number is positive, negative, or zero

---

## ✅ Checklist

- [ ] Understand all operator types
- [ ] Know operator precedence
- [ ] Practice with multiple operators
- [ ] Solve 10+ exercises

---

**Next → Module 04: Conditional Statements**
