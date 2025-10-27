public class DoubleLinkdlst {
    public static class Node {
         int data;
         Node Next;
         Node Prev;

        public Node (int data){
            this.data = data;
            this.Next = null;
            this.Prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size =0;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.Next = head;
        head.Prev = newNode;
        head = newNode;
        size++;
        return;

    }
    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "\t");
            temp = temp.Next;
        }
    }
    public static void remLast(){
        if (size == 1){
            head = tail = null;
            size--;
            return;
        }
           tail = tail.Prev;
           tail.Next = null;
           size--;
           return;
    }
    public static void main(String[] args) {
        DoubleLinkdlst d = new DoubleLinkdlst();
         addFirst(6);
         addFirst(8);
         addFirst(9);
         addFirst(1);
        print();
        System.out.println();
        remLast();
        print();
        System.out.println("\n size of linkdlist " + size);
    }
}
