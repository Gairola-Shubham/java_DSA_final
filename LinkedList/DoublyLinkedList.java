package LinkedList;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
} 

public class DoublyLinkedList {

    private static Node ConvertArr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node deleteHead(Node head){
        if(head == null || head.next==null){
            return null;
        }
        Node prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        return head;
    }

    private static Node deleteTail(Node head){
        if(head == null || head.next==null){
            return null;
        }
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;

        return head;
    }
    
    private static Node removeKthElement(Node head, int k){
        if(head==null){
            return null;
        }
        int cnt = 0;
        Node Knode = head;
        while(Knode != null){
            cnt++;
            if(cnt==k) break;
            Knode = Knode.next;
        }
        Node prev = Knode.back;
        Node front = Knode.next;

        if(prev==null && front==null){
            return null;
        }

        else if(prev==null){
            return deleteHead(head);
        }
        else if(front ==null){
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;

        Knode.next = null;
        Knode.back = null;

        return head;
    }

    private static Node deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        if(front == null){
            prev.next = null;
            temp.back = null;
            return temp;
        }
        prev.next = front;
        front.back = prev;

        return temp.next = temp.back = null;
    }

    private static Node insertBeforehead(Node head, int val){
        Node newhead = new Node(val,head,null);
        head.back = newhead;

        return newhead;
    }

    private static Node insertAfterhead(Node head, int val){
    if (head == null) return null;

    Node temp = head.next;                   
    Node newNode = new Node(val, temp, head);   

    head.next = newNode;

    if (temp != null) {
        temp.back = newNode;                  
    }

    return head;
}

    private static Node insertBeforetail(Node head,int val){
        if(head.next==null){
            return insertBeforehead(head, val);
        }

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(val, tail, prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }

    private static Node insertAftertail(Node head,int val){
        if(head.next==null){
            return insertAfterhead(head, val);
        }

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node newNODE = new Node(val, head, null);
        tail.next = newNODE;
        newNODE.next = null;

        return head;
    }

    private static Node insertBeforeKthelement(Node head, int k, int val){
        if(k==1){
            return insertBeforehead(head, val);
        }
        
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            if(cnt==k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    private static Node insertAfterKthelement(Node head, int k, int val){
        if(head==null) return null;
        if(k==1){
            return insertAfterhead(head, val);
        }
        Node temp = head;
        int cnt = 1;
        while(temp != null && cnt<k){
            temp = temp.next;
            cnt++;
        }
        if(temp==null) return head;

        Node next = temp.next;
        Node newNode = new Node(val, next, temp);

        temp.next = newNode;
        if(next!=null){
            next.back = newNode;
        }
        return head;
    }

    private static Node insertBeforeNode(Node node, int val, Node head){
        if(node==null) return null;
        Node prev = node.back;
        Node newNode = new Node(val,node,prev);
        if(prev!=null){ 
            prev.next = newNode;
        }else{
            head = newNode;
        }
        node.back = newNode;
        return head;
    }

    private static Node insertAfterNode(Node node, int val, Node head) {
        if (node == null) return head;

        Node next = node.next;
        Node newNode = new Node(val, next, node);  // newNode connects to node and next

        node.next = newNode;

        if (next != null) {
            next.back = newNode;
        }

        return head;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        Node head = ConvertArr2DLL(arr);
        head = insertAfterNode(head.next.next,10, head);
        print(head);
    }
}
