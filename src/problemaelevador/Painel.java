/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

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
        Trilha lastTrilha;
        Iterator itr = trilhas.iterator();
        while(itr.hasNext()) {
            lastTrilha = (Trilha)itr.next();
            int lastValue = lastTrilha.ultimoAndarDaFila();
            if(near == -1) { near = lastValue; }
            else {
                if((int)abs(near-pisoAtual) > (int)abs(lastValue-pisoAtual)) { near = lastValue; }
            }
        }
        
        return near;
    }
}
