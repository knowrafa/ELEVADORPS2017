package problemaelevador;

import java.util.Vector;

/**
 *
 * @author Arnold Lima, Rafael Alessandro e Rafael Falcão
 */
public class Piso {
    private boolean ledSobe;
    private boolean ledDesce;
    private int numeroPiso;
    private boolean needCredencial;
    private Painel painel;
  
    /** Construtor do Piso, onde recebe um painel e o seu número.
     * 
     * @param numeroPiso
     * @param novoPainel 
     */
    public Piso(int numeroPiso, Painel novoPainel){
        this.numeroPiso = numeroPiso;
        painel = novoPainel;
    }
    
    /**Método utilizado para acessar o painel de um certo piso da main.
     * 
     * @return 
     */
    public Trilha callPainel(int pisoAtual, int pisoDestino){
        //NÃO ENTROU AQUI;
        return painel.chamaElevador(pisoAtual, pisoDestino);
        
    }
    
    public boolean isLedSobe() {
        return ledSobe;
    }

    public void setLedSobe(boolean ledSobe) {
        this.ledSobe = ledSobe;
    }

    public boolean isLedDesce() {
        return ledDesce;
    }

    public void setLedDesce(boolean ledDesce) {
        this.ledDesce = ledDesce;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public boolean isCredencial() {
        return needCredencial;
    }

    public void setCredencial(boolean credencial) {
        this.needCredencial = credencial;
    }
    
    public Painel getPainel() {
        return painel;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }
    
}
