package Revision.DesignATicTacToe.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public Board(int dimension){
        this.dimension = dimension;
        board = new ArrayList<>();
        for(int i = 0 ; i < dimension ;i++){
            this.board.add(new ArrayList<>());
            for(int j = 0 ; j < dimension ; j++){
                this.board.get(i).add(new Cell());
            }
        }
    }

    public Cell getCell(int row, int col){
        return this.board.get(row).get(col);
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void display(){
        for(List<Cell> row : board){
            for(Cell cell : row){
                if(cell.getPlayer() == null){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(cell.getPlayer().getSymbol().getCharacter() + " ");
                }
            }
            System.out.println();
        }
    }

}
