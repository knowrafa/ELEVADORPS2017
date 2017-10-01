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
    
    public Credencial(int numeroDePisos){
        this.numeroDePisos = numeroDePisos;
        credenciaisValidas = new ArrayList();
        for(int i=0; i <=  numeroDePisos; i++){
            credenciaisValidas.add(new ArrayList<String>());
        
        }
        //IMPORTANTE !v!
        //credenciaisValidas.get(numeroDePisos).get(i);
    }

    public boolean needCredential(int piso){
        if(credenciaisValidas.get(piso).isEmpty()) return false;
        return true;        
    }
    
    public String readCredential(){      
        String credential = (JOptionPane.showInputDialog("Insira a credencial:"));
        return credential;
    }
    
    
    public boolean isValid(int piso, String credencial){
        
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
