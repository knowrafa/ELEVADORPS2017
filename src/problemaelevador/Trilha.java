/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import static java.lang.Thread.sleep;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.SortedSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trilha {
    private Elevador elevador;
    private int numeroTrilha;
    private int quantidadeDePisos;
    private Queue myQueue = new LinkedList();

    /**O Construtor para as trilhas oficiais.
     * 
     * @param numeroTrilha
     * @param quantidadePisos
     * @param elevador 
     */
    public Trilha(int numeroTrilha, int quantidadePisos, Elevador elevador){
         this.numeroTrilha = numeroTrilha;
         this.elevador = elevador;
         this.quantidadeDePisos = quantidadePisos;
    }

    /**Construtor para situações de criação de trilhas para manipulação.
     * C
     * @param numeroTrilha 
     */
    public Trilha(int numeroTrilha){
        this.numeroTrilha = numeroTrilha;
    }

    /**Define aquela música, preferencialmente JAZZ.
     * 
     * 
     * @param music 
     */
    public void setElevatorMusic(String music){
        elevador.setMusicaElevador(music);
    }
    
    /**Adiciona na rota da trilha os próximos pisos.
     * 
     * @param pisoPedido
     * @param pisoDestino 
     */
    public void adicionaRota(int pisoPedido, int pisoDestino) {
        try {
            myQueue.add(pisoPedido);
            myQueue.add(pisoDestino);
            //System.out.println("Rotas adicionadas");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
   
    /**Método para que o elevador receba o próximo piso.
     * 
     * @throws InterruptedException 
     */
    public void proximoAndar() throws InterruptedException {     
        new Thread() {   
            @Override
            public void run() {
                if((elevador.isOcupado())) return;
                while(!myQueue.isEmpty())
                {
                    try {
                         sleep(50);
                         if(!(elevador.isOcupado()))
                         {       
                                 int nextPiso = (int)myQueue.remove();
                                 elevador.moveElevador(nextPiso, numeroTrilha);
                         }                           
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Trilha.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
            }
        }.start();
    }
    
    /**Retorna o último andar da fila.
     * 
     * @return 
     */
    public int ultimoAndarDaFila() {
        Iterator itr = myQueue.iterator();
        int ultimoAndar = -1;
        while(itr.hasNext()) {
            ultimoAndar = (int)itr.next();
        }

        return ultimoAndar;
    }


    public int getNumeroTrilha() {
        return numeroTrilha;
    }

    public Elevador getElevador() {
        return elevador;
    }

    public void setElevador(Elevador elevador) {
        this.elevador = elevador;
    }

    public void setNumeroTrilha(int numeroTrilha) {
        this.numeroTrilha = numeroTrilha;
    }

    public int getQuantidadeDePisos() {
        return quantidadeDePisos;
    }

    public void setQuantidadeDePisos(int quantidadeDePisos) {
        this.quantidadeDePisos = quantidadeDePisos;
    }
}