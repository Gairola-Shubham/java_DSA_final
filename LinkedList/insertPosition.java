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

public class insertPosition {
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
    private static Node insertAtPosition(Node head, int ele, int k){
        if(head==null){
            if(k == 1){
                return new Node(ele);
            }else{
                return head;
            }
        }
        if(k==1){
            return new Node(ele,head);
        }
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;
            if(cnt==(k-1)){
                Node x = new Node(ele, temp.next);
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
        head = insertAtPosition(head, 10, 2);
        print(head);

    }
    
}