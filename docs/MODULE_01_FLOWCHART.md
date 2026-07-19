# 📖 Module 01: Flow Chart & Pseudocode

## 🎯 Overview

Understanding **problem-solving** is crucial before writing code. This module teaches you how to break down problems using flowcharts and pseudocode.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Understand flowchart symbols and their meanings
- ✅ Create flowcharts for simple problems
- ✅ Write pseudocode effectively
- ✅ Convert flowcharts to pseudocode
- ✅ Solve problems systematically

---

## 📋 Course Content

### 1. What is a Flowchart?

A **flowchart** is a visual representation of an algorithm or process using standardized symbols.

### 2. Flowchart Symbols

| Symbol | Name | Purpose |
|--------|------|----------|
| ⭕ | Oval/Terminal | Start/End of program |
| ▭ | Rectangle | Process/Calculation |
| ◇ | Diamond | Decision (if/else) |
| → | Arrow | Flow of control |
| ▢ | Parallelogram | Input/Output |
| ⬠ | Hexagon | Loop preparation |

### 3. Pseudocode Basics

**Pseudocode** is informal, human-readable code that outlines algorithm logic.

```
Pseuedocode Example:

START
  READ num1, num2
  sum = num1 + num2
  PRINT sum
END
```

### 4. Problem Solving Steps

1. **Understand the Problem** - Read carefully
2. **Plan Solution** - Use flowchart/pseudocode
3. **Write Code** - Implement the plan
4. **Test** - Verify with examples
5. **Optimize** - Improve efficiency

---

## 💻 Examples

### Example 1: Find Maximum of Two Numbers

**Flowchart:**
```
START
  ↓
INPUT: a, b
  ↓
a > b?
  ├─ YES → PRINT: a
  └─ NO → PRINT: b
  ↓
END
```

**Pseudocode:**
```
START
  READ a, b
  IF a > b THEN
    PRINT a
  ELSE
    PRINT b
  END IF
END
```

### Example 2: Sum of First N Numbers

**Flowchart:**
```
START
  ↓
INPUT: n
  ↓
sum = 0, i = 1
  ↓
i <= n?
  ├─ NO → PRINT sum → END
  └─ YES → sum = sum + i
          i = i + 1
          ↑_____|
```

**Pseudocode:**
```
START
  READ n
  sum = 0
  i = 1
  WHILE i <= n DO
    sum = sum + i
    i = i + 1
  END WHILE
  PRINT sum
END
```

---

## 🎯 Practice Exercises

### Basic Exercises
1. Create flowchart to check if number is even or odd
2. Create pseudocode to find smallest of three numbers
3. Create flowchart to calculate factorial
4. Create pseudocode to print multiplication table

### Advanced Exercises
1. Flowchart for bubble sort
2. Pseudocode for binary search
3. Flowchart for fibonacci series
4. Pseudocode for pattern printing

---

## ✅ Checklist

- [ ] Understand all flowchart symbols
- [ ] Create 5 flowcharts for different problems
- [ ] Write 5 pseudocodes
- [ ] Convert flowcharts to pseudocode
- [ ] Solve real-world problem with flowchart

---

**Next → Module 02: Variables & Data Types**
