/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Elevador {
    private float capacidade;
    private boolean botaoTerreo;
    private int andarAtual;
    private boolean ocupado;
    private boolean subindo;
    private boolean descendo;
    private Trilha trilha;
    private float peso;
    
    public Elevador(float capacidade){
        this.capacidade=capacidade;
        this.andarAtual=0;
        this.subindo=false;
        this.descendo=false;
        this.ocupado=false;
        this.botaoTerreo=false;
        //setTrilha(trilha);
    }
    
    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isBotaoTerreo() {
        return botaoTerreo;
    }

    public void setBotaoTerreo(boolean botaoTerreo) {
        this.botaoTerreo = botaoTerreo;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public boolean isSubindo() {
        return subindo;
    }

    public void setSubindo(boolean subindo) {
        this.subindo = subindo;
    }

    public boolean isDescendo() {
        return descendo;
    }

    public void setDescendo(boolean descendo) {
        this.descendo = descendo;
    }
    
    public Trilha getTrilha() {
        return trilha;
    }

    public void setTrilha(Trilha trilha) {
        this.trilha = trilha;
    }

    public float getPeso() {
        return peso;
    }

    public boolean setPeso(float peso) {
        if(this.peso + peso > this.capacidade) {
            return false;
        }
        this.peso += peso;
        return true;
    }
    
    public void setMusicaElevador(String musica){
        System.out.println("Estamos tocando no momento " + musica);
    }
    
    public void moveElevador(int andarDestino, int trilha) throws InterruptedException {
        this.ocupado = true;
        new Thread() {
            @Override
            public void run() {
                int tempo = (int)Math.abs(andarDestino - andarAtual);
                
                if ((andarDestino - andarAtual) > 0) setSubindo(true); //Seta as variáveis de direção
                else setDescendo(true);
                
                try {
                    for(int i=0;i<tempo;i++){ //Altera o andar atual
                        sleep(2000);
                        andarAtual++;
                    }
                    System.out.print("Elevador " + trilha + " chegou ao andar " + andarDestino);
                    abrePortaElevador();
                    sleep(3000);
                    fechaPortaElevador();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Elevador.class.getName()).log(Level.SEVERE, null, ex);
                }
                ocupado = false;
                
                if(isSubindo()) setSubindo(false); //Reseta as variáveis de direção
                else setDescendo(false);
            }
        }.start();
        
    }
    
    public void abrePortaElevador() {
        System.out.println("Abrindo portas...");
    }
    
    public void fechaPortaElevador() {
        System.out.println("Fechando portas...");
    }

}
