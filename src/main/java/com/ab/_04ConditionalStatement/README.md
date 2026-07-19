# Module 04: Conditional Statements 🔀

## Overview
Conditional statements allow your program to make decisions based on conditions. They control the flow of execution by choosing different code paths.

## Learning Objectives
- Master if-else statements
- Learn switch-case constructs
- Understand ternary operator usage
- Compare different conditional approaches
- Practice complex conditional logic

## Files & Concepts

### 1. SwitchCase.java
**Purpose:** Comprehensive guide to conditional statements including if-else and switch-case

**Key Concepts:**
- If statement
- If-else statement
- If-else if-else ladder
- Switch statement
- Switch with fall-through
- Ternary operator
- Nested conditionals

## Conditional Statements

### 1️⃣ If Statement
Execute code only if condition is true.

```java
if (condition) {
    // Code executes if condition is true
}

// Example
if (age >= 18) {
    System.out.println("You are an adult");
}
```

### 2️⃣ If-Else Statement
Execute one block if true, another if false.

```java
if (condition) {
    // Code if true
} else {
    // Code if false
}

// Example
if (score >= 80) {
    System.out.println("Grade: A");
} else {
    System.out.println("Grade: B or below");
}
```

### 3️⃣ If-Else If-Else Ladder
Multiple conditions in sequence.

```java
if (condition1) {
    // Code if condition1 is true
} else if (condition2) {
    // Code if condition2 is true
} else if (condition3) {
    // Code if condition3 is true
} else {
    // Code if all conditions are false
}

// Example
if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

### 4️⃣ Switch Statement
Execute one of many code blocks.

```java
switch (expression) {
    case value1:
        // Code if expression == value1
        break;
    case value2:
        // Code if expression == value2
        break;
    default:
        // Code if no case matches
}

// Example
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

#### Break Statement
- Exits the switch immediately
- Without `break`, execution continues to next case (fall-through)

```java
// WITHOUT break - Fall-through
switch (day) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        System.out.println("Weekday");
        break;
    case 6:
    case 7:
        System.out.println("Weekend");
        break;
}
```

### 5️⃣ Ternary Operator
Shorthand if-else for single values.

```java
condition ? valueIfTrue : valueIfFalse

// Example
int age = 20;
String status = (age >= 18) ? "Adult" : "Minor";

// Nested ternary
String grade = (score >= 90) ? "A" : 
               (score >= 80) ? "B" : 
               (score >= 70) ? "C" : "F";
```

## Switch vs If-Else

| Feature | If-Else | Switch |
|---------|---------|--------|
| **Conditions** | Any boolean condition | Equality check only |
| **Readability** | Complex conditions | Multiple fixed values |
| **Performance** | Slower for many conditions | Faster with many values |
| **Flexibility** | Very flexible | Limited to equality |
| **Nesting** | Easier | More complex |

## Flowchart of Conditional Statements

```
If-Else Flowchart:
    Start
      ↓
   Condition?
    ╱    ╲
  Yes    No
   ↓      ↓
 Block1 Block2
   ╲    ╱
     ↓
    End

Switch Flowchart:
    Start
      ↓
   Expression
      ↓
   Case 1? ──→ Execute ↘
   Case 2? ──→ Execute ↘
   Case 3? ──→ Execute ↘
   Default? ──→ Execute ↘
                       ↓
                      End
```

## Comparison of Approaches

### Approach 1: If-Else
```java
int month = 3;
if (month == 1) System.out.println("January");
else if (month == 2) System.out.println("February");
else if (month == 3) System.out.println("March");
else if (month == 4) System.out.println("April");
// ... continues
```

### Approach 2: Switch
```java
int month = 3;
switch (month) {
    case 1: System.out.println("January"); break;
    case 2: System.out.println("February"); break;
    case 3: System.out.println("March"); break;
    case 4: System.out.println("April"); break;
    // ... continues
}
```

### Approach 3: Ternary
```java
String result = (month == 1) ? "January" : 
                (month == 2) ? "February" : 
                (month == 3) ? "March" : "Other";
```

