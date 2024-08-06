package Revision.DesignATicTacToe.Factories;

import Revision.DesignATicTacToe.Models.Bot;
import Revision.DesignATicTacToe.Models.Enums.BotDifficultyLevel;
import Revision.DesignATicTacToe.Models.Enums.PlayerType;
import Revision.DesignATicTacToe.Models.Player;
import Revision.DesignATicTacToe.Models.Symbol;

public class PlayerFactory {

    public static Player createHumanPlayer(String name, Character character){
        Symbol symbol = new Symbol();
        symbol.setCharacter(character);
        Player player = new Player();
        player.setPlayerType(PlayerType.HUMAN);
        player.setName(name);
        player.setSymbol(symbol);
        return player;
    }

    public static Player createBotPlayer(String name, Character character, BotDifficultyLevel botDifficultyLevel){
       Symbol s = new Symbol();
       s.setCharacter(character);
       Player player = new Bot(botDifficultyLevel);
       player.setSymbol(s);
       player.setName(name);
       player.setPlayerType(PlayerType.BOT);
       return player;


    }

}
