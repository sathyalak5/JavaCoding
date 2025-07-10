class Node {
    int data;
    Node next;

    
    Node(int data, Node next)
    {
       this.data = data;
       this.next = null;
    } 
}

public class SearchLinkedList {

    public static boolean searchValue(Node head, int target)
    {
       Node temp = head;
       boolean found = false;
       while(temp!=null)
       {
          if(temp.data == target)
          {
             return true;
          }
          temp = temp.next;
       }
       return false;
     }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4); 
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(10);

        if(searchValue(head, 6))
        {
          System.out.println("Found");
        }
        else
        {
         System.out.println("Not Found");
        }
        if(searchValue(head, 99))
       {
         System.out.println("Found");
       }
       else
       {
         System.out.println("Not Found");
       } 
    }
}
