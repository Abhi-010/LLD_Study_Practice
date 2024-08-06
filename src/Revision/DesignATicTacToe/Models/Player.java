package Revision.DesignATicTacToe.Models;

import Revision.DesignATicTacToe.Models.Enums.PlayerType;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private String name;
    private PlayerType playerType;

    public Move makeMove(Board board){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What row(Starting from 0 till " + ( board.getDimension()-1) +")");
        Integer row = scanner.nextInt();

        System.out.println("What col(Starting from 0 till " + (board.getDimension()-1) + ")");
        Integer col = scanner.nextInt();
        return new Move(row,col,this);

    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
