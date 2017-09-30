package problemaelevador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList pisos;
    private Credencial credenciais;
    private ArrayList<Trilha> trilhas;
    
    public Edificio(String nome, String endereco, int quantidadePisos, int quantidadeTrilhas ,Credencial credenciais, float pesoMax){
        int i;
        setNome(nome);
        setEndereco(endereco);
        this.credenciais = credenciais;
        for(i=0; i < quantidadeTrilhas; i++){
            trilhas.add(new Trilha(i+1, quantidadePisos,  new Elevador(pesoMax, i+1)));
        }
        for(i=0; i <= quantidadePisos; i++){
            pisos.add(new Piso(i));
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
