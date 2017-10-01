/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Credencial {
    private ArrayList<ArrayList<String>> credenciaisValidas;
    private int numeroDePisos;
    
    /**Construtor da classe.
     * 
     * @param numeroDePisos 
     */
    public Credencial(int numeroDePisos){
        this.numeroDePisos = numeroDePisos;
        credenciaisValidas = new ArrayList();
        for(int i=0; i <=  numeroDePisos; i++){
            credenciaisValidas.add(new ArrayList<String>());
        
        }
        //IMPORTANTE !v!
        //credenciaisValidas.get(numeroDePisos).get(i);
    }
    
    /** Verifica se o piso precisa de credenciais.
     * 
     * @param piso
     * @return 
     */
    public boolean needCredential(int piso){
        if(credenciaisValidas.get(piso).isEmpty()) return false;
        return true;        
    }
    
    /** Lê a credencial.
     * 
     * @return 
     */
    public String readCredential(){      
        String credential = (JOptionPane.showInputDialog("Insira a credencial:"));
        return credential;
    }
    
    /**Verifica se a credencial é válida
     * 
     * @param piso
     * @param credencial
     * @return 
     */
    public boolean isValid(int piso, String credencial){
        //Não entrou aqui
        if(piso > this.numeroDePisos || piso < 0)
            System.out.println("Piso Inválido");
        
        Iterator it = credenciaisValidas.get(piso).iterator();
        while(it.hasNext()){
            String a =  (String)it.next();
            if(a.equals(credencial)) return true;
        }
        if(credenciaisValidas.get(piso).isEmpty()) return true;
        
        JOptionPane.showMessageDialog(null, "Credencial Inválida!!");;
        
        return false;
    }
    
    /**Adiciona a credencial à array de credenciais.
     * 
     * @param piso
     * @param credencial
     * @return 
     */
    public boolean novaCredencial(int piso, String credencial) {
        try {
            credenciaisValidas.get(piso).add(credencial);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
