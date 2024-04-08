import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class TaskThird {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Alice", 25));
        humans.add(new Human("Bob", 30));
        humans.add(new Human("Charlie", 35));
        humans.add(new Human("Alice", 25));

        humans.forEach(System.out::println );

        List<Human> filteredHumans = humans.stream()
                .filter(human -> human.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println("\n Filtered humans:");
        filteredHumans.forEach(System.out::println);

        humans.removeIf(human -> human.getAge() > 30);
        System.out.println("\n Remaining humans after deletion:");
        humans.forEach(System.out::println);

        List<Human> uniqueHumans = humans.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nUnique humans:");
        uniqueHumans.forEach(System.out::println);

    }
}
class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}