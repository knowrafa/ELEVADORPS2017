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
public class Credencial {
    private ArrayList<ArrayList> credenciaisValidas;
    
    public Credencial(int numeroDePisos){
        credenciaisValidas = new ArrayList();
        for(int i=0; i <=  numeroDePisos; i++){
            credenciaisValidas.add(new ArrayList());
        
        }
        //IMPORTANTE !v!
        //credenciaisValidas.get(numeroDePisos).get(i);
    }
        public boolean verificaCredenciais(int pisoDestino){
     return false;   
    }

    
    
    public boolean isValid(int piso, String credencial){
        //credenciaisValidas.get(piso);
        return false;
    }
    
}
