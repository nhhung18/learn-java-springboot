package com.in28minute.learn_spring_framework;

import com.in28minute.learn_spring_framework.game.GameRunner;
import com.in28minute.learn_spring_framework.game.GamingConsole;
import com.in28minute.learn_spring_framework.game.PacmanGame;
import com.in28minute.learn_spring_framework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    //        var game = new SuperContraGame();
    //        var game = new MarioGame();
//    var game = new Pacman();
//    var gameRunner = new GameRunner(game);
//        gameRunner.run();

}
