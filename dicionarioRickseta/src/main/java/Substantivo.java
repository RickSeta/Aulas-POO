package com.mycompany.aula0210.entidades;


import java.util.HashMap;
import java.util.Map;


public class Substantivo extends Synset {
         Map<String,Palavra> hiperonimo = new HashMap<>();
         Map<String,Palavra> hiponimo = new HashMap<>();
         Map<String,Palavra> meronimo = new HashMap<>();
         Map<String,Palavra> holonimo = new HashMap<>();
         
         
         public void adicionaNovo(String nomeLista, String chave, Palavra palavra){
             switch(nomeLista){
                 case "hiperonimo":
                     hiperonimo.put(chave, palavra);
                     
                     break;
                 case "hiponimo":
                     hiponimo.put(chave,palavra);
                     
                     break;
                 case "meronimo":
                     meronimo.put(chave,palavra);
                     
                     break;
                 case "holonimo":
                     holonimo.put(chave,palavra);
                     
                     break;
             }
         }
         
         
         public Boolean checaSeTem(String chave, String nomeLista){
             switch(nomeLista){
                 case "hiperonimo":
                     if (hiperonimo.containsKey(chave))
                        return true;
                 case "hiponimo":
                     if (hiponimo.containsKey(chave))
                        return true;
                 case "meronimo":
                     if (meronimo.containsKey(chave))
                        return true;
                 case "holonimo":
                     if (holonimo.containsKey(chave))
                        return true;
                 default:
                     return false;
             }
        }
}
