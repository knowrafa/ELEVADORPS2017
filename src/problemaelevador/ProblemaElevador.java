/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaelevador;

/**
 *
 * @author aluno
 */
public class ProblemaElevador {

    public static void main(String[] args) {
        int numeroDePisos = 10;
        Credencial credenciais = new Credencial(numeroDePisos);
        
        //credenciais.novaCredencial(int andar, String credencial);
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
        Edificio edificio = new Edificio("INF Prédio 2", "Câmpus Samambaia", numeroDePisos, credenciais );
        
               
    }
    
}
