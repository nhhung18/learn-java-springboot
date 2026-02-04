package com.in28minute.learn_spring_framework;

import com.in28minute.learn_spring_framework.game.GameRunner;
import com.in28minute.learn_spring_framework.game.MarioGame;
import com.in28minute.learn_spring_framework.game.Pacman;
import com.in28minute.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {

//        var game = new SuperContraGame();
//        var game = new MarioGame();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
