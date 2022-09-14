//package LinkedList;

public class Node<E> {

    private E element;
    private Node<E> prev;
    private Node<E> next;

    public Node() {

	this.element = null;
	this.prev = null;
	this.next = null;
	
    } //null constructor

    public Node (E element) {

	this.element = element;
	this.prev = null;
	this.next = null;
	
    } //Constructor - element is a param, prev & next are null

    public Node(E element, Node<E> prev, Node<E> next) {

	this.element = element;
	this.prev = prev;
	this.next = next;
	
    } //Constructor - all params are provided

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
    
} //Node
