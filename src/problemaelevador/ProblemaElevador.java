/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProblemaElevador {

    public static void main(String[] args){
        int numeroDePisos = 10;
        int quantidadeTrilhas = 5;
        float pesoMax = 800;
        Credencial credenciais = new Credencial(numeroDePisos);
        
        credenciais.novaCredencial(1, "abc");
        credenciais.novaCredencial(1, "bca");
        credenciais.novaCredencial(1, "cab");
        credenciais.novaCredencial(2, "aaa");
        credenciais.novaCredencial(2, "bbb");
        credenciais.novaCredencial(3, "ccc");
        credenciais.novaCredencial(3, "ddd");
        credenciais.novaCredencial(3, "ccd");
        credenciais.novaCredencial(4, "ddc");
        credenciais.novaCredencial(4, "eee");
        credenciais.novaCredencial(4, "eee");
        credenciais.novaCredencial(5, "fff");
        credenciais.novaCredencial(5, "ffe");
        credenciais.novaCredencial(6, "fee");
        //Instanciando o novo Edifício.
        
        Edificio edificio = new Edificio("INF Prédio 2", "Câmpus Samambaia", numeroDePisos, quantidadeTrilhas, credenciais, pesoMax );
        
        //edificio.setMusicInElevator(1, "Horse with no name");
        //edificio.setMusicInElevator(2, "Alegro");
        edificio.setMusicInElevator(3, "Inquietação");
        //edificio.setMusicInElevator(4, "Young Folks");
        //edificio.setMusicInElevator(5, "El Fuego");
        
        
        int numPisoAtual = Integer.parseInt(JOptionPane.showInputDialog("Qual o Piso Atual?"));
        int numPisoDesejado = Integer.parseInt(JOptionPane.showInputDialog("Qual o Piso Desejado?"));
        
        edificio.acessElevatorAt(numPisoAtual, numPisoDesejado);
        return ;
        
    }
    
}
