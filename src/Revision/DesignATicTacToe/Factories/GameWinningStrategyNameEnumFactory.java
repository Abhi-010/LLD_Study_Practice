package Revision.DesignATicTacToe.Factories;

import Revision.DesignATicTacToe.Models.Enums.GameWinningTypeName;

public class GameWinningStrategyNameEnumFactory {
    public static GameWinningTypeName getGameWinningStrategyNameFromString(String name){
        return GameWinningTypeName.ROW;
        /*
        if(name.equals(GameWinningTypeName.ROW)){
            return GameWinningTypeName.ROW;
        }
        else if(name.equals(GameWinningTypeName.COLUMN)){
            return GameWinningTypeName.COLUMN;
        }
        System.out.println("debug....");
        return GameWinningTypeName.DIAGONAL;
        *
         */
    }
}
