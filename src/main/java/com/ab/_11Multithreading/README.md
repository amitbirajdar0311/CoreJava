# Module 11: Multithreading - README

## 📚 Overview

Multithreading allows concurrent execution of multiple threads. Learn thread creation, lifecycle, synchronization, and thread communication.

## 🎯 Learning Objectives

- ✅ Create threads
- ✅ Understand thread lifecycle
- ✅ Implement synchronization
- ✅ Handle thread communication
- ✅ Solve concurrency problems

---

## 📋 Topics Covered

### Thread Creation
- **Extend Thread class**: Inherit from Thread
- **Implement Runnable**: Implement Runnable interface
- **Thread methods**: start(), run(), sleep(), join()
- **Thread lifecycle**: NEW, RUNNABLE, RUNNING, BLOCKED, TERMINATED

### Synchronization
- **Synchronized methods**: Thread-safe methods
- **Synchronized blocks**: Critical sections
- **wait() and notify()**: Thread communication

### Advanced Topics
- **Thread priorities**: Set thread execution order
- **Daemon threads**: Background threads
- **Thread pools**: Executor service

---

## 💻 Example Code

```java
// Method 1: Extend Thread
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}

// Method 2: Implement Runnable
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}

// Synchronization
public class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public synchronized int getCount() {
        return count;
    }
}
```

---

## 📝 Practice Problems

### Beginner
1. Create two threads that print numbers
2. Use thread sleep to create delays
3. Set thread names and priorities
4. Use thread join

### Intermediate
1. Create thread-safe counter
2. Implement producer-consumer
3. Create synchronized bank account
4. Use wait() and notify()

### Advanced
1. Implement thread pool
2. Create deadlock scenario
3. Implement thread communication
4. Create custom thread executor

---

## 📊 Thread Lifecycle

```
NEW
  ↓
RUNNABLE ← ─ ─ ─ ┐
  ↓              │
RUNNING          │
  ├→ BLOCKED ─ ─ ┘
  ├→ WAITING
  └→ TIMED_WAITING
     ↓
TERMINATED
```

---

## ✅ Completion Checklist

- [ ] Create threads using both methods
- [ ] Use thread methods
- [ ] Implement synchronization
- [ ] Handle thread communication
- [ ] Solve producer-consumer
- [ ] Practice 20+ exercises

---

## 🔗 Related Resources

- [Main README](../../README.md)
- [Module 10: OOPS](../_10OOPS/README.md)
- [Module 12: Collections](../_12Collection/README.md)
- [Documentation](../../docs/MODULE_11_MULTITHREADING.md)

---

**Multithreading enables powerful concurrent applications!** 🔄
