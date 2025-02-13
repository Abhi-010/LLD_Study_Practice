package tictactoe.models;


import tictactoe.exceptions.DuplicateSymbolException;
import tictactoe.Factories.GameWinningStrategyFactory;
import tictactoe.Strategies.WinningStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;
    private int filledCells ;

    private Game(){

    }
    public static Builder getBuilder() {
        return new Builder();
    }

    public List<Player> getPlayers() {
        return players;
    }
    public Board getBoard() {
        return board;
    }
    public List<Move> getMoves() {
        return moves;
    }
    public List<GameWinningStrategy> getGameWinningStrategies() {
        return gameWinningStrategies;
    }
    public int getLastMovedPlayerIndex() {
        return lastMovedPlayerIndex;
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }
    public Player getWinner() {
        return winner;
    }
    public int getFilledCells() {
        return filledCells;
    }
    public void makeMove(){
        board.display();

        this.lastMovedPlayerIndex += 1;
        this.lastMovedPlayerIndex %= players.size();
        try{
            Move potentialMove = this.players.get(this.lastMovedPlayerIndex).makeMove(this.board);
            if (this.board.getCell(potentialMove.getRow(), potentialMove.getColumn()).getPlayer() != null) {
                System.out.println("Bad Move Try Again!");
                return;
            }
            this.moves.add(potentialMove);

            this.board.getCell(potentialMove.getRow(),potentialMove.getColumn())
                    .setPlayer(this.players.get(lastMovedPlayerIndex));

            filledCells += 1;
            //Win
            for(GameWinningStrategy gameWinningStrategy : gameWinningStrategies){
                if(gameWinningStrategy.checkVictory(board,potentialMove)){
                    gameStatus = GameStatus.ENDED;
                    winner = this.players.get(lastMovedPlayerIndex);
                }
            }
            //Draw
            if(filledCells == ((this.players.size()+1)*(this.players.size()+1))){
                gameStatus = GameStatus.DRAW;
                return ;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
    }

    public static class Builder{
        private List<Player> players;
        private List<GameWinningStrategy> gameWinningStrategies;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setGameWinningStrategies(List<GameWinningStrategyName> gameWinningStrategiesNames) {
            this.gameWinningStrategies = new ArrayList<>();

            for (GameWinningStrategyName gameWinningStrategyName: gameWinningStrategiesNames) {
                this.gameWinningStrategies.add(GameWinningStrategyFactory.
                        getGameWinningStrategyByName(gameWinningStrategyName));

            }
            return this;
        }
        public Game build(){
            Set<Character> alreadyExistingCharacters = new HashSet<>();
            for(Player player:players){
                if(alreadyExistingCharacters.contains(player.getSymbol().getCharacter())){
                    throw new DuplicateSymbolException(player.getSymbol().getCharacter());
                }
                alreadyExistingCharacters.add(player.getSymbol().getCharacter());
            }

            Game game = new Game();
            game.gameStatus = GameStatus.IN_PROGRESS;
            game.gameWinningStrategies = gameWinningStrategies;
            game.players = players;
            game.moves = new ArrayList<>();
            game.board = new Board(players.size()+1);
            game.lastMovedPlayerIndex = -1;
            return game;
        }
    }
}

//Game has a lot of attributes
//Also it needs validation : Every player must have different symbol
//etc..
