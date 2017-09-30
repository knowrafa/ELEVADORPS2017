/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaelevador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class Credencial {
    private ArrayList<ArrayList<String>> credenciaisValidas;
    private int numeroDePisos;
    
    public Credencial(int numeroDePisos){
        this.numeroDePisos = numeroDePisos;
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

    public boolean needCredential(int piso){
        if(credenciaisValidas.get(piso).isEmpty()) return false;
        return true;
        
    }
    
    public String readCredential(){
        Scanner read = new Scanner(System.in);
        String credential = read.nextLine();
        return credential;
    }
    
    
    public boolean isValid(int piso, String credencial){
        
        if(piso > this.numeroDePisos || piso < 0)
            System.out.println("Piso Inválido");
        
        Iterator it = credenciaisValidas.get(piso).iterator();
        while(it.hasNext()){
            if(it.next()== credencial) return true;
        }
        if(credenciaisValidas.get(piso).isEmpty()) return true;
        return false;
    }
    
}
