# Module 10: Object-Oriented Programming (OOPS) - README

## 📚 Overview

OOPS is the core of Java programming. Learn classes, objects, inheritance, polymorphism, encapsulation, and abstraction.

## 🎯 Learning Objectives

- ✅ Create classes and objects
- ✅ Implement encapsulation
- ✅ Use inheritance effectively
- ✅ Implement polymorphism
- ✅ Apply abstraction

---

## 📋 Topics Covered

### OOPS Concepts
- **Classes and Objects**: Blueprints and instances
- **Encapsulation**: Hide internal details
- **Inheritance**: Reuse from parent class
- **Polymorphism**: Same method, different behavior
- **Abstraction**: Hide complexity

### Advanced Topics
- **Constructors**: Initialize objects
- **Getters and Setters**: Encapsulation
- **Method overriding**: Override parent methods
- **Interfaces**: Define contracts
- **Abstract classes**: Template classes

---

## 💻 Example Code

```java
// Class definition
public class Person {
    // Attributes
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    
    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { if (age > 0) this.age = age; }
    
    // Method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheritance
public class Employee extends Person {
    private String employeeId;
    
    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
    }
}

// Creating objects
Person person = new Person("John", 25);
Employee employee = new Employee("Jane", 30, "EMP001");
```

---

## 📝 Practice Problems

### Beginner
1. Create Student class with properties and methods
2. Create BankAccount class with deposit/withdraw
3. Create Circle class to calculate area and perimeter
4. Create Rectangle class

### Intermediate
1. Create inheritance hierarchy for vehicles
2. Create Shape hierarchy with polymorphism
3. Create interface for payment methods
4. Create abstract class for animals

### Advanced
1. Create complex inheritance hierarchy
2. Implement multiple interfaces
3. Create factory pattern
4. Create singleton pattern

---

## 📊 Access Modifiers

| Modifier | Class | Package | Subclass | World |
|----------|-------|---------|----------|-------|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

---

## ✅ Completion Checklist

- [ ] Create classes and objects
- [ ] Use constructors
- [ ] Implement encapsulation
- [ ] Use inheritance
- [ ] Implement polymorphism
- [ ] Use interfaces and abstract classes
- [ ] Practice 25+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 09: Strings](../_09String/README.md)
- [Module 11: Multithreading](../_11Multithreading/README.md)
- [Documentation](../../docs/MODULE_10_OOPS.md)

---

**OOPS is fundamental to Java - master these concepts!** 🏛️
