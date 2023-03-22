package games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameSpaceInvasionTest {

    @Test
    void deveCriarNovoJogoSpaceInvasion() {
        IGame game = GameFactory.obterGame("SpaceInvasion");
        assertEquals("Novo jogo criado", game.newGame());
    }

    @Test
    void deveSalvarJogoSpaceInvasion() {
        IGame game = GameFactory.obterGame("SpaceInvasion");
        assertEquals("Jogo salvo", game.saveGame());
    }

    @Test
    void deveCarregarJogoSpaceInvasion() {
        IGame game = GameFactory.obterGame("SpaceInvasion");
        assertEquals("Jogo carregado", game.loadGame());
    }
}
