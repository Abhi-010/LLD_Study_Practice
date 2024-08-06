package tictactoe.Strategies.WinningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Move;
import tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
