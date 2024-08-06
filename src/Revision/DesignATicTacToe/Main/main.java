package Revision.DesignATicTacToe.Main;

import Revision.DesignATicTacToe.Factories.BotDifficultyLevelFactory;
import Revision.DesignATicTacToe.Factories.GameWinningStrategyNameEnumFactory;
import Revision.DesignATicTacToe.Factories.PlayerFactory;
import Revision.DesignATicTacToe.Models.Enums.BotDifficultyLevel;
import Revision.DesignATicTacToe.Models.Enums.GameStatus;
import Revision.DesignATicTacToe.Models.Enums.GameWinningTypeName;
import Revision.DesignATicTacToe.Models.Game;
import Revision.DesignATicTacToe.Models.Player;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Players?");
        int numberOfPlayer = Integer.parseInt(br.readLine());

        System.out.println("How many Bots ?");
        int numberOfBots = Integer.parseInt(br.readLine());

        List<Player> playerList = new ArrayList<>();

        //This is for Bot
        for(int i = 0 ; i < numberOfBots ; i++){
            System.out.println("What is the name of the Bot");
            String botName = br.readLine();

            System.out.println("Symbol of Bot " + (i + 1));
            Character character = scanner.next().charAt(0);

            System.out.println("Difficulty of Bot " + (i+1));
            String difficultyLevel = scanner.next();
            BotDifficultyLevel botDifficultyLevel = BotDifficultyLevelFactory.getBotDifficultlyLevel(difficultyLevel);
            playerList.add(PlayerFactory.createBotPlayer(botName,character,botDifficultyLevel));
        }

        for(int i = numberOfBots ; i < numberOfPlayer ; i++){
            System.out.println("Name of Player " + (i - numberOfBots + 1));
            String name = br.readLine();

            System.out.println("Symbol of Player " + (i - numberOfBots + 1));
            Character character = scanner.next().charAt(0);

            playerList.add(PlayerFactory.createHumanPlayer(name,character));
        }

        System.out.println("How many winning strategis?");
        Integer winningStrategiesCount = Integer.parseInt(br.readLine());

        List<GameWinningTypeName> gameWinningTypeNamesList = new ArrayList<>();

        for(int i = 0 ; i < winningStrategiesCount ; i++){
            System.out.println("Name Strategy");
            String winningStrategyName = br.readLine();

            GameWinningTypeName gameWinningTypeName =
                    GameWinningStrategyNameEnumFactory.
                            getGameWinningStrategyNameFromString(winningStrategyName);
            gameWinningTypeNamesList.add(gameWinningTypeName);
        }
        System.out.println(gameWinningTypeNamesList.get(0));

          Game game = Game.getBuilder()
                        .setWinningStrategyList(gameWinningTypeNamesList)
                                .setPlayerList(playerList)
                                        .build();

        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            game.makeMove();
        }
    }

}
