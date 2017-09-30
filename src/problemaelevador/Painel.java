/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaelevador;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class Painel {
    private ArrayList botoes;
    private Vector trilhas;
    private Credencial credenciais;
    
    public int chamaElevador(int pisoAtual, int pisoDestino){
        return findNearElevator(pisoAtual);
    }
    
    public int chamaElevador(int pisoAtual, int pisoDestino, String credencial){
        
        if(credenciais.isValid(pisoAtual, credencial)) return -1;
        else return findNearElevator(pisoAtual);
        
    }
    
    public boolean lerCredenciais(int piso){
        return false;
    }
        
    public int findNearElevator(int pisoAtual){
        
        return 1;
    }
}
