package org.example;

public class Animal {
    private String name;

    public <T>  T printInfo(T additionalInfo) {
        System.out.println("Name: " + name);
        System.out.println("Additional Info: " + additionalInfo);
    return additionalInfo;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
