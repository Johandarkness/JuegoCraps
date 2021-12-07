package JuegoCraps;

import java.util.Random;

/**
 * Class Dado generate a random value between 1 and 6
 * @author Johan Loaiza 202040882-3743
 * @version  v 1.0.0 date 1/12/2021
 */
public class Dado {
    private int cara;

    /**
     * Methos that generate a random value to cara
     * @return number between (1,6)
     */
    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
