class Stack {
    int top;
    int[] stack;
    int size;

    Stack() {
        top = -1;
        size = 10;
        stack = new int[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Error: Stack is full!");
            return;
        }
        stack[++top] = item;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Error: Stack is empty!");
            return -1;
        }
        return stack[top--];
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();

        // Pushing items to s1
        for (int i = 1; i <= 10; i++) {
            s1.push(i);
        }

        // Popping items from s1
        System.out.println("Popping items from s1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(s1.pop() + " ");
        }
        System.out.println();

        // Pushing items to s2
        for (int i = 10; i >= 1; i--) {
            s2.push(i);
        }

        // Popping items from s2
        System.out.println("Popping items from s2:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(s2.pop() + " ");
        }
    }
}