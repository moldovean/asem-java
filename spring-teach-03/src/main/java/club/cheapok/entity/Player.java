package club.cheapok.entity;

public class Player {
    private String name;
    private int age;

    public Player(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (this.name.equals("Adrian")) {
            return "AWESOME player on the field";
        }
        return "Boring Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
