# 📖 Module 11: Multithreading

## 🎯 Overview

Multithreading allows concurrent execution of multiple threads. Learn thread creation, synchronization, and thread communication.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Create threads
- ✅ Understand thread lifecycle
- ✅ Use synchronization
- ✅ Implement thread communication
- ✅ Handle thread issues

---

## 📋 Course Content

### 1. Thread Creation - Method 1: Extend Thread

```java
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);  // Sleep 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();  // Start thread
        t2.start();
    }
}
```

### 2. Thread Creation - Method 2: Implement Runnable

```java
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
```

### 3. Thread Methods

| Method | Purpose |
|--------|----------|
| `start()` | Begin thread execution |
| `run()` | Code to execute in thread |
| `sleep(ms)` | Pause thread for ms milliseconds |
| `join()` | Wait for thread to complete |
| `getName()` | Get thread name |
| `setName()` | Set thread name |
| `getPriority()` | Get thread priority |
| `setPriority()` | Set thread priority (1-10) |
| `interrupt()` | Interrupt the thread |
| `isAlive()` | Check if thread is running |

### 4. Thread Synchronization

#### Synchronized Method
```java
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

#### Synchronized Block
```java
public void method() {
    synchronized (this) {
        // Critical section
        count++;
    }
}
```

### 5. Producer-Consumer Problem

```java
public class ProducerConsumer {
    static class Resource {
        int value = 0;
        boolean available = false;
        
        synchronized void produce(int val) {
            while (available) {
                try { wait(); } catch (Exception e) {}
            }
            value = val;
            available = true;
            System.out.println("Produced: " + value);
            notify();
        }
        
        synchronized int consume() {
            while (!available) {
                try { wait(); } catch (Exception e) {}
            }
            available = false;
            System.out.println("Consumed: " + value);
            notify();
            return value;
        }
    }
}
```

### 6. Thread Lifecycle

```
NEW → RUNNABLE → RUNNING → BLOCKED/WAITING → TERMINATED
```

- **NEW**: Thread created but not started
- **RUNNABLE**: Thread ready to run
- **RUNNING**: Thread currently executing
- **BLOCKED**: Thread waiting for resource
- **TERMINATED**: Thread finished

---

## 💻 Code Examples

### Example 1: Simple Threads

```java
public class ThreadExample {
    static class Worker implements Runnable {
        String name;
        
        public Worker(String name) {
            this.name = name;
        }
        
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(name + " - " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker("Thread1"));
        Thread t2 = new Thread(new Worker("Thread2"));
        
        t1.start();
        t2.start();
    }
}
```

### Example 2: Thread Join

```java
public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try { Thread.sleep(2000); } catch (Exception e) {}
            System.out.println("Thread 1 finished");
        });
        
        t1.start();
        t1.join();  // Main waits for t1
        System.out.println("All threads finished");
    }
}
```

---

## ✅ Checklist

- [ ] Create threads using two methods
- [ ] Use thread methods
- [ ] Implement synchronization
- [ ] Solve producer-consumer problem
- [ ] Handle thread exceptions
- [ ] Solve 10+ exercises

---

**Next → Module 12: Collections**
