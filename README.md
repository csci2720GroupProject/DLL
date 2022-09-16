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

In the main method of **DLL.java** we implemented tests with the methods in our Doubly Linked List. To add additional tests or to replace our tests, simply edit the main method. Below are a list of all of our tests included in DLL.java:

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
    public E first()
    public E last()
    public void addFirst()
