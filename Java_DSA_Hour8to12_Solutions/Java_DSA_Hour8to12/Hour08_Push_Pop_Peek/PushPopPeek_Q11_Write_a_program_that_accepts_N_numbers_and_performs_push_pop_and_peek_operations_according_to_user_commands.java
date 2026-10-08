// Q11. Write a program that accepts N numbers and performs push, pop, and peek operations according to user commands.
import java.util.*;

public class PushPopPeek_Q11_Write_a_program_that_accepts_N_numbers_and_performs_push_pop_and_peek_operations_according_to_user_commands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) stack.push(sc.nextInt());

        System.out.println("Commands: push <number>, pop, peek, exit");
        while (true) {
            System.out.print("> ");
            String cmd = sc.next();
            if (cmd.equals("push")) {
                stack.push(sc.nextInt());
                System.out.println("Stack: " + stack);
            } else if (cmd.equals("pop")) {
                if (stack.isEmpty()) System.out.println("Stack Underflow");
                else System.out.println("Popped: " + stack.pop());
            } else if (cmd.equals("peek")) {
                if (stack.isEmpty()) System.out.println("Stack is empty");
                else System.out.println("Top: " + stack.peek());
            } else if (cmd.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
        System.out.println("Final stack: " + stack);
    }
}
