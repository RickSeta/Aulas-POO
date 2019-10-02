
import java.util.HashMap;
import java.util.Map;


public class Verbo extends Synset {
    Map<String,Palavra> hiperonimo = new HashMap<>();
    Map<String,Palavra> troponimo = new HashMap<>();
    Map<String,Palavra> entailment = new HashMap<>();
    
    public void adicionaNovo(String nomeLista, String chave, Palavra palavra){
             switch(nomeLista){
                 case "hiperonimo":
                     hiperonimo.put(chave, palavra);
                     break;
                 case "hiponimo":
                     troponimo.put(chave,palavra);
                     break;
                 case "meronimo":
                     entailment.put(chave,palavra);
                     break;
             }
         }
    
    
    public Boolean checaSeTem(){
             return true;
         }
}
