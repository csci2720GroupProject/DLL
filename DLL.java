import java.lang.*;

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
            if (counter = 0) {
                return true;
            } else {
                return false;
            }
        }
        
        public E first() {
            
        }
        
        public E last() {
            
        }
        
        void addFirst(E element) {
            Node temp = new Node<>(element);

            if (counter = 0) {
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

            if (counter = 0) {
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
            
            counter--;
            return temp.element;
        }
        
        public E removeLast() {
            
        }
        
        public String toString() {
            
        }
        
        public DLL<E> clone() {
            
        }
        
        public DLL<E> deepClone() {
            
        }
        
        public void insert(int index, E element) {
            
        }
        
        public E get(int index) {
            
        }
        
        public E remove(int index) {
            
        }
        
        void remove(Node<E> x) {
            
        }
        
        Node<E> find(E element) {
            
        }
        
        void clear() {
            
            counter = 0;

        }
        
        E set(int index, E element) {
            
        }
        
        public static void main(String[] args) {
            

        }

    }
