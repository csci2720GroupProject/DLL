class DLL<E> {
    class Node<E> {
        // hello test!
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
                
                public E getElement() {

                    return this.element;
                    
                } //getElement
                
                public void setElement(E element) {
                
                    this.element = element;
                    
                } //setElement
                
                public Node<E> getPrev() {
                
                    return this.prev;
                    
                } //getPrev
                
                public void setPrev(Node<E> prev) {
                
                    this.prev = prev;
                    
                } //setPrev
                
                public Node<E> getNext() {
                
                    return this.next;
                    
                } //getNext
                
                public void setNext(Node<E> next) {
                
                    this.next = next;
                    
                } //setNext
            } //Node Class

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
                }
                
                return false;

            } //isEmpty
            
            public E first() {
                return head.getElement();
            } //first
            
            public E last() {
                return tail.getElement();
            } //last
            
            /**
             * Head End
             */
            void addFirst(E element) {
                Node <E> temp = new Node<E>(element);

                if (counter == 0) {
                    
                    head = temp;
                    tail = temp;
                } else {
                    this.tail.setNext(temp);;
                    temp.setPrev(tail);
                    temp.setNext(this.head.getNext());
                    this.head.getNext().setNext(temp);
                    this.head = temp;
                } //if/else
                counter++;
            } //addFirst
            
            /**
             * Tail End
             */
            void addLast(E element) {
                Node <E> temp = new Node<E>(element);

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
            } //addLast
            
            public E removeFirst() {
                Node <E> temp = tail;
                tail = tail.prev;
                counter--;
                return temp.getElement();
            } //removeFirst
            
            public E removeLast() {
                Node <E> temp = head;
                head = head.next;
                counter--;
                return temp.getElement();
            } //removeLast
            
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
                } //if/else
            } //toString
            
            public DLL<E> clone() {
                
                return null; 
            } //clone
            
            public DLL<E> deepClone() {
                return null;
            } //deepClone
            
            public void insert(int index, E element) {
                if(index == 0){

                } else if(index == counter) {

                } else if(index < 0 || index > counter) {

                } else {
                    
                }
            } //insert
                
           
            
            public E get(int index) {
                Node<E> temp = head;
                if (counter == 0) {
                    return null;
                } else {
                    for (int i = 0; i < counter; i++) {
                        temp = temp.next;
                    }
                    return temp.element;
                } //if/else
            } //get
            
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
                } //if/else
            } //remove
            
            void remove(Node<E> x) {
                
            } //remove
            
            Node<E> find(E element) {
                
                Node<E> temp = new Node<E>();
                temp = this.head;

                for (int i = 0; i < this.counter; i++) {

                    if (temp.getElement() == element) {

                        return temp;

                    } //if

                    if (temp.getNext() != null) {

                        temp = temp.getNext();

                    } //if

                } //for

                return null;
            } //find
            
            void clear() {
                head = null;
                tail = null;
                counter = 0;
            }
            
            E set(int index, E element) {
                
                Node<E> temp = new Node<E>(element);

                if (index > this.counter) {

                    return null;

                } //if

                Node<E> moreOtherTemp = new Node<E>();
                moreOtherTemp = this.head;

                for (int i = 0; i < index - 1; i++) {

                    moreOtherTemp = moreOtherTemp.getNext();

                } //for

                temp.setNext(moreOtherTemp.getNext());
                moreOtherTemp.setPrev(temp);
                temp.setPrev(moreOtherTemp);
                moreOtherTemp.setNext(temp);

                return element;
            } //set
            
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
