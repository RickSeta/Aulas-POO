package jogodado;

public class Lancador {
    public static int lancadas;
    
    public static void lancar(Dado dado1, Dado dado2){
        dado1.setValor(Randomizador.gerarNum(6));
        dado2.setValor(Randomizador.gerarNum(6));
        
        Lancador.lancadas++;
    } 
    
}
