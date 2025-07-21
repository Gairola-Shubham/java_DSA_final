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


public class searcheleLL {
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
    private static int LlLength(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    private static int checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,4};
        Node head = llTraversal(arr);
        System.out.println(LlLength(head));
        System.out.print(checkIfPresent(head, 9));

    }

}
