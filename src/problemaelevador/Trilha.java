/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.SortedSet;
import java.util.Vector;

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
   
   public void setElevatorMusic(String music){
       elevador.setMusicaElevador(music);
   }
   
   public void adicionaRota(int numeroPiso) {
       try {
           myQueue.add(numeroPiso);
       } catch (IllegalStateException e) {
           e.printStackTrace();
       }
   }
   
   public int proximoAndar() {      
       try {
           return (int)myQueue.remove();
       } catch(NoSuchElementException e) {
           e.printStackTrace();
       }
       return -1;
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