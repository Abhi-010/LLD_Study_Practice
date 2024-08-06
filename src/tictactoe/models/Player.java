package tictactoe.models;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private PlayerType playerType;
    private String name;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Move makeMove(Board board){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What row(starting from 1) and column(starting from 1)");
        Integer row = scanner.nextInt();
        Integer col = scanner.nextInt();

        if(row >= board.getDimension() || col >= board.getDimension()){
            throw new RuntimeException("Invalid Row or Col");
        }

        Move move = new Move(row,col,this);
        return move;
    }

}
