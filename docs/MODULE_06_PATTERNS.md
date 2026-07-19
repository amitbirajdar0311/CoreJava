# 🎨 Module 06: Pattern Printing

## 🎯 Overview

Pattern printing combines loops and logic to create visual patterns. It's great for understanding nested loops and algorithm design.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Create star patterns
- ✅ Create number patterns
- ✅ Create character patterns
- ✅ Understand pattern logic
- ✅ Optimize pattern algorithms

---

## 📋 Course Content

### 1. Basic Star Patterns

#### Pattern 1: Square
```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

#### Pattern 2: Right Triangle
```
*
* *
* * *
* * * *
* * * * *
```

#### Pattern 3: Pyramid
```
    *
   * *
  * * *
 * * * *
* * * * *
```

### 2. Number Patterns

#### Pattern 1: Number Triangle
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

#### Pattern 2: Reverse Number Triangle
```
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
```

### 3. Complex Patterns

#### Pattern 1: Diamond
```
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
```

---

## 💻 Code Examples

### Example 1: Square Pattern

```java
public class SquarePattern {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output:
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
```

### Example 2: Pyramid Pattern

```java
public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output:
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
```

### Example 3: Number Triangle

```java
public class NumberTriangle {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Output:
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
```

### Example 4: Diamond Pattern

```java
public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

### Example 5: Hollow Rectangle

```java
public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 5, cols = 8;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// Output:
// * * * * * * * *
// *             *
// *             *
// *             *
// * * * * * * * *
```

---

## 🎯 Pattern Checklist

### Basic Patterns
- [ ] Square
- [ ] Rectangle
- [ ] Right triangle
- [ ] Inverted right triangle
- [ ] Isosceles triangle

### Intermediate Patterns
- [ ] Pyramid
- [ ] Reverse pyramid
- [ ] Number triangle
- [ ] Number pyramid
- [ ] Hollow square

### Advanced Patterns
- [ ] Diamond
- [ ] Hollow diamond
- [ ] Pascal's triangle
- [ ] Butterfly pattern
- [ ] Character patterns

---

## 🏆 Practice Exercises

1. Create a butterfly pattern
2. Create Pascal's triangle
3. Create a spiral pattern
4. Create an hourglass pattern
5. Create a cross pattern

---

## ✅ Checklist

- [ ] Understand nested loop logic
- [ ] Create 10+ different patterns
- [ ] Optimize pattern code
- [ ] Solve 15+ exercises

---

**Next → Module 07: Functions/Methods**
