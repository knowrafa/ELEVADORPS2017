/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Piso> pisos = new ArrayList<Piso>();;
    private Credencial credenciais;
    private ArrayList<Trilha> trilhas = new ArrayList<Trilha>();
    
    
    /** Construtor de Edifício
     * 
     * @param nome
     * @param endereco
     * @param quantidadePisos
     * @param quantidadeTrilhas
     * @param credenciais
     * @param pesoMax 
     * 
     * Instancia todos os pisos, trilhas e elevadores.
     */
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
    /** Define a música do elevador
     * 
     * @param numTrilha
     * @param music 
     */
    public void setMusicInElevator(int numTrilha, String music){
        trilhas.get(numTrilha-1).setElevatorMusic(music);
    }
    
     /** Acessa o elevador
      * 
      * @param pisoAtual
      * @param pisoDestino
      * @return 
      * 
      * Método criado para o acesso na main.
      */
    public int acessElevatorAt(int pisoAtual, int pisoDestino){
        System.out.println("ENTROU AQUI");
        Trilha trilha = pisos.get(pisoAtual).callPainel(pisoAtual, pisoDestino);
        if(trilha == null) return -1;
        try {
            trilha.proximoAndar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Edificio.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        return trilha.getNumeroTrilha();
        
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
