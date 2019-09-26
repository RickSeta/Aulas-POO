
package jogodado;

import java.util.Scanner;

public class JogoDado {
   

    public static void main(String[] args) {
        
        Boolean continua;
        Partida.vitorias = 0;
        Partida.derrotas = 0;
        Partida.novoJogo(true);
        do{

            Scanner entrada = new Scanner(System.in);

            System.out.println("Se quiser jogar denovo tecle sim. ");

            String jogar = entrada.nextLine();
            if(jogar.equals("sim")){
                continua = true;
                Partida.novoJogo(continua);
            }else{
                continua = false;
            }
        }while(continua);
        
        System.out.println("Voce venceu " + Partida.vitorias + " partidas e perdeu " + Partida.derrotas + " partidas");
    }
    
}
