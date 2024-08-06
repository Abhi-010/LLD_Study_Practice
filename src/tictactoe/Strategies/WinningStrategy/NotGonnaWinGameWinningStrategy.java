package tictactoe.Strategies.WinningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Move;

public class NotGonnaWinGameWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        return false;
    }
}
