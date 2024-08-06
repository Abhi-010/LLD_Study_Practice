package tictactoe.Factories;

import tictactoe.models.BotDifficultyLevel;

public class BotDifficultyLevelFactory {
    public static BotDifficultyLevel getBotDifficultyLevelFactory(String name){
        if(name.equals("EASY")){
            return BotDifficultyLevel.EASY;
        }
        return BotDifficultyLevel.MEDIUM;
    }
}
