public class MyMethod {

    static String[] stack = new String[10];
    static int top = -1;

    public static void push(String item) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = item;
        System.out.println(item + "");
    }

    public static String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        }
        String removed = stack[top];
        stack[top--] = null;
        System.out.println(removed + "");
        return removed;
    }


    public static String peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return null;
        }
        System.out.println("Top element: " + stack[top]);
        return stack[top];
    }


    public static boolean empty() {
        boolean e = (top == -1);
        System.out.println(e ? "Stack is empty." : "Stack is NOT empty.");
        return e;
    }

    public static int size() {
        int s = top + 1;
        System.out.println("Stack size: " + s);
        return s;
    }


    public static int search(String item) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].equals(item)) {
                int pos = top - i + 1;
                System.out.println(item + " found at position: " + pos + "");
                return pos;
            }
        }
        System.out.println(item + " not found.");
        return -1;
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: [ ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i < top) System.out.print(" | ");
        }
        System.out.println(" ]");
    }
}
