/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaelevador;

import java.util.Vector;

/**
 *
 * @author aluno
 */
public class Piso {
    private boolean ledSobe;
    private boolean ledDesce;
    private int numeroPiso;
    private boolean needCredencial;
    private Painel painel;
  
    
    public Piso(int numeroPiso, Painel novoPainel){
        this.numeroPiso = numeroPiso;
        painel = novoPainel;
    }
    
    public Trilha callPainel(int pisoAtual, int pisoDestino){
        return painel.chamaElevador(pisoAtual, pisoDestino);
        
    }
    
    public boolean isLedSobe() {
        return ledSobe;
    }

    public void setLedSobe(boolean ledSobe) {
        this.ledSobe = ledSobe;
    }

    public boolean isLedDesce() {
        return ledDesce;
    }

    public void setLedDesce(boolean ledDesce) {
        this.ledDesce = ledDesce;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public boolean isCredencial() {
        return needCredencial;
    }

    public void setCredencial(boolean credencial) {
        this.needCredencial = credencial;
    }

    public Painel getPainel() {
        return painel;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }
   
    public void defineCredentials(){
        
    }
    
}
