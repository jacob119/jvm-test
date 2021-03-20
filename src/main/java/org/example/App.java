package org.example;

/**
 * Hello world!
 */
public class App {
    private static int i = 0;
    public static void main(String[] args) throws InterruptedException {

        Person p = null;
        while (true) {
            Thread.sleep(1000);
            p = new Person("Jacob", i++);
            System.out.println(p);
        }
    }
}

class Person{
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
}