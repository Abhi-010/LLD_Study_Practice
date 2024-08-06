package Revision.DesignATicTacToe.Strategies;

import Revision.DesignATicTacToe.Models.Board;
import Revision.DesignATicTacToe.Models.Cell;
import Revision.DesignATicTacToe.Models.Move;

public class RowLevelWinningStrategy implements GameWinningStrategy{

    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        //X
        //row 2
        //col 2
        Integer row = lastMove.getRow();
        Integer col = lastMove.getCol();
        Character character = lastMove.getPlayer().getSymbol().getCharacter();
        for(int j = 0 ; j < board.getDimension() ; j++){
           if(j!=col){
               Cell cell = board.getCell(row,j);
               if(cell.getPlayer() != null){
                   if(cell.getPlayer().getSymbol().getCharacter() != character){
                       return false;
                   }
               }
               else{
                   return false;
               }
           }
        }
        return true;
    }
}
