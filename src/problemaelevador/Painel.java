/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaelevador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class Painel {
    private ArrayList botoes;
    private ArrayList<Trilha> trilhas;
    private Credencial credenciais;
    private int numeroPiso;
    
    public Painel(int numeroPiso, Credencial credenciais, ArrayList<Trilha> trilhas){
        this.numeroPiso = numeroPiso;
        this.credenciais = credenciais;
          
    }
    
    public int chamaElevador(int pisoAtual, int pisoDestino){
        String credencial;
        if(credenciais.needCredential(pisoDestino)){
            credencial = credenciais.readCredential();
            if(!credenciais.isValid(pisoDestino, credencial))
                return -1;
        }
        
        return findNearElevator(pisoAtual);
        
    }
    
    public boolean lerCredenciais(int piso){
        return false;
    }
        
    public int findNearElevator(int pisoAtual){
        int near = -1;
        
        Iterator itr = trilhas.iterator();
        
        return near;
    }
}
