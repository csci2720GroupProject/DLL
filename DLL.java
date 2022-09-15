class DLL<E> {
    class Node<E> {
        // hello test
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
            
            void addFirst(E element) {
                insert(0, element);
                /*Node <E> temp = new Node<E>(element);

                if (counter == 0) {
                    
                    head = temp;
                    tail = temp;
                } else {
                    this.tail.setNext(temp);;
                    temp.setPrev(tail);
                    temp.setNext(this.head.getNext());
                    this.head = temp;
                    this.head.setNext(null);; 
                    //node after head needs to point to temp
                }
                counter++;*/
            } //addFirst
            
            void addLast(E element) {
                insert(counter, element);
                /*Node temp = new Node<>(element);

                if (counter == 0) {
                    head = tail = temp;
                    head.prev = null;
                    tail.next = null;
                } else {
                    temp.next = head;
                    temp.prev = null;
                    head = temp;
                }
                counter++;*/
            }
            
            public E removeFirst() {
                return remove(0);
                /*Node <E> removed = head;
                head = head.next;
                head.prev = null;
                counter--;
                return removed.getElement();*/
            }
            
            public E removeLast() {
                return remove(counter-1);
                // Node <E> removed = tail;
                // tail = tail.prev;
                // tail.next = null;
                // counter--;
                // return removed.getElement();
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
                DLL<E> clone = new DLL();
                clone.head = this.head;
                
                return clone; 
            }
            
            /** NOT DONE */
            public DLL<E> deepClone() {
                return null;
            }
            
            public void insert(int index, E element) {
                    if(index < 0 || index > 500){
                        System.out.println("else");
                    } else if(index == counter) {
                        Node <E> temp = new Node<E>(element);
    
                        if (counter == 0) {
                            
                            head = temp;
                            tail = temp;
                        } else {
                            this.tail.setNext(temp);;
                            temp.setPrev(tail);
                            //temp.setNext(this.head.getNext());
                            //this.head.getNext().setNext(temp);
                            this.tail = temp;
                        } //if/else
                        counter++;
                    } else if(index == 0) {
                        Node <E> temp = new Node<E>(element);
    
                        if (counter == 0) {
                            head = tail = temp;
                            head.prev = null;
                            tail.next = null;
                        } else {
                            head.prev = temp;
                            temp.next = head;
                            temp.prev = null;
                            head = temp;
                        }
                        counter++;
                    } else {
                        Node <E> temp = new Node<E>(element);
                        Node <E> tempHead = head;
                        for(int i = 0; i < index-1; i++) {
                            tempHead = tempHead.next;
                        }
                        temp.next = tempHead.next;
                        temp.prev = tempHead;
                        tempHead.next = temp;
                        counter++;

                    }
                } //insert

            
            public E get(int index) {
                Node<E> temp = head;
                if (counter == 0 || index >= counter || index < 0) {
                    return null;
                } else {
                    for (int i = 0; i < index; i++) {
                        temp = temp.next;
                    }
                    return temp.element;
                }
            }
            
            public E remove(int index) {
                Node<E> removed = head;
                Node<E> temp = head;
                if (counter == 0) {
                    return null;
                } else if(index == 0) {
                    head = head.next;
                    head.prev = null;
                } else if(index == counter-1){
                    removed = tail;
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    for (int i = 0; i < index-1; i++) {
                        temp = temp.next;
                        removed = removed.next;
                    }
                    removed = removed.next;
                    temp.next = removed.next;
                    removed.next.prev = temp;
                    
                }
                counter--;
                return removed.element;
            }
            
            /** STILL WORKING ON THIS  */
            void remove(Node<E> x) {
                Node<E> temp = x;
                if ((x.getElement() != head) && (x.getElement() != tail)) {
                    temp = temp.prev;
                    temp.next = temp.next.next;
                } else if (x.equals(tail)) {
                    temp = temp.prev;
                    temp.next = null;
                } else {
                    temp = temp.next;
                    temp.prev = null;
                }
                return;
            }
            
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
            }
            
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
                list.addLast("1"); 
                list.addFirst("2");
                list.addFirst("3");
                list.addLast("0");
                System.out.println(list.toString());
                list.insert(1, 5);
                System.out.println(list.toString());
                list.remove(4);
                System.out.println(list.toString());   
            }
        }
