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
    
    public Trilha(int numeroTrilha){
        this.numeroTrilha = numeroTrilha;
    }
    public Trilha(int numeroTrilha, int quantidadePisos, Elevador elevador){
         this.numeroTrilha = numeroTrilha;
         this.elevador = elevador;
         this.quantidadeDePisos = quantidadePisos;
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
   
    public void setElevatorMusic(String music){
        elevador.setMusicaElevador(music);
    }

    public void adicionaRota(int pisoPedido, int pisoDestino) {
        try {
            myQueue.add(pisoPedido);
            myQueue.add(pisoDestino);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void proximoAndar() throws InterruptedException {
        if(!elevador.isOcupado()) //Se o elevador estiver ocupado já existe uma thread rodando
        {        
            new Thread() {   
                @Override
                public void run() {
                    while(!myQueue.isEmpty())
                    {
                        try {
                             sleep(50);
                             if(!(elevador.isOcupado()))
                             {       
                                     int nextPiso = (int)myQueue.remove();
                                     System.out.println("Debug: " + nextPiso);
                                     elevador.moveElevador(nextPiso, numeroTrilha);
                             }                           
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Trilha.class.getName()).log(Level.SEVERE, null, ex);
                        }                    
                    }
                }
            }.start();
        }
    }

    public int ultimoAndarDaFila() {
        Iterator itr = myQueue.iterator();
        int ultimoAndar = -1;
        while(itr.hasNext()) {
            ultimoAndar = (int)itr.next();
        }

        return ultimoAndar;
    }
}