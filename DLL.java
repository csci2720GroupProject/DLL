class DLL<E> {
    class Node<E> {
            private E element;
            private Node<E> prev;
            private Node<E> next;
                
            public Node() {
                element = null;
                prev = null;
                next = null;
            }
                
                public Node (E element) {
                    this.element = element;
                }
                
                public Node (E element, Node<E> prev, Node<E> next) {
                    this.element = element;
                    this.prev = prev;
                    this.next = next;
                }
                
                public Node<E> getNode(Node<E> element) {
                    return element;
                }
                
                public Node<E> setNode(Node<E> element) {
                    this.element = element;
                    return element;
                }
            }

            private Node<E> head;
            private Node<E> tail;
            private int counter;
            
            public DLL() {
                this.head = null;
                this.tail = null;
                counter = 0;
            } // DLL
            
            public int size() {
                return this.counter;
            } // size
            
            public boolean isEmpty() {
                if (counter == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            
            public E first() {
                return tail;
            }
            
            public E last() {
                return head;
            }
            
            void addFirst(E element) {
                Node temp = new Node<>(element);

                if (counter == 0) {
                    
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    temp.prev = tail;
                    tail = temp;
                    tail.next = null; 
                }
                counter++;
            }
            
            void addLast(E element) {
                Node temp = new Node<>(element);

                if (counter == 0) {
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                } else {
                    temp.next = head;
                    temp.prev = null;
                    head = temp;
                }
                counter++;
            }
            
            public E removeFirst() {
                Node temp = tail;
                tail = tail.prev;
                counter--;
                return temp.element;
            }
            
            public E removeLast() {
                Node temp = head;
                head = head.next;
                counter--;
                return temp;
            }
            
            public String toString() {
                if (head == null) {
                    return "[]";
                }
                else {
                    String result = "[" + head.element;
                    Node<E> current = head.next;
                    while (current != null) {
                        result += ", " + current.element;
                        current = current.next;
                    }
                    result += "]";
                    return result;
                }
            }
            
            public DLL<E> clone() {
                
                return null; 
            }
            
            public DLL<E> deepClone() {
                return null;
            }
            
            public void insert(int index, E element) {
                
            }
            
            public E get(int index) {
                Node<E> temp = head;
                if (counter == 0) {
                    return null;
                } else {
                    for (int i = 0; i < counter; i++) {
                        temp = temp.next;
                    }
                    return temp.element;
                }
            }
            
            public E remove(int index) {
                Node<E> removed = head;
                Node<E> temp = head;
                System.out.println("Current counter:" + counter);
                if (counter == 0) {
                    return null;
                } else {
                    for (int i = 1; i < index; i++) {
                        temp = temp.next;
                        removed = removed.next;
                    }
                    temp.prev = removed.prev;
                    temp.next = removed.next;

                    counter--;
                    System.out.println("Current counter:" + counter);
                    return removed.element;
                }
            }
            
            void remove(Node<E> x) {
                
            }
            
            Node<E> find(E element) {
                return head;
            }
            
            void clear() {
                head = null;
                tail = null;
                counter = 0;
            }
            
            E set(int index, E element) {
                return "";
            }
            
            public static void main(String[] args) {
                DLL list = new DLL();
                list.addFirst("1"); 
                list.addFirst("2");

                System.out.println(list.toString());


                DLL list2 = new DLL<>();

                list2.addLast("1");
                list2.addLast("2");
                System.out.println(list2.toString());


                list.remove(2);
                //list.get(1).toString();
                System.out.println(list.toString());
                
            }

        }
