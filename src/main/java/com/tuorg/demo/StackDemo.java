package com.tuorg.demo;

import com.tuorg.stack.LinkedStack;

public class StackDemo {
    public static void main(String[] args) {
        LinkedStack<String> pila = new LinkedStack<>();
        pila.push("google.com");
        pila.push("openai.com");
        pila.push("stackoverflow.com");

        System.out.println("Elemento superior: " + pila.peek());

        while (!pila.isEmpty()) {
            System.out.println("Pop -> " + pila.pop());
        }
    }
}
