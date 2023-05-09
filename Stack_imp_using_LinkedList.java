public class Stack_imp_using_LinkedList {
    Node top;
    int size;

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Stack_imp_using_LinkedList() {
        this.top = null;
        this.size = 0;
    }

    public void push(int element) {
        Node node = new Node(element);
        node.next = top;
        top = node;
        size++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int element = top.value;
        top = top.next;
        size--;
        return element;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.value;
    }

    public String isEmpty() {
        if (top == null){
            return ("True");
        }else{
            return ("False");
        }
    }


    public int size() {
        return size;
    }
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Current Stack: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Stack_imp_using_LinkedList list1 = new Stack_imp_using_LinkedList();
        long start1 = System.nanoTime();
        list1.push(8);
        list1.push(10);
        list1.push(5);
        list1.push(11);
        list1.push(15);
        list1.push(23);
        list1.push(6);
        list1.push(18);
        list1.push(20);
        list1.push(17);
        list1.display();

        System.out.println(list1.pop());
        System.out.println(list1.pop());
        System.out.println(list1.pop());
        System.out.println(list1.pop());
        System.out.println(list1.pop());

        list1.display();
        list1.push(4);
        list1.push(30);
        list1.push(3);
        list1.push(1);

        list1.display();
        long stop1 = System.nanoTime();
        long duration1 = (stop1 - start1);
        System.out.println("Running Time: " + duration1 + " nanoseconds");
    }
}
