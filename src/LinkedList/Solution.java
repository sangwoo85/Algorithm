package LinkedList;

import java.util.Scanner;

/**
 * 
 * 원형 List
 *
 */
public class Solution {

	static CircleList<Integer> list = new CircleList<Integer>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	int input =0;
	
		while(true) {
			
			System.out.println("----------------------");
			System.out.println("1. 입력");
			System.out.println("2. 다음");
			System.out.println("3. 이전");
			System.out.println("4. 삭제(미구현)");
			System.out.println("----------------------");
			input = scan.nextInt();
			
			switch(input) {
			case 1 : add();
					break;
			case 2 : next();
					break;
			case 3 : prev();
					break;
			case 4 : remove();
					break;
			}
			list.print();
		}
	
	}

	public static void add() {
		System.out.println("입력하세요");
		int num = scan.nextInt();
		System.out.println(num);
		list.add(num);
		
	}
	public static void next() {
		list.next();
	}
	public static void prev() {
		list.prev();
	}
	public static void remove() {
		list.remove();
	}
	
}

//자료 T 타입의 Node
class Node<T>{
	T data;
	Node<T> next;
	Node<T> prev;
	
}

//Node를 활용 하여 리스트를 만드는 클래스
class CircleList<T>{

	Node<T> head;
	Node<T> tail;
	Node<T> thisNode;
	int size;
	
	// 초기 설정 아무것도 없기때문에 head = tail 처음과 끝이 같다.
	public CircleList(){
		head = null;
		tail = null;
		thisNode = null;
		size = 0;
	}

	public void add(T data) {
		
		Node<T> node = new Node<T>();
		node.data = data;
		
		if(head == null) {
			head = node;
			tail = node;
			head.next =node;
			head.prev = node;
			tail.next = node;
			tail.prev = node;
		}else {
			thisNode = head;

			while(thisNode != tail) {
				thisNode = thisNode.next;
			}
			thisNode.next = node;
			node.next = head;
			node.prev = thisNode;
			tail = node;
			head.prev = node;
		}
		
		thisNode = head;
	}
	
	public Node<T> next(){
		if(this.thisNode == null) {
			this.thisNode = head;
		}else {
			this.thisNode = this.thisNode.next;
		}
		return this.thisNode;
	}
	public Node<T> prev(){
		if(this.thisNode ==null) {
			this.thisNode = head;
		}else {
			this.thisNode = this.thisNode.prev;
		}
		return this.thisNode;
	}
	// 현재 node 삭제
	public void remove() {
		
		if(head == tail) {
			head = null;
			tail = null;
			this.thisNode = null;
		}else {
			if(this.thisNode == tail) {
				tail.prev.next = head;
				head.prev = tail.prev;
				tail = tail.prev;
				this.thisNode = tail;
				
			}else if(this.thisNode == head) {
				tail.next = head.next;
				head = head.next;
				head.prev = tail;
				this.thisNode = head;
			}else {
				thisNode.next.prev = thisNode.prev;
				thisNode.prev.next = thisNode.next;
				thisNode = thisNode.next;
			}
		}
		
	}
	public void print(){
		if(thisNode == null) {
			thisNode = head;
		}
		System.out.println("현재 데이터  : " +thisNode.data);
	}
	
	
}

