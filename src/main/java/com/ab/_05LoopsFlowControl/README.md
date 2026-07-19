# Module 05: Loops & Flow Control - README

## 📚 Overview

Loops allow you to execute code repeatedly. Learn for, while, do-while loops, break, continue, and nested loops.

## 🎯 Learning Objectives

- ✅ Use for loops effectively
- ✅ Use while and do-while loops
- ✅ Use for-each loops
- ✅ Use break and continue statements
- ✅ Handle nested loops

---

## 📋 Topics Covered

### Loop Types
- **for loop**: Iterate fixed number of times
- **while loop**: Iterate while condition is true
- **do-while loop**: Execute at least once
- **for-each loop**: Iterate over arrays/collections
- **Nested loops**: Loops within loops

### Flow Control
- **break**: Exit loop immediately
- **continue**: Skip current iteration

---

## 💻 Example Code

```java
// for loop
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

// while loop
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}

// do-while loop
int j = 1;
do {
    System.out.println(j);
    j++;
} while (j <= 10);

// for-each loop
int[] arr = {1, 2, 3, 4, 5};
for (int num : arr) {
    System.out.println(num);
}

// Nested loops
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("*");
    }
    System.out.println();
}

// break statement
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;  // Exit loop
    }
    System.out.println(i);
}

// continue statement
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue;  // Skip iteration
    }
    System.out.println(i);
}
```

---

## 📝 Practice Problems

### Beginner
1. Print numbers from 1 to 100
2. Print multiplication table
3. Find sum of first N numbers
4. Count digits in a number

### Intermediate
1. Calculate factorial
2. Check if number is palindrome
3. Find GCD of two numbers
4. Print fibonacci series

### Advanced
1. Print star pyramid pattern
2. Print diamond pattern
3. Generate prime numbers
4. Reverse a number

---

## 📊 Loop Comparison

| Loop | Best For | Example |
|------|----------|----------|
| for | Fixed iterations | `for (int i=0; i<10; i++)` |
| while | Unknown iterations | `while (condition)` |
| do-while | At least once | `do { } while (condition)` |
| for-each | Arrays/Collections | `for (int x : array)` |

---

## ✅ Completion Checklist

- [ ] Master all loop types
- [ ] Use break and continue correctly
- [ ] Create nested loops
- [ ] Solve 30+ exercises
- [ ] Understand loop optimization

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 04: Conditional Statements](../_04ConditionalStatement/README.md)
- [Module 06: Pattern Printing](../_06Pattern/README.md)
- [Documentation](../../docs/MODULE_05_LOOPS.md)

---

**Loops make repetitive tasks easy - master them to write efficient code!** ⚙️
