package main.java.ru.ipolynkina.behavioral.iterator;

public class IteratorApp {
    public static void main(String[] args) {

        WordsAggregate words = new WordsAggregate();
        Iterator iterator = words.getIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
