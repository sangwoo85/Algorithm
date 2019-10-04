package LinkedList_circle;

import java.util.Scanner;

public class Test_Linked {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Linked_Start<Integer> link = new Linked_Start<Integer>();
		int count = 0;
		while (true) {
			count++;

			System.out.println("현재 커서의 위치 : " + link.courserNum() + "\n");
			System.out.println("0. 현재 커서 데이터 추가");
			System.out.println("1. head 추가");
			System.out.println("2. tail 추가");
			System.out.println("3. removeHead");
			System.out.println("4. removeTail");
			System.out.println("5  removeAll");
			System.out.println("6. count");
			System.out.println("7. getAt");
			System.out.println("8. 전체 주소 출력");
			int choice = scan.nextInt();
			switch (choice) {
			case 0:
				link.addData(count);
				break;
			case 1:
				link.addHead(count);
				break;
			case 2:
				link.addTail(count);
				break;
			case 3:
				link.removeHead();
			case 4:
				link.removeTail();
				break;
			case 5:
				link.removeAll();
				break;
			case 6:
				System.out.println("현재 갯수 " + link.count());
				break;
			case 7:
				System.out.println("이동할 포인트 입력");
				int position = scan.nextInt();
				link.getAt(position);
				break;
			case 8:
				link.showAll();
				break;
			}

		}

	}

}

class Linked_Start<T> {

	Node<T> courser;
	Node<T> head;
	Node<T> tail;
	int numCount;

	class Node<T> {

		Node<T> next;
		Node<T> prev;
		T data;
	}

	Linked_Start() {
		head = null;
		tail = null;
		numCount = 0;
	}

	public void addData(T data) {

		if (head == null) {

			addHead(data);

		} else if (courser == tail) {
			addTail(data);
		} else if (head != null && head != tail) {
			System.out.println("현재 커서 ");
			Node<T> node = new Node<T>();
			node.data = data;

			node.next = this.courser.next;
			node.prev = this.courser;
			courser.next.prev = node;
			courser.next = node;

			this.courser = node;
		}
		System.out.println(courser);

	}

	public void addHead(T data) {

		if (head == null) {
			Node<T> node = new Node<T>();
			node.next = node;
			head = node;
			node.prev = node;
			tail = node;
			node.data = data;

			this.courser = node;
		} else {
			Node<T> node = new Node<T>();
			node.data = data;

			node.next = head;
			node.prev = tail;
			head.prev = node;
			head = node;
			tail.next = head;
			this.courser = node;
		}
		System.out.println(courser);
	}

	public void addTail(T data) {

		if (head == null) {
			addHead(data);
		} else {
			Node<T> node = new Node<T>();
			node.data = data;
			node.next = head;
			node.prev = tail;
			tail.next = node;
			head.prev = node;
			tail = node;
			this.courser = node;
		}
		System.out.println(courser);
	}

	public void removeHead() {

		if (head == null) {
			System.out.println(" 삭제할 자료가 없습니다.");
		} else if (head == tail) {
			head.next = null;
			head.prev = null;
			tail.next = null;
			tail.prev = null;
			head = null;
			tail = null;
		} else if (head != null) {
			tail.next = head.next;
			head.next.prev = tail;
			head = head.next;
		}

	}

	public void removeTail() {

		if (head != null) {

			tail.prev.next = head;
			head.prev = tail.prev;
			tail = head.prev;

		} else if (head == tail && head != null) {

			head.next = null;
			head.prev = null;
			tail.next = null;
			tail.prev = null;
			head = null;
			tail = null;

		} else {

			System.out.println("삭제할 자료가 없습니다.");
		}

	}

	public void removeAll() {
		Node<T> tmp;
		tmp = head;
		if (head != null) {
			while (head != null) {
				removeHead();
			}
		} else
			System.out.println("삭제할 자료가 없습니다.");

	}

	public int count() {

		Node<T> at;
		int count = 0;
		at = head;
		if (head != null) {
			do {
				count++;
				at = at.next;
			} while (at != head);
			return count;
		} else
			return 0;

	}

	public void getAt(int position) {

		for (int i = 0; i < position; i++) {
			courser = courser.next;
		}
		System.out.println("현재 위치는 번째" + position);
		System.out.println("자료는 " + courser.data);
	}

	public void showAll() {
		Node<T> tmp;
		if (head != null) {
			tmp = head;
			System.out.println("head = " + head);
			do {
				System.out.println(tmp);
				tmp = tmp.next;
			} while (tmp != head);
			System.out.println("tail = " + tail);
		} else
			System.out.println("출력할 값이 없습니다.");
	}

	public int courserNum() {
		Node<T> point;
		point = head;
		int count = 0;
		if (point != null) {
			do {
				count++;
				point = point.next;
			} while (courser != point);
			return count;
		} else
			return 0;
	}

}