# 📖 Module 12: Collections

## 🎯 Overview

Collections provide dynamic data structures for storing groups of objects. Learn List, Set, Map, and their implementations.

## 📚 Learning Objectives

By the end of this module, you will:

- ✅ Use List interface and implementations
- ✅ Use Set interface and implementations
- ✅ Use Map interface and implementations
- ✅ Iterate over collections
- ✅ Use Collections utility class

---

## 📋 Course Content

### 1. List Interface

#### ArrayList
```java
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        // Get element
        System.out.println(list.get(0));  // Apple
        
        // Size
        System.out.println(list.size());  // 3
        
        // Remove
        list.remove(1);  // Remove Banana
        
        // Iterate
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

#### LinkedList
```java
List<Integer> list = new LinkedList<>();
list.add(10);
list.add(20);
list.add(30);

// LinkedList specific methods
if (list instanceof LinkedList) {
    LinkedList<Integer> ll = (LinkedList<Integer>) list;
    ll.addFirst(5);       // Add at beginning
    ll.addLast(40);       // Add at end
    ll.removeFirst();     // Remove from beginning
    ll.removeLast();      // Remove from end
}
```

### 2. Set Interface

#### HashSet
```java
Set<String> set = new HashSet<>();
set.add("Java");
set.add("Python");
set.add("Java");  // Duplicate - ignored
set.add("C++");

System.out.println(set.size());  // 3 (duplicates removed)

// Iterate
for (String lang : set) {
    System.out.println(lang);
}
```

#### TreeSet
```java
Set<Integer> set = new TreeSet<>();
set.add(50);
set.add(30);
set.add(20);
set.add(40);

// TreeSet maintains sorted order
for (int num : set) {
    System.out.println(num);  // 20, 30, 40, 50
}
```

### 3. Map Interface

#### HashMap
```java
Map<String, Integer> map = new HashMap<>();

// Put (add)
map.put("John", 25);
map.put("Jane", 30);
map.put("Bob", 28);

// Get
System.out.println(map.get("John"));  // 25

// Check if key exists
if (map.containsKey("Jane")) {
    System.out.println("Jane found");
}

// Iterate
for (String key : map.keySet()) {
    System.out.println(key + ": " + map.get(key));
}
```

#### TreeMap
```java
Map<String, Integer> map = new TreeMap<>();
map.put("Charlie", 30);
map.put("Alice", 25);
map.put("Bob", 28);

// TreeMap maintains sorted order by key
for (String key : map.keySet()) {
    System.out.println(key + ": " + map.get(key));
    // Alice, Bob, Charlie (alphabetical)
}
```

### 4. Iterator

```java
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

// Using Iterator
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

// Using for-each
for (String item : list) {
    System.out.println(item);
}
```

### 5. Collections Utility

```java
List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

// Sort
Collections.sort(list);
// Result: [1, 2, 5, 8, 9]

// Reverse
Collections.reverse(list);

// Find max and min
int max = Collections.max(list);    // 9
int min = Collections.min(list);    // 1

// Shuffle
Collections.shuffle(list);

// Binary search
int index = Collections.binarySearch(list, 5);
```

---

## 💻 Code Examples

### Example 1: List Operations

```java
public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana");
        
        System.out.println("List: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Banana: " + fruits.contains("Banana"));
        
        // Remove all occurrences
        fruits.removeAll(Collections.singleton("Banana"));
        System.out.println("After removal: " + fruits);
    }
}
```

### Example 2: Set Operations

```java
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        
        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);  // [1,2,3,4,5,6]
        
        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);  // [3,4]
        
        // Difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);  // [1,2]
    }
}
```

### Example 3: Map Operations

```java
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("John", 85);
        marks.put("Jane", 92);
        marks.put("Bob", 78);
        
        // Update
        marks.put("John", 88);
        
        // Get with default
        marks.putIfAbsent("Alice", 95);
        
        // Iterate with entries (efficient)
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

---

## 📊 Collections Comparison

| Collection | Ordered | Unique | Key-Value | Performance |
|-----------|---------|--------|-----------|-------------|
| ArrayList | ✅ | ❌ | ❌ | Fast access |
| LinkedList | ✅ | ❌ | ❌ | Fast insert/delete |
| HashSet | ❌ | ✅ | ❌ | Fastest |
| TreeSet | ✅ | ✅ | ❌ | Sorted |
| HashMap | ❌ | ✅ | ✅ | Fast access |
| TreeMap | ✅ | ✅ | ✅ | Sorted by key |

---

## ✅ Checklist

- [ ] Use List (ArrayList, LinkedList)
- [ ] Use Set (HashSet, TreeSet)
- [ ] Use Map (HashMap, TreeMap)
- [ ] Iterate using Iterator and forEach
- [ ] Use Collections utility methods
- [ ] Solve 15+ exercises

---

**Congratulations! You've completed all 12 Core Java modules! 🎉**
