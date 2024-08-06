package Revision.DesignATicTacToe.Strategies;

import Revision.DesignATicTacToe.Models.Board;
import Revision.DesignATicTacToe.Models.Move;

public class NotGonnaWinGameWinningStrategy implements GameWinningStrategy{
    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        return true;
    }
}
