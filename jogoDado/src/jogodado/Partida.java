
package jogodado;

public class Partida {
    
    public static int numPartidas;
    public static int vitorias;
    public static int derrotas;
    
    public static void novoJogo(Boolean novo){
        if(novo){
            numPartidas++;
            jogo();
        }
    }
    
    private static void jogo(){
    
        Dado dado1 = new Dado();
        Dado dado2 = new Dado(); 
        
        
        int rodadas = 0;
        Lancador.lancadas = 0;
        Lancador.lancar(dado1, dado2);
        
        
        int rolagem = dado1.getValor() + dado2.getValor();
        int estado = Verificador.inicioDeJogo(rolagem);
        
        System.out.println("Seu primeiro rolamento foi " + rolagem);
        
        if(estado == 1){
            
            return;
        }else if(estado == 0){
            
            return;
        }
        do{
            rodadas++;
            Lancador.lancar(dado1, dado2);
            rolagem = dado1.getValor() + dado2.getValor();
            
            System.out.print("\nRolando... \n Voce rolou " + rolagem);
            
            Verificador.fimDeJogo(rolagem);
            
            
        
        }while(!Verificador.fim);
        
        System.out.println(rodadas + " rodadas");
    
}
    
    
}
