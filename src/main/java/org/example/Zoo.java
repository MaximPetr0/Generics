package org.example;

import java.util.*;

class Zoo<T extends Animal> implements Iterable<T> {
    private final List<T> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public T getAnimal() {
        if (!animals.isEmpty()) {
            return animals.remove(animals.size() - 1);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals.toArray()) +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return !animals.isEmpty();
            }

            @Override
            public T next() {
                return getAnimal();
            }
        };
    }
}