/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael FalcÃ£o
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
        //Instanciando o novo EdifÃ­cio.
        
        Edificio edificio = new Edificio("INF PrÃ©dio 2", "CÃ¢mpus Samambaia", numeroDePisos, quantidadeTrilhas, credenciais, pesoMax );
        
        //edificio.setMusicInElevator(1, "Horse with no name");
        //edificio.setMusicInElevator(2, "Alegro");
        edificio.setMusicInElevator(3, "InquietaÃ§Ã£o");
        //edificio.setMusicInElevator(4, "Young Folks");
        //edificio.setMusicInElevator(5, "El Fuego");
        
        for(int i=0; i < 2; i++){
            String temporary = JOptionPane.showInputDialog("Qual o Piso Atual?");
            if(temporary.equals("")){
                JOptionPane.showMessageDialog(null, "Inválido!\nPrograma sendo encerrado...");
                return ;
            }
            int numPisoAtual = Integer.parseInt(temporary);
            
            temporary = JOptionPane.showInputDialog("Qual o Piso Atual?");
            if(temporary.equals("")){
                JOptionPane.showMessageDialog(null, "Inválido!\nPrograma sendo encerrado...");
                return ;
            }
            int numPisoDesejado = Integer.parseInt(temporary);
            
            edificio.acessElevatorAt(numPisoAtual, numPisoDesejado);
        }
        
        return ;
        
    }
    
}
