package linkedlist;

public class GetNthFromLast {
	int getNthFromLast(Node head, int n) {
		// Your code here
		Node node = head;
		Node tempnode = head;
		// boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (node == null) {
				return -1;
			}
			node = node.next;

		}

		for (int i = 0; node != null; i++) {
			node = node.next;
			tempnode = tempnode.next;
		}

		return tempnode.data;

	}
}
