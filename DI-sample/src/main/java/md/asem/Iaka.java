package md.asem;

import club.cheapok.entity.Player;

public class Iaka {
    public static void main(String[] args) {
        ClassA classA = new ClassA("My String");
        System.out.println(classA);
        Player player = new Player("Adirna", 30);
        System.out.println(player);

        PlayerEater playerEater = new PlayerEater(new Player("Victor", 25));
        System.out.println(playerEater.modifyPlayer());

    }
}
