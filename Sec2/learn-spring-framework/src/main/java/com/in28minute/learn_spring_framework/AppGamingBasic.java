package com.in28minute.learn_spring_framework;

import com.in28minute.learn_spring_framework.game.GameRunner;
import com.in28minute.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {

        var superContraGame = new SuperContraGame();
//        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
