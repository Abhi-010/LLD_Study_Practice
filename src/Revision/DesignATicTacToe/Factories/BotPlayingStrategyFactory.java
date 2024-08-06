package Revision.DesignATicTacToe.Factories;

import Revision.DesignATicTacToe.Models.Enums.BotDifficultyLevel;
import Revision.DesignATicTacToe.Strategies.BotPlayingStrategy.BotPlayingStrategy;
import Revision.DesignATicTacToe.Strategies.BotPlayingStrategy.EasyBotPlayingStrategy;
import Revision.DesignATicTacToe.Strategies.BotPlayingStrategy.HardBotPlayingStrategy;
import Revision.DesignATicTacToe.Strategies.BotPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyBasedOnDifficultyLevel(BotDifficultyLevel botdifficulty){
        if(botdifficulty.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }
        else if(botdifficulty.equals(BotDifficultyLevel.HARD)){
            return new HardBotPlayingStrategy();
        }
        else if(botdifficulty.equals(BotDifficultyLevel.MEDIUM)){
            return new HardBotPlayingStrategy();
        }
        return new RandomBotPlayingStrategy();

    }

}
