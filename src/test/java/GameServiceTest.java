import com.model.GameStatus;
import com.model.Player;
import com.model.SnakeAndLadderGame;
import com.model.SnakeAndLadderSinglePlayer;
import com.service.GameBoardService;
import com.service.GameBoardServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class GameServiceTest {

    @Test
    public void testMoveDorSinglePlayer() {
        // Given
        GameStatus gameStatus = new GameStatus(0, "In Progress");
        Player player1 = new Player("Player1", 14, gameStatus);

        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderSinglePlayer();
        snakeAndLadderGame.setPlayer(player1);

        // When
        GameBoardService gameBoardService = new GameBoardServiceImpl(snakeAndLadderGame);
        gameBoardService.play(player1);
        player1.setGameAction(2);
        GameStatus gs = gameBoardService.play(player1);
        // Then
        Assert.assertEquals(16, gs.getCurrentStatus());
    }
}
