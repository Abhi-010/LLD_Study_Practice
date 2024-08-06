package tictactoe.Factories;

import tictactoe.Strategies.WinningStrategy.BotPlayingStrategy;
import tictactoe.Strategies.WinningStrategy.RandomBotPlayingStrategy;
import tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel botDifficultyLevel)
    {
        return new RandomBotPlayingStrategy();
    }
}
