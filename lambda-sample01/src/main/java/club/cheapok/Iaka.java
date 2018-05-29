package club.cheapok;

import club.cheapok.entity.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Iaka {
    public static void main(String[] args) {
        Apple appl = new Apple("red", 3.14);
        List<Apple> inventory = new ArrayList();
        inventory.add(appl);
        inventory.add(new Apple("green", 4.5));
        inventory.add(new Apple("green", 2.5));
        inventory.add(new Apple("golden", 1.5));
        inventory.add(new Apple("green", 4.0));
        inventory.forEach(a->a.getColor().equals("green"));


        inventory.forEach(System.out::println);
        inventory.forEach(x -> System.out.println(x));
        inventory.forEach((x) -> System.out.println(x));
        inventory.forEach((x) -> { System.out.println(x); return;});
        Consumer

    }
}
