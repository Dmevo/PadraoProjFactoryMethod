package games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameFactoryTest {

    @Test
    void deveRetornarExcecaoParaGameInexistente(){
        try{
           IGame game = GameFactory.obterGame("Pong");
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Game Inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaGameInvalido() {
        try {
            IGame game = GameFactory.obterGame("PacMan");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Game inválido", e.getMessage());
        }
    }
}
