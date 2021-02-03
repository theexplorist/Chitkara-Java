# Chitkara-Java

Below are the Big O performance of common functions of different Java Collections.


List                 | Add  | Remove | Get  | Contains | Data Structure
---------------------|------|--------|------|----------|---------------
ArrayList            | O(1) |  O(n)  | O(1) |   O(n)   | Array
LinkedList           | O(1) |  O(1)  | O(n) |   O(n)   | Linked List




Set                   |    Add   |  Remove  | Contains | Size | Data Structure
----------------------|----------|----------|----------|------|-------------------------
HashSet               | O(1)     | O(1)     | O(1)     | O(1) | Hash Table
LinkedHashSet         | O(1)     | O(1)     | O(1)     | O(1) | Hash Table + Linked List
TreeSet               | O(log n) | O(log n) | O(log n) | O(1) | Red-black tree




Queue                   |  Offer   | Peak |   Poll   | Remove | Size | Data Structure
------------------------|----------|------|----------|--------|------|---------------
PriorityQueue           | O(log n) | O(1) | O(log n) |  O(n)  | O(1) | Priority Heap
LinkedList              | O(1)     | O(1) | O(1)     |  O(1)  | O(1) | Array
ArrayDequeue            | O(1)     | O(1) | O(1)     |  O(n)  | O(1) | Linked List


Map                   |   Get    | ContainsKey | Data Structure
----------------------|----------|-------------|-------------------------
HashMap               | O(1)     |   O(1)      | Hash Table
LinkedHashMap         | O(1)     |   O(1)      |Hash Table + Linked List
TreeMap               | O(log n) |   O(log n)  | Red-black tree
