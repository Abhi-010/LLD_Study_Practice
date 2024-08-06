package Revision.DesignATicTacToe.Models;


import Revision.DesignATicTacToe.Factories.BotPlayingStrategyFactory;
import Revision.DesignATicTacToe.Models.Enums.BotDifficultyLevel;
import Revision.DesignATicTacToe.Strategies.BotPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player {
    BotDifficultyLevel botDifficultyLevel ;
    BotPlayingStrategy botPlayingStrategy ;
    public Bot(BotDifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.
                getBotPlayingStrategyBasedOnDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        return botPlayingStrategy.makeMove(board,this);
    }
}
