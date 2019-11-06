package com.mycompany.aula0210.entidades;

import java.util.ArrayList;
import java.util.List;


public class Palavra {
    private String nome;
    
    
    List<Synset> listasSynsetsVerbos = new ArrayList<>();
    List<Synset> listasSynsetsNouns = new ArrayList<>();
    List<Synset> listasSynsetsAdjetivo = new ArrayList<>();
    List<Synset> listasSynsetsAdverbio = new ArrayList<>();
    
    public void Palavra(String nome){
        
        setNome(nome);   
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
