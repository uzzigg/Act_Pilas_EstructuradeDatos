package com.tuorg.stack;

import java.util.NoSuchElementException;

/**
 * Pila genérica implementada con lista enlazada simple.
 * Sigue el principio LIFO (Last In, First Out). */


public class LinkedStack<T> {

    private Node<T> top;
    private int size;

    private static class Node<E> {
        E value;
        Node<E> next;
        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * Inserta un elemento en la cima (top) de la pila.
     * Esta es la operación 'push'. */

    public void push(T item) {
        top = new Node<>(item, top);
        size++;
    }

    /**
     * Elimina y devuelve el elemento que se encuentra en la cima (top) de la pila.
     * Esta es la operación 'pop'. */

    public T pop() {
        if (isEmpty()) throw new NoSuchElementException("La pila está vacía");
        T val = top.value;
        top = top.next;
        size--;
        return val;
    }

    /**
     * Devuelve el elemento que se encuentra en la cima (top) de la pila sin eliminarlo.
     * Esta es la operación 'peek'. */

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("La pila está vacía");
        return top.value;
    }

    /**
     * Verifica si la pila está vacía.
     * @return {@code true} si la pila no contiene elementos, {@code false} en caso contrario. */

    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Retorna el número de elementos contenidos actualmente en la pila. */

    public int size() {
        return size;
    }

    /**
     * Elimina todos los elementos de la pila, dejándola vacía. */

    public void clear() {
        top = null;
        size = 0;
    }
}