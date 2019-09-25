
package jogodado;

import java.util.Random;

public class Randomizador {
    
    static Random gerador = new Random();
    
    public static int gerarNum(int num){
    
        return gerador.nextInt(num);
    }
    
}
