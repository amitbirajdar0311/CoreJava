# Module 04: Conditional Statements - README

## 📚 Overview

Conditional statements allow your program to make decisions and execute different code based on conditions. Learn if-else, switch-case, and ternary operators.

## 🎯 Learning Objectives

- ✅ Use if-else statements
- ✅ Use switch-case statements
- ✅ Use ternary operator
- ✅ Handle nested conditionals
- ✅ Write efficient decision logic

---

## 📋 Topics Covered

### Conditional Types
- **if statement**: Execute code if condition is true
- **if-else statement**: Execute different code based on condition
- **if-else if-else statement**: Multiple conditions
- **switch-case statement**: Select from multiple cases
- **Ternary operator**: Short if-else syntax
- **Nested conditionals**: Conditions within conditions

---

## 💻 Example Code

```java
// if-else statement
int age = 20;
if (age >= 18) {
    System.out.println("You can vote");
} else {
    System.out.println("You cannot vote");
}

// if-else if-else
int score = 75;
if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}

// switch-case
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

// Ternary operator
String status = (age >= 18) ? "Adult" : "Minor";

// Nested conditionals
if (age >= 18) {
    if (age <= 65) {
        System.out.println("Working age");
    } else {
        System.out.println("Retired");
    }
} else {
    System.out.println("Minor");
}
```

---

## 📝 Practice Problems

### Beginner
1. Check if number is even or odd
2. Find maximum of two numbers
3. Check if person is eligible to vote
4. Determine sign of a number (positive, negative, zero)

### Intermediate
1. Grade calculator based on marks
2. Check if year is leap year
3. Determine triangle type (equilateral, isosceles, scalene)
4. Check if three sides form valid triangle

### Advanced
1. Calculate total cost with discount/tax
2. Determine employee bonus eligibility
3. Check if date is valid
4. Determine electricity bill with slabs

---

## 📊 Decision Logic Flow

```
if (condition1)
  ├─ TRUE → Execute block 1
  └─ FALSE → Check condition2
               if (condition2)
                 ├─ TRUE → Execute block 2
                 └─ FALSE → Check condition3
                            if (condition3)
                              ├─ TRUE → Execute block 3
                              └─ FALSE → Execute default block
```

---

## ✅ Completion Checklist

- [ ] Master if-else statements
- [ ] Use switch-case correctly
- [ ] Understand ternary operator
- [ ] Handle nested conditionals
- [ ] Practice 25+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 03: Operators](../_03Operators/README.md)
- [Module 05: Loops & Flow Control](../_05LoopsFlowControl/README.md)
- [Documentation](../../docs/MODULE_04_CONDITIONALS.md)

---

**Conditionals let you make smart decisions in your code!** 🤔
