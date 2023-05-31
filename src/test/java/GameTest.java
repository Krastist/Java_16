import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game game = new Game();
    Player Alex = new Player(1, "Алекс", 10);
    Player Bill = new Player(2, "Билл", 11);
    Player Chak = new Player(3, "Чак", 11);

    @BeforeEach
    public void addPlayer() {
        game.register(Alex);
        game.register(Bill);
        game.register(Chak);
    }
    @Test
    public void player1WinTest() {

        int expected = 1;
        int actual = game.round("Билл", "Алекс");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void player2WinTest() {

        int expected = 2;
        int actual = game.round("Алекс", "Билл");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void playersDrawTest() {

        int expected = 0;
        int actual = game.round("Билл", "Чак");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void player1NotRegisteredTest() {

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Вова", "Билл")
        );
    }

    @Test
    public void player2NotRegisteredTest() {

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Билл", "Вова")
        );
    }

    @Test
    public void playersNotRegisteredTest() {

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Вова", "Саша")
        );
    }
}
