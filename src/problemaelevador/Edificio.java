/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Piso> pisos = new ArrayList<Piso>();;
    private Credencial credenciais;
    private ArrayList<Trilha> trilhas = new ArrayList<Trilha>();
    
    public Edificio(String nome, String endereco, int quantidadePisos, int quantidadeTrilhas ,Credencial credenciais, float pesoMax){
        int i=0;
        setNome(nome);
        setEndereco(endereco);
        this.credenciais = credenciais;
        
        for(i=0; i < quantidadeTrilhas; i++){
            trilhas.add(new Trilha(i+1, quantidadePisos,  new Elevador(pesoMax)));
        }
        for(i=0; i <= quantidadePisos; i++){
            pisos.add(new Piso(i, new Painel(i, credenciais, trilhas)));
        }
    }
    
    public void setMusicInElevator(int numTrilha, String music){
        trilhas.get(numTrilha-1).setElevatorMusic(music);
    }
    
  //  public 
    public int acessElevatorAt(int pisoAtual, int pisoDestino){
        //int eleadorzin = 
        if(null!= pisos.get(pisoAtual).callPainel(pisoAtual, pisoDestino)) 
            return pisos.get(pisoAtual).callPainel(pisoAtual, pisoDestino).getNumeroTrilha();
        return -1;
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
