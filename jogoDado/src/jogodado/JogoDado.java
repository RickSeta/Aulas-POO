
package jogodado;

import java.util.Scanner;

public class JogoDado {
   

    public static void main(String[] args) {
        
        Boolean continua;
        Partida.novoJogo(true);
        do{

            Scanner entrada = new Scanner(System.in);

            System.out.println("Se quiser jogar denovo tecle sim. ");

            String jogar = entrada.nextLine();
            if(!jogar.equals("Sim") || !jogar.equals("sim") || !jogar.equals("s")){
                continua = true;
                Partida.novoJogo(continua);
            }else{
                continua = false;
            }
        }while(continua);
        
        System.out.println("Voce venceu " + Partida.vitorias + " partidas e perdeu " + Partida.derrotas + " partidas");
    }
    
}
