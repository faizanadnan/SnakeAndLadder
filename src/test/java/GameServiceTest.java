import com.model.GameStatus;
import com.model.Player;
import com.model.board.BasicBoard;
import com.model.board.BoardWithSnake;
import com.model.game.SnakeAndLadderGame;
import com.model.game.SnakeAndLadderSinglePlayer;
import com.service.GameBoardService;
import com.service.GameBoardServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GameServiceTest {

    @Test
    public void testMoveForSinglePlayer() {
        // Given
        GameStatus gameStatus = new GameStatus(0, "In Progress");
        Player player1 = new Player("Player1", 13, gameStatus);

        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderSinglePlayer(BasicBoard.getBasicBoard(), player1);

        // When
        GameBoardService gameBoardService = new GameBoardServiceImpl(snakeAndLadderGame);
        gameBoardService.play(player1);
        player1.setGameAction(2);
        GameStatus gs = gameBoardService.play(player1);
        // Then
        Assert.assertEquals(15, gs.getCurrentStatus());
    }

    @Test
    public void testMoveWithSnake() {
        // Given
        GameStatus gameStatus = new GameStatus(0, "In Progress");
        Player player1 = new Player("Player1", 14, gameStatus);
        BasicBoard basic = BoardWithSnake.getBasic();
        Map<Integer, Integer> specialMoves = new HashMap<>();
        specialMoves.put(14, 7);
        basic.setSpecialMoves(specialMoves);

        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderSinglePlayer(basic, player1);

        // When
        GameBoardService gameBoardService = new GameBoardServiceImpl(snakeAndLadderGame);
        gameBoardService.play(player1);
        player1.setGameAction(2);
        GameStatus gs = gameBoardService.play(player1);
        // Then
        Assert.assertEquals(9, gs.getCurrentStatus());
    }
}
