package com.umlimiscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.stream.Stream;

public class WorkingWithQueues {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Munashe", 26));
        linkedList.add(new Person("Jojo", 26));
        linkedList.addFirst(new Person("TinTin", 26));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while ((personListIterator.hasNext())){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while ((personListIterator.hasPrevious())){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarketQueue = new LinkedList<>();
        supermarketQueue.add(new Person("Munashe", 26));
        supermarketQueue.add(new Person("Tinashe", 23));
        supermarketQueue.add(new Person("Prodo", 29));
        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
        System.out.println(supermarketQueue.poll());
        System.out.println(supermarketQueue.size());
        System.out.println(supermarketQueue.peek());
    }

    static  record Person(String name, int age){}
}
