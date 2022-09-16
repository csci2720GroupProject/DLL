# DLL

**Group Members:** Gilad Yehudai(), Landyn Russell (#811564902), Jakson Hensley(#811966171)

## TO COMPILE

---

**javac DLL.java**


## To Run

---

**java DLL**

## A Note About Tests

---

In the main method of **DLL.java** we implemented tests with the methods in our Doubly Linked List. To add additional tests or to replace our tests, simply edit the main method. Below are a list of some of our tests included in DLL.java:

    DLL list = new DLL();
    list.addLast("1"); 
    list.addFirst("2");
    list.addFirst("3");
    list.addLast("0");
    System.out.println(list.toString());
    list.insert(1, 5);
    System.out.println(list.toString());
    list.remove(4);
    System.out.println(list.toString());   
    list.clear();
    System.out.println(list.toString());   

## Methods included in DLL.java

---

    public DLL()
Constructs an empty Doubly Linked List

    public int size()
Returns the current size of the list

    public boolean isEmpty()
Returns true or false, depending on whether or not the list is empty

    public E first()
Returns the element in the first node

    public E last()
Returns the element in the last node

    public void addFirst(E element)
Adds a new node with the provided element in the first index

    public void addLast(E element)
Adds a new node with the provided element in the last node

    public E removeFirst()
Removes the first node and returns the element from that node

    public E removeLast()
Removes the last node and returns the element from that node

    public String toString()
Returns a String representation of the list

    public DLL<E> clone()
Returns a new list that is a shallow copy of the original list

    public DLL<E> deepClone()
Returns a new list that is a deep copy of the original list

    public void insert(int index, E element)
Inserts a new node into the provided index with the provided element

    public E get(int index)
Returns the element of the node in the provided index

    public E remove(int index)
Removes the node at the provided index and returns the element from that node

    public void remove(Node<E> x)
Searches the list for removes a node if it matches the provided node

    public Node<E> find(E element)
Searches for a node with the element provided, and returns that node if it finds it

    public void clear()
Clears out and resets the list and associated variables

    public E set(int index, E element)
Sets the element of the node at the provided index equal to the provided element