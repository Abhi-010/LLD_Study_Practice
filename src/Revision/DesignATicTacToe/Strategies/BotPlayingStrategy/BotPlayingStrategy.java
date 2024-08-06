package Revision.DesignATicTacToe.Strategies.BotPlayingStrategy;

import Revision.DesignATicTacToe.Models.Board;
import Revision.DesignATicTacToe.Models.Move;
import Revision.DesignATicTacToe.Models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
