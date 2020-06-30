package problemExample_279p;

import java.sql.Array;

public class QueueExample {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.push("A");
		q.push("B");
		q.push("C");
		q.print();
		q.pop();
		System.out.println();
		q.print();
	}
}

class Queue {
	String[] arr = new String[5];
	int inPtr = 0;
	int outPtr = 0;
	int size = 0;

	int size() {
		System.out.println("szie : " + size);
		return size;
	}

	void push(String input) {
		if (size < arr.length) {
			arr[inPtr] = input;
			inPtr = (++inPtr) % arr.length;
			size++;
		}
	}

	String pop() {
		String result = null;

		if (size > 0) {
			result = arr[outPtr];
			outPtr = ++outPtr % arr.length;;
			size--;
		}
		return result;
	}
	
	void print() {
		for(int i = outPtr; i<size+outPtr; i++) {
			i = i%arr.length;
			System.out.println(arr[i]);
		}
	}
}
