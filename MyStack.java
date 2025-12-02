import java.util.Scanner;

public class MyStack {
    public static void main(String[] args) {


        MyMethod.push("Programming 1");
        MyMethod.push("Object Oriented Programming");
        MyMethod.push("Data Structures and Algorithms");
        MyMethod.push("Database Management System");

        Scanner in = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n=== STACK MENU ===");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Peek");
            System.out.println("4 - Size");
            System.out.println("5 - Search");
            System.out.println("6 - Empty");
            System.out.println("7 - Display Stack");
            System.out.println("8 - Exit");
            System.out.print("Choice: ");
            ch = in.nextInt();
            in.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter item to push: ");
                    MyMethod.push(in.nextLine());
                    break;

                case 2:
                    MyMethod.pop();
                    break;

                case 3:
                    MyMethod.peek();
                    break;

                case 4:
                    MyMethod.size();
                    break;

                case 5:
                    System.out.print("Enter item to search: ");
                    MyMethod.search(in.nextLine());
                    break;

                case 6:
                    MyMethod.empty();
                    break;

                case 7:
                    MyMethod.display();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (ch != 8);

        in.close();
    }
}
