class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);

        Person person2 = new Person();

        person1.display();
        person2.display();
    }
}

