package tictactoe.Factories;

import tictactoe.Strategies.WinningStrategy.GameWinningStrategy;
import tictactoe.Strategies.WinningStrategy.NotGonnaWinGameWinningStrategy;
import tictactoe.models.GameWinningStrategyName;

public class GameWinningStrategyFactory {

   public static GameWinningStrategy getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName){
       return new NotGonnaWinGameWinningStrategy();
   }
}
