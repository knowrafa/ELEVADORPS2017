/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaelevador;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.SortedSet;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class Trilha {
    private Elevador elevador;
    private int numeroTrilha;
    //private int[] rota;
    Queue myQueue = new LinkedList();
    
   public Trilha(int numeroTrilha, int quantidadePisos, Elevador elevador){
        this.numeroTrilha = numeroTrilha;
        this.elevador = elevador;
        //rota = new int[quantidadePisos];        
   }

   public void adcionaRota(int numeroPiso) {
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
}