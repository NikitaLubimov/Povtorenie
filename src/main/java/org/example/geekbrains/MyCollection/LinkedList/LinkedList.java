package org.example.geekbrains.MyCollection.LinkedList;

public class LinkedList<T> {

    private Node<T> head;

    public void add(T value) {
        if (this.head == null) {
            this.head = new Node<T>();
            this.head.setData(value);
        } else {
            Node<T> newNode = new Node<T>();
            newNode.setData(value);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public void print() {
        if (this.head != null) {
            Node<T> currentNode = this.head;
            while (currentNode != null) {
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("END");
        } else {
            System.out.println("Linked list is empty.");
        }
    }

    public void remove(T value) {
        if (this.head != null) {
            Node<T> currentNode = this.head;
            Node<T> previousNode = this.head;
            while (currentNode != null) {
                if (currentNode.getData() == value) {
                    previousNode.setNext(currentNode.getNext());
                    System.out.println("Deleted first node with value " + value);
                    break;
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

}
