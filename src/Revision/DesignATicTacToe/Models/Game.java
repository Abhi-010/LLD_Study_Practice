package Revision.DesignATicTacToe.Models;

import Revision.DesignATicTacToe.Factories.GameWinningStrategyFactory;
import Revision.DesignATicTacToe.Models.Enums.GameStatus;
import Revision.DesignATicTacToe.Models.Enums.GameWinningTypeName;
import Revision.DesignATicTacToe.Strategies.GameWinningStrategy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Player> playerList;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> winningStrategyList;
    private int LastMovedPlayerIndex=-1;
    private GameStatus gameStatus;
    private String playerWinner;
    private int filledCells = 0;

    private Game(){}

    public List<Player> getPlayerList() {
        return playerList;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<GameWinningStrategy> getWinningStrategyList() {
        return winningStrategyList;
    }

    public int getLastMovedPlayerIndex() {
        return LastMovedPlayerIndex;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public String getPlayerWinner() {
        return playerWinner;
    }

    public int getFilledCells() {
        return filledCells;
    }


    public void makeMove(){
        board.display();
        this.LastMovedPlayerIndex+=1;
        this.LastMovedPlayerIndex %= playerList.size();
        System.out.println(playerList.get(LastMovedPlayerIndex).getName() + "'s turn");
        Move potentialMove = this.playerList.get(this.LastMovedPlayerIndex).makeMove(this.board);

        //Validate Move
        if(this.board.getCell(potentialMove.getRow(),potentialMove.getCol()).getPlayer() != null){
             System.out.println("Bad Move, try again");
             return ;
        }
        this.moves.add(potentialMove);
        this.board.getCell(potentialMove.getRow(),potentialMove.getCol()).
                setPlayer(playerList.get(LastMovedPlayerIndex));
        filledCells=+1;

        //check for win
        for(GameWinningStrategy gameWinningStrategy : winningStrategyList){
            if(gameWinningStrategy.checkVictory(board,potentialMove) == true){
                this.gameStatus = GameStatus.ENDED;
                System.out.println("Winner is " + playerList.get(LastMovedPlayerIndex).getName());
            }
        }
        if(filledCells == this.playerList.size()+1*this.playerList.size()+1){
            this.gameStatus = GameStatus.DRAW;
        }

    }



    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private List<Player> playerList;
        private List<GameWinningStrategy> gameWinningStrategies;

        public Builder setPlayerList(List<Player> playerList) {
            this.playerList = playerList;
            return  this;
        }

        public Builder setWinningStrategyList(List<GameWinningTypeName> gameWinningTypeName) {
               this.gameWinningStrategies = new ArrayList<>();
               int size = gameWinningTypeName.size();
               for(int i = 0 ; i < size ; i++){
                   GameWinningTypeName winningTypeName = gameWinningTypeName.get(i);
                   this.gameWinningStrategies.add(GameWinningStrategyFactory.
                           getGameWinningStrategy(winningTypeName));
               }
                return this;
        }

        public Game build(){
            //validation
            Set<Character> alreadyExistingCharacters = new HashSet<>();
            for(Player player : playerList){
                if(alreadyExistingCharacters.contains(player.getSymbol().getCharacter())){
                    //throw
                }
                alreadyExistingCharacters.add(player.getSymbol().getCharacter());
            }
            Game game = new Game();
            game.gameStatus = GameStatus.IN_PROGRESS;
            game.winningStrategyList= gameWinningStrategies;
            game.playerList = playerList;
            game.moves  = new ArrayList<>();
            game.board = new Board(playerList.size()+1);
            return game;
        }
    }
}


