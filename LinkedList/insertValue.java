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
public class insertValue{
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
    private static Node insertbeforeValue(Node head, int ele, int val){
        if(head==null){
            return null;
        }
        if(head.data==val){
            return new Node(ele,head);
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.data == val){
                Node x = new Node(ele,temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }


    public static void main(String[] args) {
        int[] arr = {3,5,2,6,4};
        Node head = llTraversal(arr);
        head = insertbeforeValue(head, 10, 2);
        print(head);

    }
}