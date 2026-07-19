# 📖 Module 04: Conditional Statements

## 🎯 Overview

Conditional statements allow your program to make decisions and execute different code based on conditions.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Use if-else statements
- ✅ Use switch-case statements
- ✅ Use ternary operator
- ✅ Handle nested conditionals
- ✅ Write efficient conditional logic

---

## 📋 Course Content

### 1. if Statement

```java
// Basic if
if (condition) {
    // Execute if condition is true
}

// Example
int age = 20;
if (age >= 18) {
    System.out.println("You can vote");
}
```

### 2. if-else Statement

```java
if (condition) {
    // Execute if true
} else {
    // Execute if false
}

// Example
int score = 75;
if (score >= 70) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### 3. if-else if-else Statement

```java
if (condition1) {
    // Execute if condition1 is true
} else if (condition2) {
    // Execute if condition2 is true
} else if (condition3) {
    // Execute if condition3 is true
} else {
    // Execute if all conditions are false
}

// Example: Grade calculator
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 80) {
    System.out.println("Grade: B");
} else if (marks >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

### 4. switch-case Statement

```java
switch (expression) {
    case value1:
        // Execute if expression equals value1
        break;
    case value2:
        // Execute if expression equals value2
        break;
    default:
        // Execute if no case matches
}

// Example: Day of week
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### 5. Ternary Operator

```java
// condition ? valueIfTrue : valueIfFalse

int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";
System.out.println(status);  // Adult
```

### 6. Nested Conditionals

```java
int age = 25;
int income = 50000;

if (age >= 21) {
    if (income >= 30000) {
        System.out.println("Eligible for loan");
    } else {
        System.out.println("Insufficient income");
    }
} else {
    System.out.println("Too young for loan");
}
```

---

## 💻 Code Examples

### Example 1: Check Even or Odd

```java
public class EvenOdd {
    public static void main(String[] args) {
        int num = 15;
        
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
```

### Example 2: Find Maximum of Three Numbers

```java
public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        
        if (a >= b && a >= c) {
            System.out.println("Maximum: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum: " + b);
        } else {
            System.out.println("Maximum: " + c);
        }
    }
}
```

### Example 3: Calculator using Switch

```java
public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char operator = '+';
        
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
```

---

## 🎯 Practice Exercises

1. Check if a number is positive, negative, or zero
2. Determine eligibility for driving license
3. Find leap year using conditionals
4. Create a simple menu-driven calculator
5. Check triangle validity based on sides

---

## ✅ Checklist

- [ ] Master if-else statements
- [ ] Understand switch-case
- [ ] Use ternary operator
- [ ] Handle nested conditionals
- [ ] Solve 15+ exercises

---

**Next → Module 05: Loops & Flow Control**
