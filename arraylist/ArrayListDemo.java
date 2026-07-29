package arraylist;

import java.util.Arrays;
import java.util.ArrayList;

class ArrayListDemo {
    static void creationDemo() {
        // Ways to instantiate ArrayList
        // 1. Using default constructor
        ArrayList<String> al1 = new ArrayList<>();
        System.out.println("Initial size of al1: " + al1.size());

        // 2. Using constructor with initial capacity
        // REMEMBER: ArrayList does not have capacity() method 
        ArrayList<String> al2 = new ArrayList<>(10);
        System.out.println("Initial size of al2: " + al2.size());

        // 3. Using constructor with Collection
        ArrayList<String> al3 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> al4 = new ArrayList<>(Arrays.asList(new String[] {"A", "B", "C"}));
        System.out.println("Initial size of al3: " + al3.size());
        System.out.println("Initial size of al4: " + al4.size());
    }

    static void methodsDemo() {
        // Adding and modifying elements
        ArrayList<String> al1 = new ArrayList<>();

        // boolean add(E e) method returns true if the element was added successfully
        System.out.println(al1.add("A"));
        System.out.println(al1.add("B"));
        System.out.println(al1.add("C"));
        System.out.println("al1: " + al1);

        // void add(int index, E element) method inserts the specified element at the specified position in this list
        al1.add(1, "D");
        System.out.println("al1 after adding D at index 1: " + al1);
        // REMEMBER: Doesn't return anything
        // System.out.println(al1.add(1, "E")); // compile error, cannot return

        // E set(int index, E element) method replaces the element at the specified position in this list with the specified element
        String oldValue = al1.set(1, "E");
        System.out.println("al1 after setting E at index 1: " + al1);
        System.out.println("Old value at index 1: " + oldValue);

        // E remove(int index) method removes the element at the specified position in this list and returns the element that was removed from the list
        String removedValue = al1.remove(1);
        System.out.println("al1 after removing element at index 1: " + al1);
        System.out.println("Removed value at index 1: " + removedValue);

        // boolean remove(Object o) method removes the first occurrence of the specified element from this list, if it is present
        boolean isRemoved = al1.remove("B");
        System.out.println("al1 after removing B: " + al1);
        System.out.println("Was B removed? " + isRemoved);

        // boolean removeIf(Predicate<? super E> filter) method removes all of the elements of this collection that satisfy the given predicate
        al1.removeIf(s -> s.equals("C"));
        System.out.println("al1 after removing elements that are equal to C: " + al1);

        // E get(int index) method returns the element at the specified position in this list
        String valueAtIndex0 = al1.get(0);
        System.out.println("Value at index 0: " + valueAtIndex0);

        // int size() method returns the number of elements in this list
        int size = al1.size();
        System.out.println("Size of al1: " + size);

        // boolean isEmpty() method returns true if this list contains no elements
        boolean isEmpty = al1.isEmpty();
        System.out.println("Is al1 empty? " + isEmpty);

        // int indexOf(Object o) method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
        int indexOfE = al1.indexOf("E");
        System.out.println("Index of E: " + indexOfE);

        // int lastIndexOf(Object o) method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
        int lastIndexOfE = al1.lastIndexOf("E");
        System.out.println("Last index of E: " + lastIndexOfE);

        // ConcurrentModificationException can occur if we modify the list while iterating over it
        // REMEMBER: This is a common pitfall when using ArrayList in Java
        for (String s : al1) {
            if (s.equals("A")) {
                // al1.remove(s); // This will throw ConcurrentModificationException
            }
        }
    }

    /*
    Things to remember:

    add(E e) returns boolean
    remove(Object o) returns boolean
    removeIf(Predicate<? super E> filter) returns boolean

    add(int index, E element) returns void

    set(int index, E element) returns E
    remove(int index) returns E
    */
}
