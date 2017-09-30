/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProblemaElevador {

    public static void main(String[] args) {
        int numeroDePisos = 10;
        int quantidadeTrilhas = 5;
        float pesoMax = 800;
        Credencial credenciais = new Credencial(numeroDePisos);
        System.out.println("AQUI1");
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
        System.out.println("AQUI3");
        Edificio edificio = new Edificio("INF Prédio 2", "Câmpus Samambaia", numeroDePisos, quantidadeTrilhas, credenciais, pesoMax );
        System.out.println("AQUI2");
        edificio.setMusicInElevator(1, "Horse with no name");
        edificio.setMusicInElevator(2, "Alegro");
        edificio.setMusicInElevator(3, "Inquietação");
        edificio.setMusicInElevator(4, "Young Folks");
        edificio.setMusicInElevator(5, "El Fuego");
        
        Scanner read = new Scanner(System.in);
        
        int numPiso = Integer.parseInt(JOptionPane.showInputDialog("Qual o Piso?"));
        
    }
    
}
