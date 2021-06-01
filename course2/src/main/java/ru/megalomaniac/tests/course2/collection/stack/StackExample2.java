package ru.megalomaniac.tests.course2.collection.stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Britney");
        stringStack.push("Ashley");
        stringStack.push("Madonna");
        stringStack.push("Elizabeth");
        System.out.println(stringStack);
        // pop извлекает с удалением, peek показывает элемент на верху стека
        System.out.println("Stack peek"+stringStack.peek());
        while (!stringStack.isEmpty()) {
            System.out.println("Stack pop " + stringStack.pop());
            System.out.println(stringStack);
        }



    }
}
