package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}


public class deleteValue {
    private static Node llTraversal(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;        
        }
        System.out.println();
    }
    private static Node removeValue(Node head, int ele){
        if(head==null) return head;
        if(head.data==ele){
            Node temp = head;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data==ele){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr= {5,3,7,98};
        Node head = llTraversal(arr);
        head  = removeValue(head,3);
        print(head);

        
    }
}
