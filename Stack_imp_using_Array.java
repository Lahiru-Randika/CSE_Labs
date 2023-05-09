public class Stack_imp_using_Array {
    int[] array;
    int top;
    int size;

    public Stack_imp_using_Array(int size) {
        this.array = new int[size];
        this.top = -1;
        this.size = size;
    }

    public void push(int item) {
        if (top == size - 1) {
            System.out.println("Stack is full.");
            return;
        }
        int ele=array[++top];
        array[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int ele=array[top--];
        return ele;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return (top + 1);
    }
    public void display() {
        if (top == -1) {
            System.out.println("Error: Stack is empty.");
            return;
        }
        System.out.print("Current Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_imp_using_Array stack1 = new Stack_imp_using_Array(500);
        long start1 = System.nanoTime();
        stack1.push(8);
        stack1.push(10);
        stack1.push(5);
        stack1.push(11);
        stack1.push(15);
        stack1.push(23);
        stack1.push(6);
        stack1.push(18);
        stack1.push(20);
        stack1.push(17);
        stack1.display();

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        stack1.display();

        stack1.push(4);
        stack1.push(30);
        stack1.push(3);
        stack1.push(1);
        stack1.display();

        long stop1 = System.nanoTime();
        long duration1 = (stop1 - start1);
        System.out.println("Running Time: " + duration1 + " nanoseconds");
    }
}
