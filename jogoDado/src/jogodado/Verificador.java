package jogodado;

public class Verificador {
    public static int ponto;
    public static Boolean fim;
    
    public static int inicioDeJogo(int rolagem){
        
        fim = false;
        
        if(rolagem == 7 || rolagem == 11){
            System.out.println("\nParabens! Voce venceu de primeira!");
            Partida.vitorias++;
            return 1;
        }else if(rolagem == 2 || rolagem == 3 || rolagem == 12){
            System.out.println("\nInfelizmente voce perdeu de primeira...");
            Partida.derrotas++;
            return 0;
        }
        Verificador.ponto = rolagem;
        return 2;
    }
    
    public static int fimDeJogo(int rolagem){
        
        if (rolagem == ponto){
            fim = true;
            Partida.vitorias++;
            System.out.println("\nParabens, voce ganhou em ");
            return 1;
        }else if(rolagem == 7){
            fim = true;
            Partida.derrotas++;
            System.out.print("\nVoce perdeu em ");
            return 0;
        }
        return 2;
    }
    
    
    
    
}
