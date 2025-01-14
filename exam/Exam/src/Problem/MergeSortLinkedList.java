package Problem;

public class MergeSortLinkedList {
	
	public static void main(String[] args) {
		Node head = new Node(500);
		Node node1 = new Node(423);
		Node node2 = new Node(1567);
		Node node3 = new Node(623);
		Node node4 = new Node(3457);
		Node node5 = new Node(2);
		Node node6 = new Node(8);
		Node node7 = new Node(7);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		head = mergeSort(head);
		printList(head);
	}
	
	public static Node merge(Node left,Node right) {
      if (left == null) return right;
      if (right == null) return left;
      
      Node result;
      
      if (left.data <= right.data) {
          result = left;
          result.next = merge(left.next, right);
      } else {
          result = right;
          result.next = merge(left, right.next);
      }
      return result;
	}
	
	
 
  static Node findMid(Node head) {
      if (head == null) { 
    	  
    	  return null;
    	  }
      Node slow = head;
      Node fast = head.next;
      
      while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow;
  }
  

  static Node mergeSort(Node head) {
      if (head == null || head.next == null) {
          return head;
      }
      
      Node mid = findMid(head);
      Node besideMid = mid.next;
      
      mid.next = null;
     
      
      Node left = mergeSort(head);
      Node right = mergeSort(besideMid);
      
      
      return merge(left, right);
  }
  
 
  static void printList(Node head) {
      Node current = head;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
      System.out.println();
  }
}
