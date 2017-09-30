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
    private Vector<Vector> credenciaisValidas;
    
    public Edificio(String nome, String endereco, int quantidadePisos, Vector<Vector> credenciaisValidas){
        int i;
        setNome(nome);
        setEndereco(endereco);
        this.credenciaisValidas = credenciaisValidas;
        
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
