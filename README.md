
# Java Algo Assignment (10+ yrs candidate)

This repository contains Java 8+ implementations of common interview / assignment problems (algorithms, concurrency, design patterns),
along with JUnit 5 tests and a Maven `pom.xml` so you can build and run tests easily.

## Structure
- `src/main/java/com/example/algos` - algorithm and utility classes
- `src/test/java/com/example/algos` - JUnit tests
- `pom.xml` - Maven build file (Java 8, JUnit 5)

## How to build & run tests
Requires Java 8+ and Maven installed.

```bash
mvn -q -DskipTests=false test
```

## Included problems (source files)
- ReverseWords
- EmployeeSort (and Employee)
- FrequencyStream
- LRUCache (LinkedHashMap-based)
- Permutations
- CharCount
- ProdConsBQ (producer-consumer using BlockingQueue)
- DeadlockDemo
- CycleDetect (Linked List cycle detection)
- MergeWithoutExtra
- KthLargest (QuickSelect)
- BalancedParens
- Person (immutable)
- WordCountFile (example)
- ProdConsWait (wait/notify)
- SumLargeFile (example)
- AppConfig (enum singleton)
- PerfExample
- MultiFileSearch
- FirstNonRepeat
- GroupByDept (Student)
- LongestUniqueSubstr
- DCLSingleton
- Strategy Pattern sample (Payment/Checkout)
- SimpleConnectionPool (toy)

## Notes
- Some examples (file IO, DB) use placeholders or minimal mocks for clarity.
- Tests cover key algorithmic behavior and edge cases.

