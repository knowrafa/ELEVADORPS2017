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
    private ArrayList<Trilha> trilhas = new ArrayList<Trilha>();
    private Credencial credenciais;
    private int numeroPiso;
    
    public Painel(int numeroPiso, Credencial credenciais, ArrayList<Trilha> trilhas){
        this.numeroPiso = numeroPiso;
        this.credenciais = credenciais;
        this.trilhas = trilhas;  
    }
    
    public Trilha chamaElevador(int pisoAtual, int pisoDestino){
        String credencial;
        if(credenciais.needCredential(pisoDestino)){
            credencial = credenciais.readCredential();
            if(!credenciais.isValid(pisoDestino, credencial))
                return null;
        }
        
        Trilha nearTrilha = findNearElevator(pisoAtual);
        System.out.println("O Elevador será: " + nearTrilha.getNumeroTrilha());
        if(nearTrilha != null) nearTrilha.adicionaRota(pisoAtual, pisoDestino);
        
        return nearTrilha;
    }
        
    public Trilha findNearElevator(int pisoAtual){
        /*
        int near = -1;
        Trilha lastTrilha;
        Trilha nearTrilha = null;
        Iterator itr = trilhas.iterator();
        
        while(itr.hasNext()){
            lastTrilha = (Trilha)itr.next();
            int lastValue = lastTrilha.ultimoAndarDaFila();
            if(near == -1) { 
                near = lastValue;
                nearTrilha = lastTrilha;
            }
            else {
                if((int)abs(near-pisoAtual) > (int)abs(lastValue-pisoAtual)) { 
                    near = lastValue;
                    nearTrilha = lastTrilha;
                }
            }
        }
        return nearTrilha;
    }
    */
        Iterator itr = trilhas.iterator();
        Trilha nearTrilha=(Trilha)itr.next();
        Trilha nextTrilha;
        int nearDiference;
        int nextDiference;
        while(itr.hasNext())
        {
            nearDiference = (nearTrilha.getElevador().getAndarAtual() - pisoAtual);
            nextTrilha=(Trilha)itr.next();
            nextDiference = (nextTrilha.getElevador().getAndarAtual() - pisoAtual);
            
            if((int)abs(nearDiference) > (int)abs(nextDiference) || (nearTrilha.getElevador().isOcupado() && !(nextTrilha.getElevador().isOcupado()))) nearTrilha = nextTrilha;
        }
        return nearTrilha;
    }
}
