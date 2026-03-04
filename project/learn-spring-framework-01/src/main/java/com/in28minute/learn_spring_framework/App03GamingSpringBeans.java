package com.in28minute.learn_spring_framework;

import com.in28minute.learn_spring_framework.game.GameRunner;
import com.in28minute.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

    //        var game = new SuperContraGame();
    //        var game = new MarioGame();
//            var game = new Pacman();
//            var gameRunner = new GameRunner(game);
//            gameRunner.run();

        try (var context = new AnnotationConfigApplicationContext
                (GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
