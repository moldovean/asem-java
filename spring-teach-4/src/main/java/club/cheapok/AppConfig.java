package club.cheapok;

import club.cheapok.service.MuchBetterPlayerGenService;
import club.cheapok.service.PlayerGenService;
import club.cheapok.service.TeamGenService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    TeamGenService provideTeamGenService() {
        return new TeamGenService();
    }

    @Bean
    PlayerGenService whatever() {
        return new MuchBetterPlayerGenService();
    }

}
