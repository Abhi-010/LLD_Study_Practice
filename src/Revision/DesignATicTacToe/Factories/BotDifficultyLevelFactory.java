package Revision.DesignATicTacToe.Factories;


import Revision.DesignATicTacToe.Models.Enums.BotDifficultyLevel;

public class BotDifficultyLevelFactory {

    public static BotDifficultyLevel getBotDifficultlyLevel(String name){
        if(name.equals(BotDifficultyLevel.EASY)){
            return BotDifficultyLevel.EASY;
        }
        else if(name.equals(BotDifficultyLevel.HARD)){
            return BotDifficultyLevel.HARD;
        }
        return BotDifficultyLevel.MEDIUM;
    }
}
