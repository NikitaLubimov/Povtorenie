package org.example.geekbrains;

import org.example.geekbrains.MyCollection.ArrayList.ArrayList;
import org.example.geekbrains.MyCollection.LinkedList.LinkedList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.print();
        linkedList.remove(1);
        linkedList.print();
    }
}