## Nested Conditionals

```java
if (age >= 18) {
    if (score >= 80) {
        System.out.println("Eligible for scholarship");
    } else {
        System.out.println("Not eligible - low score");
    }
} else {
    System.out.println("Too young");
}
```

## Complex Conditions

### Using Logical Operators
```java
if (age >= 18 && score >= 80) {
    System.out.println("Eligible for admission");
}

if (status == "active" || role == "admin") {
    System.out.println("Access granted");
}

if (!(age < 18)) {
    System.out.println("Adult");
}
```

## Java 14+ Switch Expression

```java
// Traditional Switch
String day;
switch (dayNumber) {
    case 1: day = "Monday"; break;
    case 2: day = "Tuesday"; break;
    default: day = "Unknown";
}

// Switch Expression (Java 14+)
String day = switch (dayNumber) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Unknown";
};

// Multiple statements with yield
String message = switch (dayNumber) {
    case 1, 2, 3, 4, 5 -> {
        yield "Weekday";
    }
    case 6, 7 -> {
        yield "Weekend";
    }
    default -> "Unknown";
};
```

## How to Run

```bash
cd src/main/java/com/ab/_04ConditionalStatement/
javac SwitchCase.java
java SwitchCase
```

## Practice Exercises

### 1. Traffic Light System
```java
char light = 'G'; // R, Y, G
// Assign actions based on light
```

### 2. Calculator
```java
int a = 10, b = 5;
char operator = '+';
// Perform calculation based on operator
```

### 3. Grade System
```java
int marks = 85;
// Output grade (A, B, C, D, F)
// Also check if it's pass/fail
// Check if eligible for distinction
```

### 4. Season Determiner
```java
int month = 6;
// Output season (Winter, Spring, Summer, Fall)
```

### 5. Number Classifier
```java
int num = 42;
// Check if positive/negative/zero
// Check if even/odd
// Check if prime/composite
```

## Decision Making Process

```
Problem Analysis
        ↓
Identify Conditions
        ↓
Choose Control Structure
   ├─→ If-Else (range/complex)
   ├─→ Switch (fixed values)
   └─→ Ternary (simple assignment)
        ↓
Implement & Test
        ↓
Verify All Cases
```

## Common Patterns

### Validation Check
```java
if (age < 0 || age > 150) {
    System.out.println("Invalid age");
} else {
    System.out.println("Age is valid");
}
```

### Range Check
```java
if (score >= 90 && score <= 100) {
    grade = 'A';
} else if (score >= 80 && score < 90) {
    grade = 'B';
}
```

### Eligibility Check
```java
if (age >= 18 && income > 100000 && creditScore >= 650) {
    System.out.println("Loan approved");
}
```

## Key Takeaways

- 🎯 Use if-else for complex conditions
- 🔀 Use switch for multiple fixed values
- ⚡ Use ternary for simple decisions
- 🔗 Combine operators for complex logic
- 🧪 Test all possible paths

## Common Mistakes

| Mistake | Error | Solution |
|---------|-------|----------|
| Missing `break;` | Fall-through in switch | Always add break (or use intention) |
| `=` instead of `==` | Assignment vs comparison | Use `==` for comparison |
| Not handling edge cases | Logic errors | Test boundary values |
| Complex nested if | Hard to read | Refactor into methods |

## Debugging Tips

```java
// Use print statements
if (condition) {
    System.out.println("Condition is TRUE");
} else {
    System.out.println("Condition is FALSE");
}

// Use debugger breakpoints
// Check variable values at each condition
```

## Related Topics

- **Previous:** Module 03 - Operators
- **Next:** Module 05 - Loops & Flow Control
- **Later:** Exception Handling

## Additional Resources

- [If-Else Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
- [Switch Statement Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
- [Control Flow Guide](https://www.oracle.com/java/technologies/java-tutorial-control-flow.html)

---

**Next Step:** Proceed to Module 05 - Loops & Flow Control 👉
