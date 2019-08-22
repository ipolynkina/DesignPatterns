package main.java.ru.ipolynkina.behavioral.iterator;

public class WordsAggregate implements Aggregate{

    private String[] words = {"Write", "once", "Run", "anywhere"};

    @Override
    public Iterator getIterator() {
        return new WordsIterator();
    }

    private class WordsIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < words.length;
        }

        @Override
        public Object next() {
            return words[index++];
        }
    }
}
