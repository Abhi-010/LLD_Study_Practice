package tictactoe.Strategies.WinningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public interface GameWinningStrategy {
    boolean checkVictory(Board board, Move lastMove);
}
