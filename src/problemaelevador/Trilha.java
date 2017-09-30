/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaelevador;

import java.util.SortedSet;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class Trilha {
    private Elevador elevador;
    private int numeroTrilha;
    private int[] rota;
    
   public Trilha(int numeroTrilha, int quantidadePisos, Elevador elevador){
        this.numeroTrilha = numeroTrilha;
        this.elevador = elevador;
        rota = new int[quantidadePisos];
   }
   
   public void adicionaRota(int numeroPiso){
       
       
   }

   
}
