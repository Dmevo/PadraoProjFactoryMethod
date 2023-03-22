package games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTetrisTest {

    @Test
    void deveCriarNovoJogoTetris() {
        IGame game = GameFactory.obterGame("Tetris");
        assertEquals("Novo jogo criado", game.newGame());
    }

    @Test
    void deveSalvarJogoTetris() {
        IGame game = GameFactory.obterGame("Tetris");
        assertEquals("Jogo salvo", game.saveGame());
    }

    @Test
    void deveCarregarJogoTetris() {
        IGame game = GameFactory.obterGame("Tetris");
        assertEquals("Jogo carregado", game.loadGame());
    }
}
