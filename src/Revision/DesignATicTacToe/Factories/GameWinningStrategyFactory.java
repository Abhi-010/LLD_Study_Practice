package Revision.DesignATicTacToe.Factories;

import Revision.DesignATicTacToe.Models.Enums.GameWinningTypeName;
import Revision.DesignATicTacToe.Strategies.GameWinningStrategy;
import Revision.DesignATicTacToe.Strategies.NotGonnaWinGameWinningStrategy;
import Revision.DesignATicTacToe.Strategies.RowLevelWinningStrategy;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy getGameWinningStrategy
            (GameWinningTypeName gameWinningTypeName){

        if(gameWinningTypeName.equals(GameWinningTypeName.ROW)){
            System.out.println("Debug...row");
            return new RowLevelWinningStrategy();
        }
        System.out.println("Debug...not row");
        return new NotGonnaWinGameWinningStrategy();
    }

}
