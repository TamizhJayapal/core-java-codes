/*
  Java collection core interface
 
  iterable -> collection -> list -> arraylist
  -> linkedlist
  ->vector
  -> Set-> HashSet
  -> LinkedHashSet
  -> SortedSet -> TreeSet
 
 
 
 */

package com.collection.concepts;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;


public class Main {

public Main() { }

public static void main(String[] args) {
//String[] str = new String[] {"name1", "name2"};
//List<String> arrayList = Arrays.asList(str);
// dinamic array basesed
// ordered no unique
// fast random access

// List<String> arrayList = new ArrayList<>();
// arrayList.add("name1");
// arrayList.add("name2");
// arrayList.add("name3");
// arrayList.add("name3");
//System.out.println(arrayList);
//arrayList.remove("name3");
//System.out.println(arrayList);

//List<String> linkedList = new LinkedList<>();
//DS- doubly linked list
// node value prev next
//fast insertion deletion

// linkedList.add("list1");
// linkedList.add("list2");
// linkedList.add("list3");
//
// System.out.println(linkedList);

//linkedList.remove(2);

//System.out.println(linkedList);


//List<String> vector = new Vector<>();
// similar to arraylist but thread safe
// vector.add("vector1");
// vector.add("vector2");
// vector.add("vector3");
// System.out.println(vector);
//vector.remove("vector3");
//System.out.println(vector);


// Set<String> hashSet = new HashSet<>();

//Ds- Hashing table, Hashing method to store
//unordered unique
// hashSet.add("name1");
// hashSet.add("name2");
// hashSet.add("name3");
// System.out.println(hashSet);
//
//
// hashSet.remove("name1");

// System.out.println(hashSet);

//Fist In Last out
// Stack<String> stack = new Stack<>();
// stack.push("test");
// stack.push("test2");
// stack.push("test3");
// stack.pop();
// System.out.println(stack);


// Set<String> hashSet = new HashSet<>();
// hashSet.add("cow");
// hashSet.add("monkey");
// hashSet.add("buffellos");
//
//
//
// Iterator<String> iterator1 = hashSet.iterator();
//
// while(iterator1.hasNext()) {
// System.out.println(iterator1.next());
// }


// Set<String> linkedHashSet = new HashSet<>();
//
//
//        linkedHashSet.add("zebra");
// linkedHashSet.add("elephant");
//        linkedHashSet.add("lion");
//
//        Iterator<String> iterator = linkedHashSet.iterator();
// while(iterator.hasNext()) {
// System.out.println(iterator.next());
// }

//        
// Comparator<Integer> decendingComparator = (a,b) -> b.compareTo(a);
// Comparator<Integer> naturalOrder = Comparator.naturalOrder();
//
// Comparator<Integer> reverseOrder = Comparator.reverseOrder();

// Comparator<String> decendingComparator = new Comparator<String>() {
//
// @Override
// public int compare(String a, String b) {
// return b.compareTo(a);
// }};
//
//
// TreeSet<Integer> treeSet = new TreeSet<>(naturalOrder);

// treeSet.add(4);
// treeSet.add(2);
// treeSet.add(3);
//
// Iterator<Integer> iterator1 = treeSet.iterator();
// while(iterator1.hasNext()) {
// System.out.println(iterator1.next());
//
// }
       
//
// Queue<String> queue = new PriorityQueue<>();
//
// queue.add("cherry");
// queue.add("apple");
// queue.add("banana");
//
//
// Iterator<String> iterator2 = queue.iterator();
// while(iterator2.hasNext()) {
// System.out.println(iterator2.next());
//
// }
//
// queue.poll();
//
// System.out.println(queue);
// queue.remove();
// System.out.println(queue);


// Deque<String> arrayDeque = new ArrayDeque<>();
//
// arrayDeque.add("cherry");
// arrayDeque.add("apple");
// arrayDeque.add("banana");
//
// arrayDeque.offerLast("new element");
//
//
// Iterator<String> iterator3 = arrayDeque.iterator();
// while(iterator3.hasNext()) {
// System.out.println(iterator3.next());
// }

// arrayDeque.remove("banana");
//
// System.out.println(arrayDeque);

//

//  Map<Integer,String> map=new HashMap<Integer,String>();

//no order , value pairs, hashtable allow null
//  map.put(100,"Amit");  
//  map.put(101,"Vijay");  
//  map.put(102,null);  
//  //Elements can traverse in any order  
//  for(Entry<Integer, String> m:map.entrySet()){  
//   System.out.println(m.getValue());  
//  }  
 
//  Map<String, String> hashMap = new HashMap<>();
//        hashMap.put("bon", "two");
//        hashMap.put("app", "one");
//        hashMap.put("new", "three");
//        hashMap.put("test", null);
//        hashMap.put(null, "five");
//
//
//        System.out.println(hashMap.get("new"));
//        
//        for (Entry<String, String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

       //LinkedHashMap example (ordered by insertion)
//        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put(2, "two");
//        linkedHashMap.put(null, "one");
//        linkedHashMap.put(3, null);
//
//        System.out.println("\nLinkedHashMap:");
//        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
       
       //TreeMap
//Red black tree sorted order not null
//        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(2, "two");
//        treeMap.put(1, "one");
//        treeMap.put(3, "three");
//
//        System.out.println("\nLinkedHashMap:");
//        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
 

//HashTable no order not null
//  Hashtable<String, String> hashTable = new Hashtable<String, String>();  
//  
//  hashTable.put("apple", "Jesdsdt");
//  hashTable.put("very", "Amit");  
//  hashTable.put("new", "test");  
//  hashTable.put("banana", "Jest");
//  
//  for(Entry<String, String> entry: hashTable.entrySet()) {
//  System.out.println(entry.getKey() +" "+ entry.getValue());
//  }
//
//


// // Collection Methods List and Map
//
// //1.add

List<String> list1 = new ArrayList<>();
list1.add("cherry");
list1.add("apple");
list1.add("bannana");

// //2.get
System.out.println(list1.get(1));
//
//// 3.indexOf
System.out.println(list1.indexOf("apple"));
//
//// 4.sort
Collections.sort(list1);
System.out.println(list1);
//// 5.reverse
//
Collections.reverse(list1);
System.out.println(list1);
//
//// 6.put
//
Map<Integer, String> hashMap = new HashMap<>();
hashMap.put(2, "apple");
hashMap.put(1, "bannana");
hashMap.put(3, "cherry");
//
System.out.println(hashMap.toString());
//
//// 7.remove
//  
hashMap.remove(1);  
 System.out.println(hashMap.toString());
//  
//// 8.containskey
//  
 System.out.println(hashMap.containsKey(3));
//  
////   9.containsvalue  
System.out.println(hashMap.containsValue("cherry"));
//  
//// 10.entrySet
//
Set<Entry<Integer, String>> sets = hashMap.entrySet();
//
for(Entry<Integer, String> set: sets) {
System.out.println(set.getKey());
System.out.println(set.getValue());
}
//
//// 11.keySet
Set<Integer> keySet = hashMap.keySet();

System.out.println(keySet);
//
//// 12.values
Collection<String> values = hashMap.values();
System.out.println(values);
//
//
//// 13.putAll
//
Map<Integer, String> map1 = new HashMap<>();
map1.put(1, "name1");
Map<Integer, String> map2 = new HashMap<>();
map2.putAll(map1);
System.out.println(map2);
//
//// 14.remove
//
hashMap.remove(1);
//// 15.size
//
System.out.println(hashMap.size());
//// 16.isEmpty
System.out.println(hashMap.isEmpty());
//// 17.contains
System.out.println(list1.contains("name1"));
//// 18.clear
//
hashMap.clear();
// System.out.println(hashMap);
//// 19.toArray
String[] arrayFromList = (String[]) list1.toArray();
System.out.println(list1.toArray());
//// 20.iterator
Iterator<String> iterator = list1.iterator();
//// 21.addAll
List<String> list2 = Arrays.asList("t", "te", "tee");
List<String> list3 = new ArrayList<>();
list3.addAll(list2);
//
// System.out.println(list3);
//// 22.removeAll
List<Integer> list11 = new ArrayList<>();
        list11.add(1);
        list11.add(2);
        list11.add(3);
        list11.add(4);

        List<Integer> list21 = new ArrayList<>();
        list21.add(3);
        list21.add(4);
        list21.add(5);
//
//        // Remove all elements from list1 that are also in list2
        list11.removeAll(list21);
//
//        System.out.println("List1 after removeAll: " + list11);
       
}
}
