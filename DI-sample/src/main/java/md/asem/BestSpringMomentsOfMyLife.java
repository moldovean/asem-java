package md.asem;

import club.cheapok.entity.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BestSpringMomentsOfMyLife {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("winter/config-for-spring.xml");

        Player player = (Player) context.getBean("pl-10");
        System.out.println(player);

        PlayerEater eater = context.getBean(PlayerEater.class);
        System.out.println(eater.modifyPlayer());
    }
}
