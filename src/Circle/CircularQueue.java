package Circle;

import java.util.Scanner;

public class CircularQueue {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("크기를 설정 하세요");
		num = scan.nextInt();
		Calculator cal = new Calculator(num);

		while (true) {
			System.out.println("현재 head "+cal.head);
			System.out.println("현재 tail "+cal.tail);
			System.out.println("입력하세요");
			System.out.println("1. 추가");
			System.out.println("2. 삭제");
			num = scan.nextInt();
			switch(num) {
			case 1:
				cal.addTail();
				break;
			case 2:
				cal.removeHead();
		
				break;
			}
		}

	}

}

class Calculator {
	int[] circle;
	int tail;
	int head;
	int count;
	int overHead;
	int overTail;
	
	Calculator(int count) {
		this.count = count;
		circle();
	}
	void circle() {
		circle = new int[count + 1];
		this.head = 0;
		this.tail = 0;
	}

	void addTail() {
		
		 
		if(!((overTail+tail)-(overHead+head)==count-1)) {
			if ((tail+1)%count == 0) {
				tail = 0;
				overTail +=count;
			} 
			else {
				tail++;
			}
	}else
		System.out.println("더이상 추가 불가능 합니다.");
	}

	void removeHead() {
		if (head == tail &&overHead==overTail) {
			System.out.println("비어있습니다.");
		} 
		else {
		if(head+1%count==0) {
				head=0;
				overHead += count;
		}
		else
				head += 1;
		System.out.println("삭제 되었습니다.");
		}
	}

}
