package Revision.DesignATicTacToe.Strategies;

import Revision.DesignATicTacToe.Models.Board;
import Revision.DesignATicTacToe.Models.Move;

public interface GameWinningStrategy {
    boolean checkVictory(Board board, Move lastMove);
}
