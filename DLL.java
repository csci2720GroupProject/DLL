import java.lang.Object;
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
			return element;
		}
    }

	private Node<E> head;
	private Node<E> tail;
	private int counter;
	
	public DLL() {
		
	} // DLL
	
	public int size() {
		
	} // size
	
	public boolean isEmpty() {
		
	}
	
	public E first() {
		
	}
	
	public E last() {
		
	}
	
	void addFirst(E element) {
		
	}
	
	void addLast(E element) {
		
	}
	
	public E removeFirst() {
		
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
		
	}
	
	E set(int index, E element) {
		
	}
	
	public static void main(String[] args) {
		

	}

}
