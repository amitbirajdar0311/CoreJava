# 📖 Module 10: Object-Oriented Programming (OOPS)

## 🎯 Overview

OOPS is the core of Java programming. Learn classes, objects, inheritance, polymorphism, and encapsulation.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Create classes and objects
- ✅ Understand encapsulation
- ✅ Implement inheritance
- ✅ Use polymorphism
- ✅ Apply abstraction

---

## 📋 Course Content

### 1. Classes and Objects

```java
// Class definition
public class Student {
    // Attributes (data members)
    String name;
    int age;
    double gpa;
    
    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

// Creating object
Student student1 = new Student();
student1.name = "John";
student1.age = 20;
student1.gpa = 3.8;
student1.displayInfo();
```

### 2. Constructors

```java
public class Student {
    String name;
    int age;
    
    // Default Constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }
    
    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Using constructors
Student s1 = new Student();                  // Default
Student s2 = new Student("John", 20);       // Parameterized
```

### 3. Access Modifiers

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

### 4. Encapsulation (Getters & Setters)

```java
public class BankAccount {
    private double balance;  // Private - not accessible directly
    
    // Getter
    public double getBalance() {
        return balance;
    }
    
    // Setter with validation
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }
}

// Using
BankAccount account = new BankAccount();
account.setBalance(5000);
System.out.println(account.getBalance());  // 5000
```

### 5. Inheritance

```java
// Parent class
public class Animal {
    String name;
    
    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
public class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Using
Dog dog = new Dog();
dog.name = "Buddy";
dog.eat();      // Inherited method
dog.bark();     // Own method
```

### 6. Polymorphism

#### Method Overriding
```java
public class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Using
Animal dog = new Dog();
Animal cat = new Cat();
dog.makeSound();  // Woof Woof
cat.makeSound();  // Meow
```

### 7. Abstract Classes

```java
public abstract class Shape {
    abstract double getArea();
    
    void display() {
        System.out.println("This is a shape");
    }
}

public class Circle extends Shape {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
}
```

### 8. Interfaces

```java
public interface Animal {
    void eat();
    void sleep();
}

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
```

---

## 💻 Code Examples

### Example 1: Complete Class

```java
public class Person {
    private String name;
    private int age;
    private double salary;
    
    // Constructor
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    
    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { if (age > 0) this.age = age; }
    public void setSalary(double salary) { if (salary > 0) this.salary = salary; }
    
    // Display
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
```

### Example 2: Inheritance

```java
public class Employee extends Person {
    private String employeeId;
    private String department;
    
    public Employee(String name, int age, double salary, 
                    String employeeId, String department) {
        super(name, age, salary);
        this.employeeId = employeeId;
        this.department = department;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}
```

---

## 🎯 OOPS Principles

1. **Encapsulation** - Hide internal details
2. **Inheritance** - Reuse code from parent
3. **Polymorphism** - Same method, different behavior
4. **Abstraction** - Hide complexity, show essentials

---

## ✅ Checklist

- [ ] Create classes and objects
- [ ] Use constructors
- [ ] Implement encapsulation
- [ ] Use inheritance
- [ ] Implement polymorphism
- [ ] Use interfaces and abstract classes
- [ ] Solve 15+ exercises

---

**Next → Module 11: Multithreading**
