package problemaelevador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Elevador {
    private float capacidade;
    private boolean botaoTerreo;
    private int andarAtual;
    private boolean ocupado;
    private boolean subindo;
    private Trilha trilha;
    private float peso;
    
    public Elevador(float capacidade, Trilha trilha){
        this.capacidade=capacidade;
        setTrilha(trilha);
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
    } public Elevador(float capacidade){
        this.capacidade=capacidade;
    }

    public boolean isSubindo() {
        return subindo;
    }

    public void setSubindo(boolean subindo) {
        this.subindo = subindo;
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

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void setMusicaElevador(String musica){
        System.out.println("Estamos tocando no momento" + musica);
    }
    
    
}
