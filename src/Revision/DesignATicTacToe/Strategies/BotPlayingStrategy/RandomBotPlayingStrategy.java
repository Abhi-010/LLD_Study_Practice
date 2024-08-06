package Revision.DesignATicTacToe.Strategies.BotPlayingStrategy;

import Revision.DesignATicTacToe.Models.Board;
import Revision.DesignATicTacToe.Models.Cell;
import Revision.DesignATicTacToe.Models.Move;
import Revision.DesignATicTacToe.Models.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Board board, Player player) {

        for(List<Cell> row :board.getBoard()){
            for(Cell cell : row){
                if(cell.getPlayer() == null){
                    return new Move(cell.getRow(), cell.getCol(),player);
                }
            }
        }
        return null;
    }
}
