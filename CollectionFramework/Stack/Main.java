package CollectionFramework.Stack;

import CollectionFramework.Stack.ArrayImplementation.CustomStack;
import CollectionFramework.Stack.ArrayImplementation.DyanamicStack;

public class Main {
    public static void main(String[] args) {

        // fixed size Stack 
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("\nFixed Size stack :- ");
        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Dyanamic size Stack 
        DyanamicStack stack2 = new DyanamicStack(5);
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        stack2.push(50);
        stack2.push(60);

        System.out.println("\nDyanamic stack :- ");
        stack2.display();

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}
