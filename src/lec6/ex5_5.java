package lec6;

import java.util.PriorityQueue;

/**
 * Черга з пріоритетами на основі "внутрішнього" порядку сортування
 */
public class ex5_5 {
    public static void main(String[] args) {

        // Create a Priority Queue
        PriorityQueue<Person> persons = new PriorityQueue<>();

        // Add items to a Priority Queue
        persons.add(new Person("Дмитро","Гулак-Травін"));
        persons.add(new Person("Артем","Гулак"));
        persons.add(new Person("Галина","Рудь"));
        persons.add(new Person("Павло","Дудар"));
        persons.add(new Person("Артем","Семиніжка"));

        // Remove items from the Priority Queue (as defined in class Person)
        while (!persons.isEmpty ()) {
            System.out.println (persons.remove ());
        }


    }
}