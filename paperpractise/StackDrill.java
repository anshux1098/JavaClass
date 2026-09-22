import java.util.*;

public class StackDrill {

    public static void pushBracket(Stack<Character> stack, char bracket) {
        // TODO: Push the character onto the stack
        stack.push(bracket);
    }

    public static char popBracket(Stack<Character> stack) {
        // TODO: Pop and return the top character from the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        Stack<Character> bracketStack = new Stack<>();

        pushBracket(bracketStack, '(');
        pushBracket(bracketStack, '{');
        pushBracket(bracketStack, '[');

        System.out.println("Top element before pop: " + bracketStack.peek());
        
        char removed = popBracket(bracketStack);
        System.out.println("Popped: " + removed);
        System.out.println("New Top element: " + bracketStack.peek());
    }
}
