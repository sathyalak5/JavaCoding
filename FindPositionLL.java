class Node {
  int data;
  Node next;

  Node(int data, Node next) {
    this.data = data;
    this.next = null;
  }

  // You don't actually need the `next` parameter unless you're using it
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class FindPositionLL {
  public static int searchPosition(Node head, int target) {
    Node temp = head;
    int position = 0;
    while (temp != null) {
      if (temp.data == target) {
        return position;
      }
      temp = temp.next;
      position++;
    }
    return -1;
  }

  public static void main(String[] args) {
    Node head = new Node(3);
    head.next = new Node(6);
    head.next.next = new Node(9);
    head.next.next.next = new Node(12);
    head.next.next.next.next = new Node(15);
    head.next.next.next.next.next = new Node(18);
    head.next.next.next.next.next.next = new Node(21);

    if (searchPosition(head, 12) != -1) {
      System.out.println("Found at position: " + searchPosition(head, 12));
    } else {
      System.out.println("Not Found");
    }

    if (searchPosition(head, 100) != -1) {
      System.out.println("Found at position: " + searchPosition(head, 100));
    } else {
      System.out.println("Not Found");
    }

    if (searchPosition(head, 3) != -1) {
      System.out.println("Found at position: " + searchPosition(head, 3));
    } else {
      System.out.println("Not Found");
    }
  }
}
