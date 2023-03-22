package games;

public class GameFactory {

    public static IGame obterGame(String game) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("games.Game" + game);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Game Inexistente");
        }
        if (!(objeto instanceof IGame)) {
            throw new IllegalArgumentException("Game inválido");
        }
        return (IGame) objeto;
    }
}
